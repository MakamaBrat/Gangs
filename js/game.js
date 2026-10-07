// Browser shell: fixed 100 ms tick (as the original run() loop), state machine T, rendering to a 240x320 canvas.
import { loadMap, loadSprite, drawFrame } from './engine.js';
import { Input } from './input.js';
import * as S from './sim.js';

const cv = document.getElementById('c'), ctx = cv.getContext('2d');
const dbg = document.getElementById('info');
const params = new URLSearchParams(location.search);
const input = new Input(); input.attach(window);
let showColl = params.has('coll');
addEventListener('keydown', e => { if (e.code === 'KeyC') showColl = !showColl; });

// T: game state, a small subset of the original numbering (d.ac()): 2 = level load, 7 = in-game.
let T = 2;
let world, mapImg, spr, st, anim, ctrOff = { x: 0, y: -18 };
const COLL_COLORS = ['rgba(0,255,0,.28)', 'rgba(0,120,255,.28)', 'rgba(255,0,0,.35)', 'rgba(255,255,0,.45)'];

async function load() {
  const tag = params.get('map') || 'city1_h';
  const [tables, map] = await Promise.all([fetch('assets/tables/tables.json').then(r => r.json()), loadMap(tag)]);
  world = S.makeWorld(map.data, tables); mapImg = map.image;
  spr = await loadSprite('i_00');                       // player on foot: bB[2], animations d()*30 (+2 walking)
  anim = new S.AnimPlayer(spr.info);
  const sp = S.findSpawn(world);
  const p = S.makePlayer(sp.x, sp.y, 12), cam = S.makeCamera();
  S.cameraSnap(world, cam, p.a - 30720, p.b - 35328);
  st = { p, cam, tick: 0 };
  T = 7;
}

function playerSprite() {                               // current frame + bbox centre (stands in for b.m()/b.n())
  const a = anim.cur(); if (!a) return null;
  const im = spr.frames[a.frame], m = spr.info.frames[a.frame];
  return { a, im, m };
}

function update() {                                     // one tick of at()
  input.tick();
  const now = st.tick * S.TICK_MS;
  const dir = S.keyDirection(input.an);
  S.gameTick(world, st, dir, now, ctrOff);
  anim.set(S.playerAnimIndex(st.p)); anim.tick();
  const f = playerSprite();
  if (f && f.im && f.m) ctrOff = { x: f.m.ox + (f.im.width >> 1), y: f.m.oy + (f.im.height >> 1) };
  st.tick++;
}

function draw() {
  ctx.fillStyle = '#000'; ctx.fillRect(0, 0, 240, 320);
  const fU = st.cam.fW >> 8, fV = st.cam.fX >> 8;
  ctx.save(); ctx.beginPath(); ctx.rect(S.VIEW_X, S.VIEW_Y, S.VIEW_W, S.VIEW_H); ctx.clip();
  ctx.drawImage(mapImg, fU, fV, S.VIEW_W, S.VIEW_H, S.VIEW_X, S.VIEW_Y, S.VIEW_W, S.VIEW_H);
  if (showColl) {
    const T24 = world.T;
    for (let ty = Math.floor(fV / T24); ty <= Math.floor((fV + S.VIEW_H) / T24); ty++)
      for (let tx = Math.floor(fU / T24); tx <= Math.floor((fU + S.VIEW_W) / T24); tx++) {
        ctx.fillStyle = COLL_COLORS[world.collisionAt((tx * T24 + 1) << 8, (ty * T24 + 1) << 8)];
        ctx.fillRect(tx * T24 - fU, ty * T24 - fV + S.VIEW_Y, T24, T24);
      }
  }
  const px = (st.p.a >> 8) - fU, py = (st.p.b >> 8) - fV + S.VIEW_Y;
  const a = anim.cur();
  if (a) drawFrame(ctx, spr, a.frame, px + a.dx, py + a.dy, a.flip);
  if (showColl) {                                       // hitbox of the player (21x15 px around the anchor)
    ctx.strokeStyle = '#fff'; ctx.strokeRect(px - 10.5, py - 7.5, 21, 15);
  }
  ctx.restore();
  ctx.fillStyle = '#fff'; ctx.font = '9px monospace'; ctx.textBaseline = 'top';
  ctx.fillText('x ' + (st.p.a >> 8) + ' y ' + (st.p.b >> 8), 2, 4);
  dbg.textContent = `T=${T} tick=${st.tick} dir=${st.p.dir} h=${st.p.h} cam=${st.cam.fW >> 8},${st.cam.fX >> 8} anim=${anim.d}/${anim.e}  [C — коллизии]`;
}

let last = performance.now(), acc = 0;
function frame(t) {
  requestAnimationFrame(frame);
  if (T !== 7) return;
  acc += Math.min(t - last, 500); last = t;
  let ticked = false;
  while (acc >= S.TICK_MS) { acc -= S.TICK_MS; update(); ticked = true; }
  if (ticked) draw();                                   // the original draws once per tick (~10 fps)
}
await load(); draw(); requestAnimationFrame(frame);
