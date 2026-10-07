# GOF2 web — порт ресурсов J2ME → браузер

Three.js + Vite + TypeScript. Модели сконвертированы из M3G в GLB, данные — из `.bin`/`.lang` в JSON.

## Запуск
```
npm install
npm run dev        # http://localhost:5173 — просмотрщик всех 192 моделей
npm run build
```

## Что внутри
| Путь | Что |
|---|---|
| `public/models/*.glb` | 145 моделей из .jar + 47 заглушек |
| `public/models/models.json` | manifest: размеры, bbox, вершины/треугольники, флаг `placeholder` |
| `public/data/*.json` | systems, stations, ships, items, agents, ship_parts, station_parts, names, lang_ru |
| `src/assets.ts` | `loadManifest`, `loadModel(key)`, `loadGameData()` + типы |
| `src/audio.ts` | аудио-менеджер (звука в архиве нет, пропускает отсутствующие файлы) |
| `src/main.ts` | просмотрщик моделей |
| `tools/m3g2glb.py` | конвертер M3G→GLB (перезапуск: `npm run convert:models`) |
| `tools/extract_data.py` | экстрактор данных (`npm run convert:data`) |
| `tools/expected_models.txt` | какие .m3g ожидает код игры |

Ключ модели в manifest = имя из кода без `.m3g` (например `ship_04_[13005]`), а имя файла
очищено от скобок (`ship_04_13005.glb`).

## Результаты проверки
- 145/145 .m3g валидны, все 192 .glb загружаются независимым загрузчиком (trimesh), треугольники совпадают.
- 21/21 файлов данных прочитаны точно до конца (формат DataInputStream подтверждён кодом).
- Текстуры моделей — палитры 2×2 (все оттенки серого), вшиты в GLB (NEAREST/REPEAT).

## Чего нет в архиве
- **Звук:** 14 `.wav` и 5 `.mid` (имена в `src/audio.ts`). MIDI в браузере не играет — нужен .ogg/.mp3 в `public/sound/`.
- **Модели (47):** `ship_tb_00..16`, ~28 `ship_NN_[130xx]`, `orbit`, `planet_sun`, `void_station`, `ship_0`
  — заменены заглушками; `boost_cyan/orange/white` — перекрашенные копии `boost_green`.
- **UI-картинки:** `fishlabs.png`, `font_g/r/void.png`, `nebula*.png`.
- `stat_conector0.m3g` (опечатка) — дубликат `stat_connector0.m3g`.

## Форматы данных (big-endian, DataInputStream)
- `ru.lang`: подряд `[u16 длина][байты cp1251]`
- `ships.bin`: 37×9 int; `stations.bin`: 100×(UTF + 4 int); `systems.bin`: 22 записи;
  `agents.bin`: 16 записей; `items.bin`: 176×3 массива int (третий — пары ключ/значение);
  `names_*.bin`: int N + N×UTF.
- Смысл части числовых полей известен только по использованию в обфусцированном коде — они названы `f0…`.
