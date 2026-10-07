import os, struct, lzma, sys
out='/home/claude/out'; os.makedirs(out,exist_ok=True)
files=[c for c in 'aefghijklmnopqrstu' if c!='d' and os.path.exists(c)]+['c']
files=sorted(set(c for c in 'abcdefghijklmnopqrstu'))
rep=[]
for name in files:
    d=open(name,'rb').read()
    n=struct.unpack_from('<H',d,0)[0]
    offs=list(struct.unpack_from('<%dI'%n,d,2))
    base=2+4*n
    offs.append(len(d)-base)
    for k in range(n):
        s,e=base+offs[k],base+offs[k+1]
        chunk=d[s:e]
        kind='raw'; data=chunk
        if chunk[:1]==b'\x5d' and len(chunk)>13:
            try:
                data=lzma.decompress(chunk,format=lzma.FORMAT_ALONE); kind='lzma'
            except Exception as ex:
                kind='lzma-fail'
        p=f'{out}/{name}_{k:02d}.bin'
        open(p,'wb').write(data)
        rep.append((name,k,kind,len(chunk),len(data),data[:8].hex()))
for r in rep: print(*r)
