import struct, lzma, os, json, io, sys
from PIL import Image

def u16(d,o): return d[o]|(d[o+1]<<8)
def s8(v): return v-256 if v>127 else v

class Sprite: pass

def parse(d):
    s=Sprite(); n=0
    n+=1
    s.x=d[2]|(d[3]<<8)|(d[4]<<16)|(d[5]<<24); n=6
    s.w5=(s.x&0x4000)!=0
    s.mod=[]; s.b=0
    if s.x&1:
        s.b=u16(d,n); n+=2
        for i in range(s.b):
            m=dict(c=0,d=0,e=0,f=0,z=0,col=0)
            v=d[n]
            if v==0xFF or v==0xFE:
                r,g,bb,a=d[n+1],d[n+2],d[n+3],d[n+4]
                m['col']=(r,g,bb,a); m['e']=d[n+5]; m['f']=d[n+6]; m['z']=2 if v==0xFF else 1; n+=7
            else:
                if s.x&2:
                    m['c']=d[n];m['d']=d[n+1];m['e']=d[n+2];m['f']=d[n+3]; n+=4
                else:
                    m['e']=d[n];m['f']=d[n+1]; n+=2
            s.mod.append(m)
    cnt=u16(d,n); n+=2
    sz=cnt*(5 if s.w5 else 4); s.fm=d[n:n+sz]; n+=sz
    cnt=u16(d,n); n+=2
    s.frames=[]
    for i in range(cnt):
        s.frames.append((d[n],u16(d,n+2))); n+=4
    s.fbox=d[n:n+cnt*4]; n+=cnt*4
    cnt=u16(d,n); n+=2
    s.af=d[n:n+cnt*5]; n+=cnt*5
    cnt=u16(d,n); n+=2
    s.anims=[]
    for i in range(cnt):
        s.anims.append((d[n],u16(d,n+2))); n+=4
    s.pal=[]; s.png=None
    if s.b<=0: return s
    if s.x&0x20000000:
        ln=u16(d,n); n+=2
        s.t=bytearray(d[n:n+ln]); n+=ln
        o=d[n]; q=d[n+1] or 256; n+=2
        n6=q*3+4+q+4
        s.pngpal=[bytes(d[n+i*n6:n+(i+1)*n6]) for i in range(o)]
        s.q=q; s.png=True
        return s
    fmt=u16(d,n); n+=2
    o=d[n]; q=d[n+1] or 256; n+=2
    s.fmt=fmt; s.q=q; s.hasalpha=False
    for i in range(o):
        p=[]
        for k in range(q):
            if fmt==0x8888:
                B,G,R,A=d[n],d[n+1],d[n+2],d[n+3]; n+=4
                p.append((R,G,B,A))
            elif fmt==0x5515:
                v=d[n]|(d[n+1]<<8); n+=2
                if v&0x8000: a=255
                else: a=0
                p.append((((v>>10)&31)<<3,((v>>5)&31)<<3,(v&31)<<3,a))
            else: raise Exception('palfmt %x'%fmt)
        s.pal.append(p)
    s.enc=u16(d,n); n+=2
    s.pix=[]
    for i in range(s.b):
        ln=u16(d,n); n+=2
        s.pix.append(d[n:n+ln]); n+=ln
    return s

def decode_module(s,i,pal=0):
    m=s.mod[i]; w,h=m['e'],m['f']
    if w<=0 or h<=0: return None
    if m['z']:
        return Image.new('RGBA',(w,h),m['col'])
    if s.png:
        return None
    data=s.pix[i]; P=s.pal[pal]; out=[]; p=0
    if s.enc==0x56F2:
        while len(out)<w*h and p<len(data):
            c=data[p]; p+=1
            if c>127:
                for _ in range(c-128): out.append(P[data[p]]); p+=1
            else:
                v=P[data[p]]; p+=1; out.extend([v]*c)
    elif s.enc==0x5602:
        out=[P[x] for x in data[:w*h]]
    else: raise Exception('enc %x'%s.enc)
    out+= [(0,0,0,0)]*(w*h-len(out))
    im=Image.new('RGBA',(w,h)); im.putdata(out[:w*h]); return im

def png_sheet(s,pal):
    t=bytearray(s.t); r=s.pngpal[pal]; q=s.q
    n5=q*3+4; n6=q+4
    t[41:41+n5]=r[:n5]; t[41+n5+8:41+n5+8+n6]=r[n5:n5+n6]
    return Image.open(io.BytesIO(bytes(t))).convert('RGBA')

TR={0:None,1:Image.FLIP_TOP_BOTTOM,2:Image.FLIP_LEFT_RIGHT,3:Image.ROTATE_180,
    4:Image.TRANSPOSE,5:Image.ROTATE_270,6:Image.ROTATE_90,7:Image.TRANSVERSE}
YM=[0,2,1,3,5,7,4,6]
def xform(im,fl):
    t=TR[YM[fl&7]]
    return im if t is None else im.transpose(t)

def fm_entry(s,idx):
    if s.w5:
        o=idx*5; return s.fm[o],s.fm[o+1],s.fm[o+2],s.fm[o+4]
    o=idx*4; return s.fm[o],s.fm[o+1],s.fm[o+2],s.fm[o+3]

def frame_items(s,f,depth=0):
    cnt,st=s.frames[f]; items=[]
    for k in range(cnt):
        mi,x,y,fl=fm_entry(s,st+k)
        mid=mi|((fl&0xC0)<<2); x=s8(x); y=s8(y)
        if fl&0x10 and depth<4:
            for (m2,x2,y2,f2) in frame_items(s,mid,depth+1):
                items.append((m2,x+x2,y+y2,f2^(fl&0xF)))
        else:
            items.append((mid,x,y,fl&0xF))
    return items

def render_frame(s,f,mods):
    items=frame_items(s,f); ims=[]
    for (mid,x,y,fl) in items:
        if mid>=len(mods) or mods[mid] is None: continue
        ims.append((xform(mods[mid],fl),x,y))
    if not ims: return None,(0,0)
    x0=min(x for _,x,_ in ims); y0=min(y for _,_,y in ims)
    x1=max(x+im.width for im,x,_ in ims); y1=max(y+im.height for im,_,y in ims)
    can=Image.new('RGBA',(x1-x0,y1-y0),(0,0,0,0))
    for im,x,y in ims: can.alpha_composite(im,(x-x0,y-y0))
    return can,(x0,y0)

def convert(d,outdir,name):
    s=parse(d); os.makedirs(outdir,exist_ok=True)
    info=dict(name=name,flags=hex(s.x),modules=[],frames=[],animations=[],palettes=0)
    npal=len(s.pngpal) if s.png else len(s.pal)
    info['palettes']=npal
    for pal in range(npal):
        if s.png:
            sheet=png_sheet(s,pal)
            if pal==0: sheet.save(f'{outdir}/sheet.png')
            elif npal<=8: sheet.save(f'{outdir}/sheet_pal{pal}.png')
            mods=[]
            for m in s.mod:
                if m['z']: mods.append(Image.new('RGBA',(m['e'],m['f']),m['col'])); continue
                if m['e']<=0 or m['f']<=0: mods.append(None); continue
                mods.append(sheet.crop((m['c'],m['d'],m['c']+m['e'],m['d']+m['f'])))
        else:
            mods=[decode_module(s,i,pal) for i in range(s.b)]
        if pal==0:
            os.makedirs(f'{outdir}/modules',exist_ok=True)
            for i,im in enumerate(mods):
                m=s.mod[i]
                info['modules'].append(dict(i=i,w=m['e'],h=m['f'],**({'x':m['c'],'y':m['d']} if s.png else {})))
                if im is not None: im.save(f'{outdir}/modules/m{i:03d}.png')
            os.makedirs(f'{outdir}/frames',exist_ok=True)
            for f in range(len(s.frames)):
                im,(ox,oy)=render_frame(s,f,mods)
                info['frames'].append(dict(i=f,ox=ox,oy=oy,items=[dict(m=a,x=b,y=c,flip=e) for a,b,c,e in frame_items(s,f)]))
                if im is not None: im.save(f'{outdir}/frames/f{f:03d}.png')
        elif npal<=16 and not s.png:
            # modules atlas for alt palettes: render frames only
            os.makedirs(f'{outdir}/frames_pal{pal}',exist_ok=True)
            for f in range(len(s.frames)):
                im,_=render_frame(s,f,mods)
                if im is not None: im.save(f'{outdir}/frames_pal{pal}/f{f:03d}.png')
    for a,(cnt,st) in enumerate(s.anims):
        seq=[]
        for k in range(cnt):
            o=(st+k)*5
            seq.append(dict(frame=s.af[o]|((s.af[o+4]&0xC0)<<2),time=s.af[o+1],dx=s8(s.af[o+2]),dy=s8(s.af[o+3]),flip=s.af[o+4]&0xF))
        info['animations'].append(seq)
    json.dump(info,open(f'{outdir}/sprite.json','w'),indent=1)
    return info

if __name__=='__main__':
    src='/home/claude/out'; dst='/home/claude/work/sprites'
    import glob
    for p in sorted(glob.glob(src+'/*.bin')):
        d=open(p,'rb').read(); nm=os.path.basename(p)[:-4]
        if len(d)<8 or d[0]!=0xdf: continue
        try:
            inf=convert(d,f'{dst}/{nm}',nm)
            print(nm,'ok modules',len(inf['modules']),'frames',len(inf['frames']),'anims',len(inf['animations']),'pals',inf['palettes'])
        except Exception as e:
            import traceback; print(nm,'FAIL',repr(e))
