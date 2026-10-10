import fs from 'node:fs';
import { fileURLToPath } from 'node:url';
import { attr, CAT, computeStats, itemCategory, itemId, itemName, PlayerFlight, weaponStats, MAX_BANK } from '../src/player';
const rd = (n: string) => JSON.parse(fs.readFileSync(fileURLToPath(new URL('../public/data/' + n, import.meta.url)), 'utf8'));
const items = rd('items.json'), ships = rd('ships.json'), lang: string[] = rd('lang_ru.json');
const ok = (n: string, c: boolean, extra = '') => console.log(c ? 'OK  ' : 'FAIL', n, extra);
const byCat = (c: number) => items.filter((i: any) => itemCategory(i) === c);
const [b60, b80, b160, b200] = byCat(CAT.BOOSTER);

ok('названия предметов: lang[569+id]', itemName(lang, items.find((i: any) => itemId(i) === 50)) === 'Малый щит'
  && itemName(lang, b60) === 'Линейный ускоритель' && itemName(lang, byCat(CAT.ENGINE)[0]) === 'Статичная тяга', `(${itemName(lang, b60)})`);
const ship = ships[0];
const mk = (b: any) => computeStats(ship, { booster: b, engine: byCat(CAT.ENGINE)[0], shield: byCat(CAT.SHIELD)[0], armor: byCat(CAT.ARMOR)[0] });
ok('скорость форсажа: +60%→3, +80%→3, +160%→5, +200%→6 raw/мс',
  [b60, b80, b160, b200].map((b) => mk(b).boostSpeed).join() === '3,3,5,6', [b60, b80, b160, b200].map((b) => mk(b).boostSpeed).join());
const s = mk(b60);
ok('манёвренность = корабль 1.4 + двигатель 20/100', Math.abs(s.maneuver - 1.6) < 1e-9, `(${s.maneuver})`);
ok('макс. HP = корпус + щит + броня = 95+50+40', s.totalHp === 185, `(${s.totalHp})`);

const p = new PlayerFlight(s);
const r1 = p.step(16, { yaw: 0, pitch: 1, boost: false });
ok('тангаж за кадр 16 мс: 1.6*16/3 ед. угла', Math.abs(r1.pitchRad - (1.6 * 16 / 3) * 2 * Math.PI / 4096) < 1e-9);
ok('крейсерская скорость 2 raw/мс', p.speed === 2 && Math.abs(r1.forwardRaw - 32) < 1e-9);
const r2 = p.step(16, { yaw: 0, pitch: 0, boost: true });
ok('форсаж включается, скорость 3', r2.boosting && p.speed === 3);
let t = 0; while (p.boosting && t < 20000) { p.step(50, { yaw: 0, pitch: 0, boost: false }); t += 50; }
ok('форсаж длится ~3000 мс (атрибут 25)', Math.abs(t - 3000) <= 100, `(${t} мс)`);
ok('после форсажа перезарядка: таймер = -8000', p.boostTimer > -8100 && p.boostTimer < -7800 && !p.canBoost(), `(${p.boostTimer})`);
let ready = false; t = 0; while (!p.canBoost() && t < 20000) { p.step(50, { yaw: 0, pitch: 0, boost: false }); t += 50; ready ||= p.boostReadyEvent; }
ok('через ~8 с форсаж снова готов (+событие «Ускоритель готов»)', Math.abs(t - 8000) <= 100 && ready, `(${t} мс)`);

const q = new PlayerFlight(s);
for (let i = 0; i < 40; i++) q.step(16, { yaw: 1, pitch: 0, boost: false });
ok('крен упирается в ±384', q.bank === MAX_BANK, `(${q.bank})`);
for (let i = 0; i < 100; i++) q.step(16, { yaw: 0, pitch: 0, boost: false });
ok('без ввода крен затухает до 0', q.bank === 0);

const h = new PlayerFlight(s);
h.damage(70);
ok('урон: щит 50 → броня 20 (догадка о порядке)', h.shield === 0 && h.armor === 20 && h.hull === 95);
let tt = 0; const w = new PlayerFlight(s); w.damage(25); const before = w.shield;
while (tt < 20000) { w.step(50, { yaw: 0, pitch: 0, boost: false }); tt += 50; }
ok('щит полностью заряжается за ~20 с (атрибут 17 = 20000 мс)', before === 25 && Math.abs(w.shield - 50) < 1e-6, `(${w.shield})`);

const wp = weaponStats(items[0]);
ok('оружие 0: урон 3, интервал 400, жизнь 2000, скорость 12', wp.damage === 3 && wp.intervalMs === 400 && wp.lifetimeMs === 2000 && wp.speedRaw === 12);
ok('attr отсутствует → undefined', attr(items[0], 9999) === undefined);
