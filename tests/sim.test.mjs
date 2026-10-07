// Run: node tests/sim.test.mjs
import fs from 'node:fs';
import assert from 'node:assert/strict';
import * as S from '../js/sim.js';
import { Input } from '../js/input.js';
const tables = JSON.parse(fs.readFileSync('assets/tables/tables.json'));
let fails = 0; const ok = (n, f) => { try { f(); console.log('ok  ', n); } catch (e) { fails++; console.log('FAIL', n, '\n    ', e.message); } };

for (const tag of ['city1_h', 'city2_s']) {
  const map = JSON.parse(fs.readFileSync(`assets/maps/${tag}.json`));
  const w = S.makeWorld(map, tables);
  const SIZES = { city1_h: [6144, 3840], city2_s: [5376, 5376] };   // = size of assets/maps/<tag>_full.png
  ok(`${tag}: map size ${w.pxW}x${w.pxH}`, () => { assert.deepEqual([w.pxW, w.pxH], SIZES[tag]); });
  ok(`${tag}: outside the map is solid (2)`, () => { for (const [x, y] of [[-1, 0], [0, -1], [w.pxW << 8, 0], [0, w.pxH << 8]]) assert.equal(w.collisionAt(x, y), 2); });
  const sp = S.findSpawn(w);
  ok(`${tag}: spawn on sidewalk, hitbox free (${sp.x},${sp.y})`, () => {
    assert.equal(w.collisionAt(sp.x << 8, sp.y << 8), 1);
    const p = S.makePlayer(sp.x, sp.y);
    for (let k = 0; k < 4; k++) assert.notEqual(w.collisionAt(p.a - S.HIT_W / 2 + (k % 2) * S.HIT_W, p.b - S.HIT_H / 2 + (k >> 1) * S.HIT_H), 2);
  });
  ok(`${tag}: walking speed east = 2550 (8.8) per tick`, () => {
    const p = S.makePlayer(sp.x, sp.y, 0); S.setDir(w, p, 0, 0); S.walkForward(w, p);
    assert.equal(p.h, 1792); assert.equal(p.c, 256 * 17); assert.equal(p.d, 0);
    const a0 = p.a; const blocked = S.moveStep(w, p);
    if (!blocked) assert.equal(p.a - a0, 2550);
  });
  ok(`${tag}: hitbox never ends inside a wall; walls stop movement (all 16 dirs, 400 ticks)`, () => {
    for (let dir = 0; dir < 16; dir++) {
      const st = { p: S.makePlayer(sp.x, sp.y, dir), cam: S.makeCamera() };
      S.cameraSnap(w, st.cam, st.p.a - 30720, st.p.b - 35328);
      let stuck = 0;
      for (let t = 0; t < 400; t++) {
        const before = st.p.a * 1e6 + st.p.b; S.gameTick(w, st, dir, t * 100, { x: 1, y: -15 });
        for (let k = 0; k < 4; k++) assert.notEqual(w.collisionAt(st.p.a - S.HIT_W / 2 + (k % 2) * S.HIT_W, st.p.b - S.HIT_H / 2 + (k >> 1) * S.HIT_H), 2, `dir ${dir} tick ${t}`);
        stuck = (st.p.a * 1e6 + st.p.b === before) ? stuck + 1 : 0;
        assert.ok(st.cam.fW >= 0 && st.cam.fW <= (w.pxW - 241) << 8 && st.cam.fX >= 0 && st.cam.fX <= (w.pxH - 277) << 8, 'camera inside map');
      }
    }
  });
  ok(`${tag}: camera keeps the player on screen while walking`, () => {
    const st = { p: S.makePlayer(sp.x, sp.y, 0), cam: S.makeCamera() };
    S.cameraSnap(w, st.cam, st.p.a - 30720, st.p.b - 35328);
    for (let t = 0; t < 60; t++) {
      S.gameTick(w, st, 0, t * 100, { x: 1, y: -15 });
      const sx = (st.p.a >> 8) - (st.cam.fW >> 8); assert.ok(sx >= 0 && sx <= 240, `tick ${t}: player screen x = ${sx}`);
    }
  });
}
ok('input counters: press/hold/release like d.ao/d.an', () => {
  const i = new Input(); i.press(7); assert.equal(i.ao[7], 1); i.tick(); assert.equal(i.an[7], 1); assert.equal(i.ao[7], 2);
  i.release(7); assert.equal(i.ao[7], -2); i.tick(); assert.equal(i.an[7], -2); assert.equal(i.ao[7], 0);   // still "pressed" for z() in the release tick
  i.tick(); assert.equal(i.an[7], 0);
});
ok('key -> direction table (lowest index wins)', () => {
  const an = new Int8Array(15); an[7] = 1; assert.equal(S.keyDirection(an), 0);   // right
  an[3] = 1; assert.equal(S.keyDirection(an), 4);                                  // up beats right
  assert.equal(S.keyDirection(new Int8Array(15)), -1);
});
ok('animation player: frame lasts `time` ticks, time 0 holds', () => {
  const a = new S.AnimPlayer({ animations: [[{ frame: 1, time: 2 }, { frame: 2, time: 1 }], [{ frame: 5, time: 0 }]] });
  assert.equal(a.cur().frame, 1); a.tick(); assert.equal(a.cur().frame, 1); a.tick(); assert.equal(a.cur().frame, 2); a.tick(); assert.equal(a.cur().frame, 1);
  a.set(1); for (let i = 0; i < 20; i++) a.tick(); assert.equal(a.cur().frame, 5);
});
console.log(fails ? `\n${fails} FAILED` : '\nall passed'); process.exit(fails ? 1 : 0);
