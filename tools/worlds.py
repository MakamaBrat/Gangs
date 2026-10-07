import sys,os,json
sys.path.insert(0,'/home/claude/work')
from sprites import *
from PIL import Image
O='/home/claude/out'
def fixed_frame(s,f,mods,size=24):
    can=Image.new('RGBA',(size,size),(0,0,0,0))
    for (mid,x,y,fl) in frame_items(s,f):
        if mid>=len(mods) or mods[mid] is None: continue
        can.alpha_composite(xform(mods[mid],fl),(x,y)) if 0<=x<size and 0<=y<size and x+mods[mid].width<=size+0 and y+mods[mid].height<=size else can.paste(xform(mods[mid],fl),(x,y),xform(mods[mid],fl))
    return can
def build(tag,mapf,blockf,tilef,pal=0):
    mp=open(f'{O}/{mapf}.bin','rb').read()
    fz,fA=mp[0],mp[1]; fy=mp[4:4+fz*fA]
    bk=open(f'{O}/{blockf}.bin','rb').read()
    ft,fu=bk[0],bk[1]; fv=ft*fu
    n2=(len(bk)-2)*4//(fv*5)  # fr n2*fv + fs n2*fv/4
    fr=bk[2:2+n2*fv]; fs=bk[2+n2*fv:2+n2*fv+n2*((fv+3)//4)]
    s=parse(open(f'{O}/{tilef}.bin','rb').read())
    mods=[decode_module(s,i,pal) for i in range(s.b)]
    cache={}
    def tile(idx,fl):
        k=(idx,fl)
        if k in cache: return cache[k]
        if idx>=len(s.frames): im=Image.new('RGBA',(24,24),(255,0,255,255))
        else:
            im=fixed_frame(s,idx,mods)
            if fl&1: im=im.transpose(Image.FLIP_LEFT_RIGHT)
            if fl&2: im=im.transpose(Image.FLIP_TOP_BOTTOM)
        cache[k]=im; return im
    W,H=fz*ft*24,fA*fu*24
    print(tag,'map',fz,'x',fA,'blocks; block',ft,'x',fu,'tiles; types',n2,'; image',W,'x',H)
    world=Image.new('RGBA',(W,H),(0xDD,0xBB,0xBB,255))
    for by in range(fA):
        for bx in range(fz):
            bt=fy[bx+by*fz]&0x1F
            if bt>=n2: continue
            for ty in range(fu):
                for tx in range(ft):
                    k=tx+ty*ft
                    idx=fr[bt*fv+k]
                    fl=(fs[bt*((fv+3)//4)+k//4]>>((3-k%4)*2))&3
                    world.alpha_composite(tile(idx,fl),((bx*ft+tx)*24,(by*fu+ty)*24))
    os.makedirs('/home/claude/work/maps',exist_ok=True)
    world.save(f'/home/claude/work/maps/{tag}_full.png')
    world.resize((W//4,H//4),Image.LANCZOS).save(f'/home/claude/work/maps/{tag}_preview.png')
    json.dump(dict(blocksW=fz,blocksH=fA,blockMap=list(fy),tilesPerBlockW=ft,tilesPerBlockH=fu,tileSize=24,
        blockTypes=n2,tileIndex=[list(fr[i*fv:(i+1)*fv]) for i in range(n2)],
        tileFlips=[[(fs[i*((fv+3)//4)+k//4]>>((3-k%4)*2))&3 for k in range(fv)] for i in range(n2)],
        tileset=tilef),open(f'/home/claude/work/maps/{tag}.json','w'))
build('city1_h','h_01','h_00','g_00')
build('city2_s','s_01','s_00','r_00')
