import { loadMap, loadSprite, drawMap, drawFrame, animAt, sound } from './engine.js';
const cv = document.getElementById('c'), ctx = cv.getContext('2d');
const $ = id => document.getElementById(id);
const SPRITES = ['c_00','c_01','g_00','i_00','k_00','k_01','k_02','k_03','k_04','l_00','l_01','m_01','m_04','d_00','d_01','p_00','p_01','t_00'];
let map, spr, anim = 0, cam = { x: 0, y: 0 }, keys = {};
SPRITES.forEach(s => $('spr').add(new Option(s, s))); $('spr').value = 'i_00';

async function setMap() { map = await loadMap($('city').value); cam = { x: 0, y: 0 }; }
async function setSprite() {
  spr = await loadSprite($('spr').value); $('anim').innerHTML = '';
  spr.info.animations.forEach((_, i) => $('anim').add(new Option('anim ' + i, i)));
  anim = 0;
}
$('city').onchange = setMap; $('spr').onchange = setSprite; $('anim').onchange = e => anim = +e.target.value;
$('snd').onclick = () => sound.play('n_19');
addEventListener('keydown', e => { keys[e.key] = true; if (e.key.startsWith('Arrow')) e.preventDefault(); });
addEventListener('keyup', e => keys[e.key] = false);

function frame(t) {
  if (map) {
    const v = keys.Shift ? 8 : 3;
    cam.x += (keys.ArrowRight ? v : 0) - (keys.ArrowLeft ? v : 0);
    cam.y += (keys.ArrowDown ? v : 0) - (keys.ArrowUp ? v : 0);
    const c = drawMap(ctx, map, cam.x, cam.y, cv.width, cv.height); cam.x = c.camX; cam.y = c.camY;
    const tl = map.tileAt(cam.x + cv.width / 2, cam.y + cv.height / 2);
    $('info').textContent = `камера ${cam.x|0},${cam.y|0} · тайл под центром: блок ${tl.block}, кадр ${tl.tile}, коллизия ${tl.collision}`;
  }
  if (spr) {
    const a = animAt(spr, anim, t);
    if (a) drawFrame(ctx, spr, a.frame, cv.width / 2 + a.dx, cv.height / 2 + a.dy, a.flip);
    else if (spr.frames[0]) drawFrame(ctx, spr, 0, cv.width / 2, cv.height / 2);
  }
  requestAnimationFrame(frame);
}
await setMap(); await setSprite(); requestAnimationFrame(frame);
