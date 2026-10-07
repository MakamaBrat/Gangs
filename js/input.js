// Input layer: reproduces the original key counters (d.ao / d.an, d.keyPressed/keyReleased/q) on top of a PC keyboard.
// Index meaning (phone keypad): 1='0', 2='1', 3='2'/up, 4='3', 5='4'/left, 6='5'/fire, 7='6'/right, 8='7', 9='8'/down, 10='9', 11='*', 12='#', 13/14 = soft keys.
export class Input {
  constructor() { this.ao = new Int8Array(15); this.an = new Int8Array(15); this.held = new Set(); this.phys = new Set(); }
  press(i) { const a = this.ao; if (a[i] > 0) return; if (a[i] < 0) a[i] = 0; if (a[i] < 126) a[i]++; }
  release(i) { if (this.ao[i] > 0) this.ao[i] = -this.ao[i]; }
  // d.q(): called once at the start of every tick
  tick() {
    const { ao, an } = this;
    for (let i = 0; i < 15; i++) {
      an[i] = ao[i];
      if (ao[i] === 0) continue;
      if (ao[i] < 0) { ao[i] = 0; continue; }
      if (ao[i] >= 126) continue;
      ao[i]++;
      if (i >= 13) ao[i] = -ao[i];
    }
  }
  // PC keyboard -> key indices. Arrows/WASD combine into diagonals (the phone has separate 1/3/7/9 keys for that).
  desired() {
    const k = this.phys, up = k.has('ArrowUp') || k.has('KeyW'), dn = k.has('ArrowDown') || k.has('KeyS'),
      lf = k.has('ArrowLeft') || k.has('KeyA'), rt = k.has('ArrowRight') || k.has('KeyD');
    const s = new Set();
    if (up && rt && !dn && !lf) s.add(4); else if (up && lf && !dn && !rt) s.add(2);
    else if (dn && lf && !up && !rt) s.add(8); else if (dn && rt && !up && !lf) s.add(10);
    else { if (up && !dn) s.add(3); if (dn && !up) s.add(9); if (lf && !rt) s.add(5); if (rt && !lf) s.add(7); }
    const digit = { Digit0: 1, Digit1: 2, Digit2: 3, Digit3: 4, Digit4: 5, Digit5: 6, Digit6: 7, Digit7: 8, Digit8: 9, Digit9: 10,
      Numpad0: 1, Numpad1: 2, Numpad2: 3, Numpad3: 4, Numpad4: 5, Numpad5: 6, Numpad6: 7, Numpad7: 8, Numpad8: 9, Numpad9: 10,
      Enter: 6, Space: 6, NumpadMultiply: 11, NumpadDecimal: 12, KeyQ: 13, KeyE: 14 };
    for (const c of k) if (digit[c] !== undefined) s.add(digit[c]);
    return s;
  }
  sync() {
    const want = this.desired();
    for (const i of want) if (!this.held.has(i)) this.press(i);
    for (const i of this.held) if (!want.has(i)) this.release(i);
    this.held = want;
  }
  attach(target) {
    const down = e => { this.phys.add(e.code); this.sync(); if (/^(Arrow|Space)/.test(e.code)) e.preventDefault(); };
    const up = e => { this.phys.delete(e.code); this.sync(); };
    target.addEventListener('keydown', down); target.addEventListener('keyup', up);
    target.addEventListener('blur', () => { this.phys.clear(); this.sync(); });
  }
}
