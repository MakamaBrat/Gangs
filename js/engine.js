// Minimal engine for the web port: asset loading, sprites/animations, tile map, collision.
export const TICK = 100; // ms per animation time unit = one game tick (original run() loop is 100 ms)
const cache = { sprites: {}, maps: {} };
const loadImg = src => new Promise(r => { const i = new Image(); i.onload = () => r(i); i.onerror = () => r(null); i.src = src; });

export async function loadSprite(id) {
  if (cache.sprites[id]) return cache.sprites[id];
  const base = `assets/sprites/${id}`;
  const info = await (await fetch(`${base}/sprite.json`)).json();
  const frames = await Promise.all(info.frames.map(f => loadImg(`${base}/frames/f${String(f.i).padStart(3, '0')}.png`)));
  return (cache.sprites[id] = { id, info, frames });
}

// flip: bit0 = mirror X, bit1 = mirror Y. Origin (x,y) is the frame anchor.
export function drawFrame(ctx, spr, f, x, y, flip = 0) {
  const im = spr.frames[f], m = spr.info.frames[f];
  if (!im || !m) return;
  ctx.save(); ctx.translate(x, y); ctx.scale(flip & 1 ? -1 : 1, flip & 2 ? -1 : 1);
  ctx.drawImage(im, m.ox, m.oy); ctx.restore();
}

// Returns {frame, dx, dy, flip} for animation `a` at time t (ms), looping.
export function animAt(spr, a, t) {
  const seq = spr.info.animations[a]; if (!seq || !seq.length) return null;
  const total = seq.reduce((s, e) => s + Math.max(1, e.time), 0) * TICK;
  let u = t % total;
  for (const e of seq) { const d = Math.max(1, e.time) * TICK; if (u < d) return e; u -= d; }
  return seq[seq.length - 1];
}

export async function loadMap(tag) {
  if (cache.maps[tag]) return cache.maps[tag];
  const data = await (await fetch(`assets/maps/${tag}.json`)).json();
  const image = await loadImg(`assets/maps/${tag}_full.png`);
  const m = { tag, data, image, w: image.width, h: image.height };
  // tile at pixel -> {block, tile, collision}
  m.tileAt = (px, py) => {
    const T = data.tileSize, tx = Math.floor(px / T), ty = Math.floor(py / T);
    const bw = data.tilesPerBlockW, bh = data.tilesPerBlockH;
    if (tx < 0 || ty < 0 || tx >= data.blocksW * bw || ty >= data.blocksH * bh) return { block: -1, tile: -1, collision: 2 };
    const block = data.blockMap[Math.floor(tx / bw) + Math.floor(ty / bh) * data.blocksW] & 0x1f;
    const k = (tx % bw) + (ty % bh) * bw, tile = data.tileIndex[block][k];
    return { block, tile, collision: data.collision[tile] ?? 0 }; // meaning of values 0..3: see tools/decompiled_java (d.t)
  };
  return (cache.maps[tag] = m);
}

export function drawMap(ctx, map, camX, camY, vw, vh) {
  camX = Math.max(0, Math.min(map.w - vw, camX)); camY = Math.max(0, Math.min(map.h - vh, camY));
  ctx.drawImage(map.image, camX, camY, vw, vh, 0, 0, vw, vh);
  return { camX, camY };
}

export const sound = {
  play(name) { const a = new Audio(`assets/wav/${name}.wav`); a.play().catch(() => {}); },
};
