"""Extract motion tables used by the original game into assets/tables/tables.json.
 - cos: 256 little-endian int32 from raw_blocks/a_00.bin  (d.G, d.j(n)=cos(2*pi*n/256) in 8.8 fixed point; d.i(n)=d.j(64-n))
 - A:   32 shorts from raw_blocks/e_01.bin, first array: unit vectors for 16 directions (b.A), 8.8 fixed point
 - B:   second array of e_01 (b.B)
Block format of e_01 (d.g): u8 count, then per array: u8 length, length * int16 LE."""
import struct, json, os
root = os.path.join(os.path.dirname(__file__), '..')
rb = lambda n: open(os.path.join(root, 'assets/raw_blocks', n), 'rb').read()
cos = list(struct.unpack('<256i', rb('a_00.bin')[:1024]))
b = rb('e_01.bin'); p = 0; n = b[p]; p += 1; arrs = []
for _ in range(n):
    L = b[p]; p += 1
    arrs.append(list(struct.unpack_from('<%dh' % L, b, p))); p += 2 * L
out = dict(cos=cos, A=arrs[0], B=arrs[1])
json.dump(out, open(os.path.join(root, 'assets/tables/tables.json'), 'w'))
print('cos', cos[:4], 'A', arrs[0][:8], 'B', arrs[1][:6])
