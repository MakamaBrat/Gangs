// Pure game simulation ported from the original d.java / b.java (no DOM, testable in Node).
// All positions are 8.8 fixed point pixels ("<<8"), exactly like the original. One tick = 100 ms.
// Java semantics: int division truncates toward zero (idiv), >> is arithmetic.
export const TICK_MS = 100;
export const SCREEN_W = 240, SCREEN_H = 320;
export const VIEW_X = 0, VIEW_Y = 18, VIEW_W = 240, VIEW_H = 276;   // bI = -fU, bJ = -fV + 18
export const idiv = (a, b) => Math.trunc(a / b);

// ---- world / collision (d.t(x,y), d.java:10092) -------------------------------------------------
export function makeWorld(map, tables) {
  const ft = map.tilesPerBlockW, fu = map.tilesPerBlockH, fz = map.blocksW, fA = map.blocksH, T = map.tileSize;
  const world = {
    map, tables, ft, fu, fz, fA, T, pxW: fz * ft * T, pxH: fA * fu * T,
    // x,y in 8.8 fixed point. 2 = solid (also everything outside the map).
    collisionAt(x, y) {
      if (x < 0 || y < 0) return 2;
      const tx = idiv(x >> 8, T), ty = idiv(y >> 8, T);
      if (tx >= ft * fz || ty >= fu * fA) return 2;
      const block = map.blockMap[idiv(tx, ft) + idiv(ty, fu) * fz] & 0x1f;
      const tile = map.tileIndex[block][(tx % ft) + (ty % fu) * ft] & 0xFF;
      return map.collision[tile] ?? 0;
    },
  };
  return world;
}
export const cos8 = (w, n) => w.tables.cos[n & 0xFF];            // d.j(n)  (8.8)
export const sin8 = (w, n) => cos8(w, 64 - n);                    // d.i(n)

// ---- animation player (class c) -----------------------------------------------------------------
export class AnimPlayer {
  constructor(info) { this.info = info; this.d = 0; this.e = 0; this.f = 0; }
  set(n) { if (n !== this.d) { this.d = n; this.e = 0; this.f = 0; } }      // c.a(int)
  cur() { const s = this.info.animations[this.d]; return s && s.length ? s[Math.min(this.e, s.length - 1)] : null; }
  tick() {                                                                   // c.b()
    const s = this.info.animations[this.d]; if (!s || !s.length) return;
    const t = s[Math.min(this.e, s.length - 1)].time;
    if (t === 0) return;                                                     // time 0 = hold
    if (t > ++this.f) return;
    this.f = 0; if (++this.e >= s.length) this.e = 0;
  }
}

// ---- player on foot (b with i[0]==4, params from d.java: j[7]=1792, j[6]=32767) -----------------------
export const WALK_SPEED = 1792, HIT_W = 5376, HIT_H = 3840;                  // b.w(): U=5376, V=3840 (21x15 px)
export function makePlayer(px, py, dir = 12) {
  return { a: px << 8, b: py << 8, c: 0, d: 0, h: 0, l: 0, dir, prevA: 0, prevB: 0, gM: -1e9 };
}
function refreshVel(w, p) {                                                   // b.s()
  p.c = w.tables.A[p.dir * 2] * idiv(p.h, 100);
  p.d = w.tables.A[p.dir * 2 + 1] * idiv(p.h, 100);
}
export function setDir(w, p, n, nowMs) {                                      // b.i(n)
  if (p.dir === n) return;
  if (nowMs !== undefined) p.gM = nowMs;                                      // d.gM (camera lookahead pause)
  p.dir = n; if (p.h > 0) refreshVel(w, p);
}
export function walkForward(w, p) {                                           // b.g(61439), type 4
  const n2 = p.h;
  if (p.h === WALK_SPEED && p.l < 1200) return;
  p.h += 32767;
  if (n2 < WALK_SPEED && p.h >= WALK_SPEED) { p.h = WALK_SPEED; p.l = 0; }
  else if (p.h > WALK_SPEED) p.h = WALK_SPEED;
  if (p.h === n2) return;
  refreshVel(w, p);
}
export function stopWalking(w, p) { p.h = 0; refreshVel(w, p); }             // b.f(0)
// b.c() -> G() -> u(): integrate velocity, then revert the whole move if any hitbox corner is in a wall (value 2).
export function moveStep(w, p) {
  p.l += 100;
  p.prevA = p.a; p.prevB = p.b;
  if (p.h === 0 && p.c === 0 && p.d === 0) return false;
  p.a += idiv((p.c * 100 >> 8) * 24, 16);                                     // b.t()
  p.b += idiv((p.d * 100 >> 8) * 24, 16);
  const x0 = p.a - HIT_W / 2, y0 = p.b - HIT_H / 2;                           // b.w(): P[0],Q[0]
  for (let k = 0; k < 4; k++) {
    if (w.collisionAt(x0 + (k % 2) * HIT_W, y0 + (k >> 1) * HIT_H) === 2) { p.a = p.prevA; p.b = p.prevB; return true; }
  }
  return false;
}
export function clampPlayer(w, p) {                                           // start of d.aD()
  p.a = Math.min(Math.max(1, p.a), (w.pxW - 1) << 8);
  p.b = Math.min(Math.max(1, p.b), (w.pxH - 1) << 8);
}

// ---- camera (d.bz() target + d.bA() follow) -------------------------------------------------------
export function makeCamera() { return { fW: 0, fX: 0, hp: 0, hq: 0, hr: 0, hs: 0 }; }
// bbox centre of the current sprite frame relative to the anchor (pixels); stands in for b.m()/b.n() offsets
export function playerCenter(p, off) { return { m: p.a + (off.x << 8), n: p.b + (off.y << 8) }; }
export function cameraSnap(w, cam, tx, ty) {                                  // d.C(x,y)
  cam.fW = Math.min(Math.max(0, tx), (w.pxW - 240 - 1) << 8);
  cam.fX = Math.min(Math.max(0, ty), (w.pxH - 276 - 1) << 8);
  cam.hp = cam.fW; cam.hq = cam.fX; cam.hr = 0; cam.hs = 0;
}
export function cameraTarget(w, cam, p, ctr, nowMs) {                         // d.bz()
  if (p.c === 0 && p.d === 0) { cam.hr = 0; cam.hs = 0; return; }
  let n = 10;
  cam.hr = idiv((p.c >> 8) * 24, 16);
  cam.hs = idiv((p.d >> 8) * 24, 16);
  if (nowMs - p.gM >= 0 && nowMs - p.gM < 200) { n = 0; cam.hr = 0; cam.hs = 0; }
  const n2 = cos8(w, 256 - p.dir * 16), n3 = sin8(w, 256 - p.dir * 16);
  let n4 = 0, n5 = 0;
  if (n2 !== 0) n4 = (n2 >= 0 ? 1 : -1) * 6144;
  if (n3 !== 0) n5 = (n2 >= 0 ? 1 : -1) * 6144;                               // sic: original uses sign of n2 here
  cam.hp = n4 + ctr.m - 30720 + idiv(idiv(n * 24, 16) * 240 * n2, 50);
  cam.hq = n5 + ctr.n - 35328 + idiv(idiv(n * 24, 16) * 276 * n3, 50);
}
export function cameraFollow(w, cam, p, ctr) {                                // d.bA() with ht==0
  if (Math.abs(cam.fW - cam.hp) < 768 && Math.abs(cam.fX - cam.hq) < 768) { cam.hr = 0; cam.hs = 0; return; }
  if (p.c === 0 && p.d === 0) return;                                         // frozen while the player stands still
  const n = cam.fW, n2 = cam.fX;
  cam.fW += cam.hr * 100; cam.fX += cam.hs * 100;
  cam.fW += idiv((cam.hp - cam.fW) * 100, 900);
  cam.fX += idiv((cam.hq - cam.fX) * 100, 900);
  cam.fW = Math.min(Math.max(0, cam.fW), (w.pxW - 240 - 1) << 8);
  cam.fX = Math.min(Math.max(0, cam.fX), (w.pxH - 276 - 1) << 8);
  if ((Math.abs(cam.fW - ctr.m + 30720) > 30720 && ctr.m > 0 && ctr.m < w.pxW) ||
      (Math.abs(cam.fX - ctr.n + 35328) > 35328 && ctr.n > 0 && ctr.n < w.pxH)) {
    cam.hr = 0; cam.hs = 0; cam.fW = n; cam.fX = n2;
  }
}

// ---- spawn: first sidewalk (collision 1) tile around the map centre whose hitbox is free ------------
export function findSpawn(w) {
  const cx = idiv(w.ft * w.fz, 2), cy = idiv(w.fu * w.fA, 2);
  for (let r = 0; r < 300; r++) for (let dy = -r; dy <= r; dy++) for (let dx = -r; dx <= r; dx++) {
    if (Math.max(Math.abs(dx), Math.abs(dy)) !== r) continue;
    const px = (cx + dx) * w.T + w.T / 2, py = (cy + dy) * w.T + w.T / 2;
    if (w.collisionAt(px << 8, py << 8) !== 1) continue;
    let ok = true;
    for (let k = 0; k < 4 && ok; k++) if (w.collisionAt((px << 8) - HIT_W / 2 + (k % 2) * HIT_W, (py << 8) - HIT_H / 2 + (k >> 1) * HIT_H) === 2) ok = false;
    if (ok) return { x: px, y: py };
  }
  return { x: 120, y: 120 };
}

// ---- one game tick (order as in at(): camera follow first, then player control, then target) --------
export function playerAnimIndex(p) {                                          // b.e(), case 2, no weapon
  const d = (p.dir & 2) ? ((p.dir === 2 || p.dir === 14) ? 0 : 2) : (p.dir >> 2);
  return d * 30 + (p.h === 0 ? 0 : 2);
}
export function gameTick(w, st, keyDir, nowMs, ctrOff) {
  const { p, cam } = st;
  cameraFollow(w, cam, p, playerCenter(p, ctrOff));                           // bA()
  clampPlayer(w, p);                                                          // aD()
  if (keyDir >= 0) { setDir(w, p, keyDir, nowMs); walkForward(w, p); }       // aE(): cd.i(n); cd.g(61439)
  else if (p.h !== 0) { cameraTarget(w, cam, p, playerCenter(p, ctrOff), nowMs); stopWalking(w, p); }
  moveStep(w, p);                                                             // cd.c()
  cameraTarget(w, cam, p, playerCenter(p, ctrOff), nowMs);                    // aD(): bz()
}
// d.z(): first pressed key (lowest index) that maps to a direction. `an` may hold a negative value for one tick after release.
export const KEY_TO_DIR = { 7: 0, 5: 8, 3: 4, 9: 12, 4: 2, 2: 6, 8: 10, 10: 14 };   // cR[]
export function keyDirection(an) {
  for (let i = 0; i < an.length; i++) { if (KEY_TO_DIR[i] === undefined || an[i] === 0) continue; return KEY_TO_DIR[i]; }
  return -1;
}
