#!/usr/bin/env python3
"""
m3g2glb.py — конвертер M3G (JSR-184, J2ME) -> GLB (glTF 2.0 binary).

Что делает:
  * разбирает все .m3g из папки (Group/Mesh/VertexBuffer/VertexArray/TriangleStripArray/
    Appearance/Material/PolygonMode/Texture2D/Image2D), сохраняет иерархию узлов и трансформы;
  * вшивает текстуры (в этой игре это палитры 2x2, UV адресуют цвета) — sampler NEAREST/REPEAT;
  * для моделей, на которые ссылается код, но которых нет в папке (expected_models.txt),
    генерирует заглушки (помечены placeholder=true в manifest);
  * пишет models.json (manifest): размеры, bbox, число вершин/треугольников.

Использование:
  python3 m3g2glb.py <папка_с_m3g> <папка_вывода> [expected_models.txt]

Зависимости: numpy, pillow.
Единицы: координаты остаются «как в M3G» (int16-единицы * scale). Масштаб для движка — в loader.
"""
import io
import json
import math
import os
import struct
import sys
import zlib

import numpy as np
from PIL import Image

MAGIC = b'\xabJSR184\xbb\r\n\x1a\n'

# ----------------------------------------------------------------------------
# Чтение M3G
# ----------------------------------------------------------------------------


class Rd:
    def __init__(self, d, o=0):
        self.d = d
        self.o = o

    def u8(self):
        v = self.d[self.o]
        self.o += 1
        return v

    def s8(self):
        v = struct.unpack_from('<b', self.d, self.o)[0]
        self.o += 1
        return v

    def u16(self):
        v = struct.unpack_from('<H', self.d, self.o)[0]
        self.o += 2
        return v

    def u32(self):
        v = struct.unpack_from('<I', self.d, self.o)[0]
        self.o += 4
        return v

    def f32(self):
        v = struct.unpack_from('<f', self.d, self.o)[0]
        self.o += 4
        return v

    def f3(self):
        return [self.f32() for _ in range(3)]

    def raw(self, n):
        v = self.d[self.o:self.o + n]
        self.o += n
        return v


def load_objects(b):
    if b[:12] != MAGIC:
        raise ValueError('не M3G (неверная сигнатура)')
    pos, objs = 12, []
    while pos + 13 <= len(b):
        comp = b[pos]
        tl, _ul = struct.unpack_from('<II', b, pos + 1)
        data = b[pos + 9:pos + tl - 4]
        if comp == 1:
            data = zlib.decompress(data)
        pos += tl
        p = 0
        while p + 5 <= len(data):
            t = data[p]
            ln = struct.unpack_from('<I', data, p + 1)[0]
            objs.append((t, data[p + 5:p + 5 + ln]))
            p += 5 + ln
    return objs  # индекс объекта в M3G = позиция + 1 (заголовок = 1)


def skip_o3(r):
    r.u32()                      # userID
    n = r.u32()
    r.o += 4 * n                 # animation tracks
    n = r.u32()
    for _ in range(n):           # user parameters
        r.u32()
        ln = r.u32()
        r.o += ln


def read_transformable(r):
    T, S, Q, M = [0.0, 0.0, 0.0], [1.0, 1.0, 1.0], [0.0, 0.0, 0.0, 1.0], None
    if r.u8():
        T = r.f3()
        S = r.f3()
        ang = r.f32()
        ax = r.f3()
        n = math.sqrt(sum(a * a for a in ax))
        if n > 1e-9 and abs(ang) > 1e-9:
            h = math.radians(ang) / 2
            s = math.sin(h) / n
            Q = [ax[0] * s, ax[1] * s, ax[2] * s, math.cos(h)]
    if r.u8():
        M = [r.f32() for _ in range(16)]
    return T, S, Q, M


def read_node(r):
    r.u8()   # enableRendering
    r.u8()   # enablePicking
    r.u8()   # alphaFactor
    r.u32()  # scope
    if r.u8():  # alignment
        r.u8()
        r.u8()
        r.u32()
        r.u32()


def wrap_int(a, bits):
    m = 1 << bits
    h = m >> 1
    return (((a.astype(np.int64) + h) % m) - h)


def read_vertex_array(objs, idx):
    t, d = objs[idx - 1]
    assert t == 20, f'объект {idx} не VertexArray'
    r = Rd(d)
    skip_o3(r)
    cs, nc, enc = r.u8(), r.u8(), r.u8()
    n = r.u16()
    dt = np.int8 if cs == 1 else np.int16
    cnt = n * nc
    arr = np.frombuffer(r.raw(cnt * cs), dtype=dt).reshape(n, nc).astype(np.int64)
    if enc == 1:  # delta
        arr = wrap_int(np.cumsum(arr, axis=0), 8 * cs)
    return arr, cs


def strip_triangles(objs, idx, flip):
    t, d = objs[idx - 1]
    assert t == 11, f'объект {idx} не TriangleStripArray'
    r = Rd(d)
    skip_o3(r)
    enc = r.u8()
    explicit = None
    first = 0
    if enc == 0:
        first = r.u32()
    elif enc == 1:
        first = r.u8()
    elif enc == 2:
        first = r.u16()
    else:
        n = r.u32()
        rd = {128: r.u32, 129: r.u8, 130: r.u16}[enc]
        explicit = [rd() for _ in range(n)]
    ns = r.u32()
    lens = [r.u32() for _ in range(ns)]
    total = sum(lens)
    idxs = explicit if explicit is not None else list(range(first, first + total))
    tris, p = [], 0
    for ln in lens:
        s = idxs[p:p + ln]
        p += ln
        for i in range(ln - 2):
            a, b, c = (s[i], s[i + 1], s[i + 2]) if i % 2 == 0 else (s[i + 1], s[i], s[i + 2])
            if a == b or b == c or a == c:
                continue
            tris.append((a, c, b) if flip else (a, b, c))
    return np.array(tris, dtype=np.uint32).reshape(-1, 3)


def decode_image(objs, idx, recolor=None):
    t, d = objs[idx - 1]
    assert t == 10
    r = Rd(d)
    skip_o3(r)
    fmt, mut = r.u8(), r.u8()
    w, h = r.u32(), r.u32()
    bpp = {96: 1, 97: 1, 98: 2, 99: 3, 100: 4}[fmt]
    if mut:
        data = np.full((w * h, bpp), 255, np.uint8)
    else:
        pl = r.u32()
        pal = r.raw(pl) if pl else b''
        dl = r.u32()
        px = r.raw(dl)
        if pl:
            ids = np.frombuffer(px, np.uint8)[:w * h]
            data = np.frombuffer(pal, np.uint8).reshape(-1, bpp)[ids]
        else:
            data = np.frombuffer(px, np.uint8)[:w * h * bpp].reshape(w * h, bpp)
    if fmt == 99:
        rgba = np.concatenate([data, np.full((w * h, 1), 255, np.uint8)], 1)
    elif fmt == 100:
        rgba = data
    elif fmt == 97:
        rgba = np.concatenate([np.repeat(data, 3, 1), np.full((w * h, 1), 255, np.uint8)], 1)
    elif fmt == 98:
        rgba = np.concatenate([np.repeat(data[:, :1], 3, 1), data[:, 1:2]], 1)
    else:  # ALPHA
        rgba = np.concatenate([np.full((w * h, 3), 255, np.uint8), data], 1)
    rgba = rgba.reshape(h, w, 4).copy()
    if recolor is not None:
        rgba[..., 0], rgba[..., 1], rgba[..., 2] = recolor
    bio = io.BytesIO()
    Image.fromarray(rgba, 'RGBA').save(bio, 'PNG')
    return bio.getvalue(), rgba.reshape(-1, 4).tolist(), (w, h)


# ----------------------------------------------------------------------------
# Сборка glTF
# ----------------------------------------------------------------------------


class GB:
    def __init__(self):
        self.blob = bytearray()
        self.bvs, self.accs, self.mats, self.texs = [], [], [], []
        self.imgs, self.smps, self.meshes, self.nodes = [], [], [], []
        self._mk, self._sk, self._ik = {}, {}, {}

    def _pad(self):
        while len(self.blob) % 4:
            self.blob.append(0)

    def bufview(self, data, target=None):
        self._pad()
        off = len(self.blob)
        self.blob += data
        v = {'buffer': 0, 'byteOffset': off, 'byteLength': len(data)}
        if target:
            v['target'] = target
        self.bvs.append(v)
        return len(self.bvs) - 1

    def accessor(self, arr, target=None, minmax=False, normalized=False):
        arr = np.ascontiguousarray(arr)
        ct = {np.dtype(np.float32): 5126, np.dtype(np.uint16): 5123,
              np.dtype(np.uint32): 5125, np.dtype(np.uint8): 5121}[arr.dtype]
        comps = arr.shape[1] if arr.ndim == 2 else 1
        a = {'bufferView': self.bufview(arr.tobytes(), target), 'componentType': ct,
             'count': int(arr.shape[0]), 'type': {1: 'SCALAR', 2: 'VEC2', 3: 'VEC3', 4: 'VEC4'}[comps]}
        if minmax:
            a['min'] = [float(x) for x in arr.min(0)]
            a['max'] = [float(x) for x in arr.max(0)]
        if normalized:
            a['normalized'] = True
        self.accs.append(a)
        return len(self.accs) - 1

    def material(self, key, mat):
        if key not in self._mk:
            self.mats.append(mat)
            self._mk[key] = len(self.mats) - 1
        return self._mk[key]

    def texture(self, png, wrap_s=10497, wrap_t=10497, mag=9728, mn=9728):
        ik = hash(png)
        if ik not in self._ik:
            self.imgs.append({'bufferView': self.bufview(png), 'mimeType': 'image/png'})
            self._ik[ik] = len(self.imgs) - 1
        sk = (wrap_s, wrap_t, mag, mn)
        if sk not in self._sk:
            self.smps.append({'magFilter': mag, 'minFilter': mn, 'wrapS': wrap_s, 'wrapT': wrap_t})
            self._sk[sk] = len(self.smps) - 1
        self.texs.append({'sampler': self._sk[sk], 'source': self._ik[ik]})
        return len(self.texs) - 1

    def add_node(self, name, mesh=None, children=None, T=None, Q=None, S=None, M=None):
        n = {'name': name}
        if mesh is not None:
            n['mesh'] = mesh
        if children:
            n['children'] = children
        if M is not None:
            n['matrix'] = M
        else:
            if T and any(abs(x) > 0 for x in T):
                n['translation'] = [float(x) for x in T]
            if Q and (abs(Q[0]) + abs(Q[1]) + abs(Q[2]) > 0):
                n['rotation'] = [float(x) for x in Q]
            if S and any(abs(x - 1) > 1e-7 for x in S):
                n['scale'] = [float(x) for x in S]
        self.nodes.append(n)
        return len(self.nodes) - 1

    def finish(self, roots, extras=None):
        j = {'asset': {'version': '2.0', 'generator': 'm3g2glb.py'},
             'scene': 0, 'scenes': [{'nodes': roots}],
             'nodes': self.nodes, 'meshes': self.meshes,
             'accessors': self.accs, 'bufferViews': self.bvs,
             'buffers': [{'byteLength': len(self.blob) + (-len(self.blob) % 4)}]}
        for k, v in (('materials', self.mats), ('textures', self.texs),
                     ('images', self.imgs), ('samplers', self.smps)):
            if v:
                j[k] = v
        if extras:
            j['scenes'][0]['extras'] = extras
        js = json.dumps(j, separators=(',', ':')).encode()
        js += b' ' * (-len(js) % 4)
        self._pad()
        bn = bytes(self.blob)
        total = 12 + 8 + len(js) + 8 + len(bn)
        return (struct.pack('<III', 0x46546C67, 2, total) +
                struct.pack('<II', len(js), 0x4E4F534A) + js +
                struct.pack('<II', len(bn), 0x004E4942) + bn)


def trs_matrix(T, S, Q, M):
    if M is not None:
        return np.array(M, dtype=np.float64).reshape(4, 4)
    x, y, z, w = Q
    R = np.array([[1 - 2 * (y * y + z * z), 2 * (x * y - z * w), 2 * (x * z + y * w)],
                  [2 * (x * y + z * w), 1 - 2 * (x * x + z * z), 2 * (y * z - x * w)],
                  [2 * (x * z - y * w), 2 * (y * z + x * w), 1 - 2 * (x * x + y * y)]])
    m = np.eye(4)
    m[:3, :3] = R * np.array(S)[None, :]
    m[:3, 3] = T
    return m


# ----------------------------------------------------------------------------
# Конвертация одного .m3g
# ----------------------------------------------------------------------------


def convert_m3g(path, recolor=None):
    objs = load_objects(open(path, 'rb').read())
    G = GB()
    vb_cache, mesh_cache, mat_cache = {}, {}, {}
    info = {'vertices': 0, 'triangles': 0, 'meshes': 0, 'colors': []}
    bb = [np.full(3, np.inf), np.full(3, -np.inf)]

    def vb_attrs(idx):
        if idx in vb_cache:
            return vb_cache[idx]
        t, d = objs[idx - 1]
        assert t == 21
        r = Rd(d)
        skip_o3(r)
        r.u32()  # default color
        pos, bias, scale = r.u32(), r.f3(), r.f32()
        nrm, col, ntc = r.u32(), r.u32(), r.u32()
        tcs = [(r.u32(), r.f3(), r.f32()) for _ in range(ntc)]
        p, _ = read_vertex_array(objs, pos)
        P = (p.astype(np.float64) * scale + np.array(bias)).astype(np.float32)
        out = {'POSITION': P}
        if nrm:
            n, cs = read_vertex_array(objs, nrm)
            n = n.astype(np.float64) / (127.0 if cs == 1 else 32767.0)
            ln = np.linalg.norm(n, axis=1, keepdims=True)
            ln[ln == 0] = 1
            out['NORMAL'] = (n / ln).astype(np.float32)
        if tcs:
            a, tb, ts = tcs[0]
            uv, _ = read_vertex_array(objs, a)
            out['TEXCOORD_0'] = (uv[:, :2].astype(np.float64) * ts + np.array(tb[:2])).astype(np.float32)
        if col:
            c, cs = read_vertex_array(objs, col)
            out['COLOR_0'] = (c.astype(np.int64) & 0xFF).astype(np.uint8)
        vb_cache[idx] = out
        return out

    def appearance(idx):
        if idx in mat_cache:
            return mat_cache[idx]
        t, d = objs[idx - 1]
        r = Rd(d)
        skip_o3(r)
        r.s8()
        _comp, _fog, poly, mat, nt = r.u32(), r.u32(), r.u32(), r.u32(), r.u32()
        texs = [r.u32() for _ in range(nt)]
        flip, double = False, False
        if poly:
            pr = Rd(objs[poly - 1][1])
            skip_o3(pr)
            cull, _shade, wind, two = pr.u8(), pr.u8(), pr.u8(), pr.u8()
            flip = (wind == 169)
            double = bool(two) or cull == 162
        m = {'pbrMetallicRoughness': {'metallicFactor': 0.0, 'roughnessFactor': 1.0}}
        if double:
            m['doubleSided'] = True
        if mat:
            mr = Rd(objs[mat - 1][1])
            skip_o3(mr)
            mr.raw(3)
            dif = mr.raw(4)
            emi = mr.raw(3)
            m['pbrMetallicRoughness']['baseColorFactor'] = [round(x / 255, 4) for x in dif]
            if any(emi):
                m['emissiveFactor'] = [round(x / 255, 4) for x in emi]
        if texs:
            tr = Rd(objs[texs[0] - 1][1])
            skip_o3(tr)
            read_transformable(tr)
            img = tr.u32()
            tr.raw(3)
            tr.u8()
            ws, wt, _lf, imf = tr.u8(), tr.u8(), tr.u8(), tr.u8()
            png, cols, _sz = decode_image(objs, img, recolor)
            info['colors'] = [('#%02x%02x%02x' % tuple(c[:3])) for c in cols]
            if any(c[3] < 255 for c in cols):
                m['alphaMode'] = 'BLEND'
            flt = 9728 if imf == 211 else 9729
            ti = G.texture(png, 33071 if ws == 240 else 10497, 33071 if wt == 240 else 10497, flt, flt)
            m['pbrMetallicRoughness']['baseColorTexture'] = {'index': ti}
        res = (G.material(('app', idx), m), flip)
        mat_cache[idx] = res
        return res

    def build_mesh(idx):
        if idx in mesh_cache:
            return mesh_cache[idx]
        t, d = objs[idx - 1]
        r = Rd(d)
        skip_o3(r)
        read_transformable(r)
        read_node(r)
        vb = r.u32()
        ns = r.u32()
        attrs = vb_attrs(vb)
        accs = {}
        for k, v in attrs.items():
            accs[k] = G.accessor(v, 34962, minmax=(k == 'POSITION'), normalized=(k == 'COLOR_0'))
        prims = []
        for _ in range(ns):
            ib, ap = r.u32(), r.u32()
            mi, flip = appearance(ap)
            tri = strip_triangles(objs, ib, flip)
            if not len(tri):
                continue
            ind = tri.astype(np.uint16 if tri.max() < 65535 else np.uint32).reshape(-1)
            prims.append({'attributes': accs, 'indices': G.accessor(ind, 34963),
                          'material': mi, 'mode': 4})
            info['triangles'] += len(tri)
        G.meshes.append({'primitives': prims})
        mesh_cache[idx] = len(G.meshes) - 1
        return mesh_cache[idx]

    children_of = set()
    for t, d in objs:
        if t == 9:
            r = Rd(d)
            skip_o3(r)
            read_transformable(r)
            read_node(r)
            for _ in range(r.u32()):
                children_of.add(r.u32())

    def build_node(idx, parent_m):
        t, d = objs[idx - 1]
        r = Rd(d)
        skip_o3(r)
        T, S, Q, M = read_transformable(r)
        read_node(r)
        wm = parent_m @ trs_matrix(T, S, Q, M)
        mv = [float(x) for x in M] if M is not None else None
        if mv is not None:  # M3G row-major -> glTF column-major
            mv = np.array(mv).reshape(4, 4).T.flatten().tolist()
        if t == 14:
            mi = build_mesh(idx)
            info['meshes'] += 1
            P = vb_attrs(struct.unpack_from('<I', d, _vb_offset(d))[0])['POSITION']
            h = np.concatenate([P.astype(np.float64), np.ones((len(P), 1))], 1) @ wm.T
            bb[0] = np.minimum(bb[0], h[:, :3].min(0))
            bb[1] = np.maximum(bb[1], h[:, :3].max(0))
            return G.add_node(f'mesh_{idx}', mesh=mi, T=T, Q=Q, S=S, M=mv)
        n = r.u32()
        kids = [build_node(r.u32(), wm) for _ in range(n)]
        return G.add_node(f'group_{idx}', children=kids, T=T, Q=Q, S=S, M=mv)

    def _vb_offset(d):
        r = Rd(d)
        skip_o3(r)
        read_transformable(r)
        read_node(r)
        return r.o

    roots = [build_node(i + 1, np.eye(4)) for i, (t, _) in enumerate(objs)
             if t in (9, 14) and (i + 1) not in children_of]
    info['vertices'] = int(sum(len(a['POSITION']) for a in vb_cache.values()))
    if np.isfinite(bb[0]).all():
        info['bbox'] = [[round(float(x), 3) for x in bb[0]], [round(float(x), 3) for x in bb[1]]]
        info['size'] = [round(float(x), 3) for x in (bb[1] - bb[0])]
    return G.finish(roots), info


# ----------------------------------------------------------------------------
# Заглушки для отсутствующих моделей
# ----------------------------------------------------------------------------


def _flat(G, tris, color, name, emissive=0.0):
    tris = np.array(tris, dtype=np.float32).reshape(-1, 3, 3)
    n = np.cross(tris[:, 1] - tris[:, 0], tris[:, 2] - tris[:, 0])
    ln = np.linalg.norm(n, axis=1, keepdims=True)
    ln[ln == 0] = 1
    n = np.repeat(n / ln, 3, axis=0).astype(np.float32)
    P = tris.reshape(-1, 3)
    ind = np.arange(len(P), dtype=np.uint32 if len(P) > 65535 else np.uint16)
    m = {'pbrMetallicRoughness': {'baseColorFactor': [*color, 1.0], 'metallicFactor': 0.2, 'roughnessFactor': 0.8},
         'doubleSided': True}
    if emissive:
        m['emissiveFactor'] = [c * emissive for c in color]
    mi = G.material(('ph', name), m)
    G.meshes.append({'primitives': [{
        'attributes': {'POSITION': G.accessor(P, 34962, minmax=True), 'NORMAL': G.accessor(n, 34962)},
        'indices': G.accessor(ind, 34963), 'material': mi, 'mode': 4}]})
    return G.add_node(name, mesh=len(G.meshes) - 1)


def placeholder(kind, size, name, color=(0.55, 0.6, 0.7)):
    G = GB()
    s = float(size)
    if kind == 'wedge':
        L, W, H = s, s * 0.6, s * 0.18
        nose = (0, 0, L / 2)
        a, b = (-W / 2, 0, -L / 2), (W / 2, 0, -L / 2)
        c, d = (0, H, -L / 2), (0, -H / 2, -L / 2)
        tris = [(nose, a, c), (nose, c, b), (nose, d, a), (nose, b, d), (a, d, c), (b, c, d)]
    elif kind == 'box':
        h = s / 2
        v = [(-h, -h, -h), (h, -h, -h), (h, h, -h), (-h, h, -h), (-h, -h, h), (h, -h, h), (h, h, h), (-h, h, h)]
        f = [(0, 2, 1), (0, 3, 2), (4, 5, 6), (4, 6, 7), (0, 1, 5), (0, 5, 4), (2, 3, 7), (2, 7, 6), (1, 2, 6), (1, 6, 5), (3, 0, 4), (3, 4, 7)]
        tris = [(v[a], v[b], v[c]) for a, b, c in f]
    elif kind == 'sphere':
        R, ns, nr = s / 2, 16, 10
        pts = lambda i, j: (R * math.sin(math.pi * i / nr) * math.cos(2 * math.pi * j / ns),
                            R * math.cos(math.pi * i / nr),
                            R * math.sin(math.pi * i / nr) * math.sin(2 * math.pi * j / ns))
        tris = []
        for i in range(nr):
            for j in range(ns):
                a, b, c, d = pts(i, j), pts(i + 1, j), pts(i + 1, j + 1), pts(i, j + 1)
                tris += [(a, b, c), (a, c, d)]
    elif kind == 'ring':
        ro, ri, k = s / 2, s / 2 * 0.97, 64
        tris = []
        for j in range(k):
            t0, t1 = 2 * math.pi * j / k, 2 * math.pi * (j + 1) / k
            a, b = (ro * math.cos(t0), 0, ro * math.sin(t0)), (ro * math.cos(t1), 0, ro * math.sin(t1))
            c, d = (ri * math.cos(t1), 0, ri * math.sin(t1)), (ri * math.cos(t0), 0, ri * math.sin(t0))
            tris += [(a, b, c), (a, c, d)]
    else:
        raise ValueError(kind)
    root = _flat(G, tris, color, name, emissive=0.15)
    return G.finish([root], extras={'placeholder': True})


def pick_placeholder(name, sizes):
    base = name[:-4]
    ships = [v for k, v in sizes.items() if k.startswith('ship_') and k[5:7].isdigit()]
    ship_sz = float(np.median(ships)) if ships else 400.0
    planet = sizes.get('3d_planet.m3g', 600.0)
    hangar = sizes.get('stat_hangar0.m3g', 800.0)
    if base.startswith('ship'):
        return 'wedge', ship_sz, (0.55, 0.6, 0.7)
    if base == 'planet_sun':
        return 'sphere', planet, (1.0, 0.85, 0.4)
    if base == 'orbit':
        return 'ring', planet * 1.6, (0.4, 0.8, 1.0)
    if base == 'void_station':
        return 'box', hangar, (0.7, 0.3, 0.9)
    return 'box', ship_sz * 0.2, (0.9, 0.2, 0.9)


BOOST_COLORS = {'boost_cyan': (0, 255, 255), 'boost_orange': (255, 140, 0), 'boost_white': (255, 255, 255)}


def safe_name(base):
    """'ship_04_[13005]' -> 'ship_04_13005' (скобки ломают URL). Ключ в manifest остаётся оригинальным."""
    import re
    return re.sub(r'[^A-Za-z0-9_.-]', '', re.sub(r'\[(\d+)\]', r'\1', base))


def main():
    if len(sys.argv) < 3:
        print(__doc__)
        sys.exit(1)
    src, dst = sys.argv[1], sys.argv[2]
    expected = sys.argv[3] if len(sys.argv) > 3 else None
    os.makedirs(dst, exist_ok=True)
    manifest, sizes, errors = {}, {}, []
    files = sorted(f for f in os.listdir(src) if f.endswith('.m3g'))
    for f in files:
        try:
            glb, info = convert_m3g(os.path.join(src, f))
        except Exception as e:  # noqa
            errors.append((f, repr(e)))
            continue
        out = safe_name(f[:-4]) + '.glb'
        open(os.path.join(dst, out), 'wb').write(glb)
        info.update({'file': out, 'placeholder': False, 'source': f})
        manifest[f[:-4]] = info
        if 'size' in info:
            sizes[f] = max(info['size'])
    if expected and os.path.exists(expected):
        want = [l.strip() for l in open(expected) if l.strip().endswith('.m3g')]
        for f in want:
            if f in files or f == '.m3g':
                continue
            base = f[:-4]
            if base in BOOST_COLORS and 'boost_green.m3g' in files:
                glb, info = convert_m3g(os.path.join(src, 'boost_green.m3g'), recolor=BOOST_COLORS[base])
                info['note'] = 'клон boost_green с перекраской'
            else:
                kind, sz, col = pick_placeholder(f, sizes)
                glb = placeholder(kind, sz, base, col)
                info = {'note': f'заглушка {kind}', 'size': [round(sz, 2)] * 3}
            out = safe_name(base) + '.glb'
            open(os.path.join(dst, out), 'wb').write(glb)
            info.update({'file': out, 'placeholder': True, 'source': None})
            manifest[base] = info
    json.dump(manifest, open(os.path.join(dst, 'models.json'), 'w'), ensure_ascii=False, indent=1)
    real = sum(1 for v in manifest.values() if not v['placeholder'])
    print(f'готово: {real} моделей, {len(manifest) - real} заглушек, ошибок: {len(errors)}')
    for e in errors:
        print('  ОШИБКА', e)


if __name__ == '__main__':
    main()
