#!/usr/bin/env python3
"""
extract_data.py — достаёт данные игры (data/txt/*.bin, data/lang/ru/ru.lang) в JSON.

Форматы взяты из декомпилированного кода (классы bl и dn): всё читается через
java.io.DataInputStream (big-endian), строки — readUTF (u16 длина + modified UTF-8).
Каждый файл проверяется: парсер обязан дойти ровно до конца файла.

Использование:
  python3 extract_data.py <папка_data> <папка_вывода>
  (папка_data — та, где лежат txt/ и lang/)

Названия полей: где смысл подтверждается кодом — осмысленные, остальное — f0, f1…
(честно: смысл части числовых полей известен только по использованию в обфусцированном коде).
"""
import json
import os
import re
import struct
import sys


class DIS:
    """Аналог java.io.DataInputStream поверх bytes."""

    def __init__(self, b):
        self.b, self.o = b, 0

    def left(self):
        return len(self.b) - self.o

    def _u(self, fmt, n):
        v = struct.unpack_from('>' + fmt, self.b, self.o)[0]
        self.o += n
        return v

    def byte(self): return self._u('b', 1)
    def short(self): return self._u('h', 2)
    def int(self): return self._u('i', 4)
    def ints(self, n): return [self.int() for _ in range(n)]

    def utf(self):
        n = self._u('H', 2)
        raw = self.b[self.o:self.o + n]
        self.o += n
        return raw.decode('utf-8', errors='surrogatepass').replace('\ud800', '')


def read_stations(b):
    d, out = DIS(b), []
    for i in range(100):
        name = d.utf()
        f = d.ints(4)
        out.append({'id': i, 'name': name, 'f0': f[0], 'f1': f[1], 'f2': f[2], 'f3': f[3]})
    return out, d


def read_systems(b):
    d, out = DIS(b), []
    for i in range(22):
        name = d.utf()
        f0 = d.int()
        flag = d.int() == 1
        nums = d.ints(6)
        pos = d.ints(d.int())            # координаты на карте (x, y, z)
        stations = d.ints(d.int())       # id станций (индексы в stations.json)
        n = d.int()
        extra_a = d.ints(n) if n > 0 else []
        n = d.int()
        extra_b = d.ints(n) if n > 0 else []
        out.append({'id': i, 'name': name, 'f0': f0, 'flag': flag,
                    'nums': nums, 'pos': pos, 'stations': stations,
                    'extra_a': extra_a, 'extra_b': extra_b})
    return out, d


def read_agents(b):
    d, out = DIS(b), []
    for i in range(16):
        name = d.utf()
        ints = d.ints(8)                 # n3..n10 из кода; ints[4] — флаг (==1)
        n = d.int()
        blob = [d.byte() & 0xFF for _ in range(n)] if n > 0 else []
        out.append({'index': i, 'name': name, 'id': ints[0], 'f1': ints[1], 'f2': ints[2],
                    'f3': ints[3], 'flag': ints[4] == 1, 'f5': ints[5], 'f6': ints[6],
                    'f7': ints[7], 'blob': blob})
    return out, d


def read_items(b):
    d, out = DIS(b), []
    for i in range(176):
        arrs = []
        for _ in range(3):
            n = d.int()
            arrs.append(d.ints(n) if n > 0 else [])
        # третий массив в коде читается как пары (ключ, значение): c[1], c[3], c[5]...
        attrs = arrs[2]
        pairs = [[attrs[k], attrs[k + 1]] for k in range(0, len(attrs) - 1, 2)]
        out.append({'id': i, 'arr_a': arrs[0], 'arr_b': arrs[1], 'attrs_raw': attrs, 'attrs': pairs})
    return out, d


def read_ships(b):
    d, out = DIS(b), []
    for i in range(37):
        v = d.ints(9)
        out.append({'id': i, 'f0': v[0], 'f1': v[1], 'f2': v[2], 'f3': v[3],
                    'slots': v[4:8],            # 4 числа слотов (сумма = размер массива оборудования)
                    'scale': v[8] / 100.0})     # в коде: f2 / 100.0f
    return out, d


def read_shipparts(b):
    d, out = DIS(b), []
    for _ in range(37):
        if d.left() == 0:
            break
        rid = d.byte()
        cnt = d.byte()
        parts = []
        for _ in range(cnt):
            s0 = d.short()
            x, y, z = d.int(), d.int(), d.int()
            r = [d.short() for _ in range(6)]
            parts.append({'model': s0, 'pos': [x, y, z], 'r': r})
        out.append({'ship_id': rid - 1, 'raw_id': rid, 'parts': parts})
    return out, d


def read_stationparts(b):
    d, out = DIS(b), []
    for _ in range(101):
        if d.left() == 0:
            break
        rid = d.byte()
        head = d.short()
        cnt = d.byte()
        parts = []
        for _ in range(cnt):
            s0 = d.short()
            x, y, z = d.int(), d.int(), d.int()
            r = [d.short() for _ in range(3)]
            parts.append({'model': s0, 'pos': [x, y, z], 'r': r})
        out.append({'raw_id': rid, 'station_type': rid - 1, 'head': head, 'parts': parts})
    return out, d


def read_names(b):
    d = DIS(b)
    n = d.int()
    return [d.utf() for _ in range(n)], d


READERS = {
    'stations.bin': ('stations.json', read_stations),
    'systems.bin': ('systems.json', read_systems),
    'agents.bin': ('agents.json', read_agents),
    'items.bin': ('items.json', read_items),
    'ships.bin': ('ships.json', read_ships),
    'shipparts_jsr.bin': ('ship_parts.json', read_shipparts),
    'stationparts.bin': ('station_parts.json', read_stationparts),
}


def read_lang(b):
    """ru.lang: подряд записи [u16 длина][байты]. Кодировка cp1251 (код игры сдвигает 192..255 на +848)."""
    out, o = [], 0
    while o + 2 <= len(b):
        n = (b[o] << 8) | b[o + 1]
        o += 2
        if o + n > len(b):
            break
        out.append(b[o:o + n].decode('cp1251', errors='replace'))
        o += n
    return out, len(b) - o


def main():
    if len(sys.argv) < 3:
        print(__doc__)
        sys.exit(1)
    src, dst = sys.argv[1], sys.argv[2]
    os.makedirs(dst, exist_ok=True)
    report, ok_all = [], True
    txt = os.path.join(src, 'txt')

    for fn, (outname, fn_read) in READERS.items():
        b = open(os.path.join(txt, fn), 'rb').read()
        data, d = fn_read(b)
        left = d.left()
        ok_all &= (left == 0)
        json.dump(data, open(os.path.join(dst, outname), 'w', encoding='utf-8'), ensure_ascii=False, indent=1)
        report.append((fn, len(b), len(data), left))

    names = {}
    for fn in sorted(os.listdir(txt)):
        if fn.startswith('names_'):
            b = open(os.path.join(txt, fn), 'rb').read()
            data, d = read_names(b)
            ok_all &= (d.left() == 0)
            names[fn[:-4]] = data
            report.append((fn, len(b), len(data), d.left()))
    json.dump(names, open(os.path.join(dst, 'names.json'), 'w', encoding='utf-8'), ensure_ascii=False, indent=1)

    lang_path = os.path.join(src, 'lang', 'ru', 'ru.lang')
    if os.path.exists(lang_path):
        b = open(lang_path, 'rb').read()
        strings, tail = read_lang(b)
        json.dump(strings, open(os.path.join(dst, 'lang_ru.json'), 'w', encoding='utf-8'), ensure_ascii=False, indent=0)
        report.append(('ru.lang', len(b), len(strings), tail))
        ok_all &= (tail == 0)

    print(f"{'файл':26}{'байт':>8}{'записей':>9}{'остаток':>9}")
    for r in report:
        print(f'{r[0]:26}{r[1]:>8}{r[2]:>9}{r[3]:>9}', '' if r[3] == 0 else '  <-- НЕ ДО КОНЦА')
    print('\nВСЕ ФАЙЛЫ ПРОЧИТАНЫ ТОЧНО ДО КОНЦА' if ok_all else '\nЕСТЬ НЕСООТВЕТСТВИЯ ФОРМАТА')


if __name__ == '__main__':
    main()
