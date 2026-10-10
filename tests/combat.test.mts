import fs from 'node:fs';
import { fileURLToPath } from 'node:url';
import { applyDamage, boxHit, splashFactor, projectileDisplacement } from '../src/combat';
import { CAT, computeStats, itemCategory, PlayerFlight } from '../src/player';
const ok = (n: string, c: boolean, extra = '') => console.log(c ? 'OK  ' : 'FAIL', n, extra);
const rd = (n: string) => JSON.parse(fs.readFileSync(fileURLToPath(new URL('../public/data/' + n, import.meta.url)), 'utf8'));
const items = rd('items.json'), ships = rd('ships.json');

let p = { hull: 95, shield: 25.9, armor: 40 };
let dead = applyDamage(p, 30);
ok('щит усекается до int: 25.9−30 → щит 0, броня 40−5=35', p.shield === 0 && p.armor === 35 && p.hull === 95 && !dead, JSON.stringify(p));
p = { hull: 95, shield: 0, armor: 5 }; applyDamage(p, 20);
ok('переполнение брони уходит в корпус: 5−20 → корпус 95−15', p.armor === 0 && p.hull === 80, JSON.stringify(p));
p = { hull: 10, shield: 0, armor: 0 }; dead = applyDamage(p, 99);
ok('корпус ≤ 0 → 0 и уничтожен', p.hull === 0 && dead);
p = { hull: 95, shield: 50, armor: 40 }; applyDamage(p, 20);
ok('урон меньше щита: щит 50→30, остальное цело', p.shield === 30 && p.armor === 40 && p.hull === 95);

ok('куб, не шар: по диагонали внутри куба попадание', boxHit([0, 0, 0], [90, 90, 90], [0, 0, 0], 100));
ok('вне куба по одной оси — промах', !boxHit([0, 0, 0], [90, 90, 100], [0, 0, 0], 100));
ok('смещение за кадр входит в формулу (цель − снаряд + смещение)', boxHit([0, 0, 0], [150, 0, 0], [-60, 0, 0], 100) === false && boxHit([0, 0, 0], [150, 0, 0], [60, 0, 0], 100) === true);
ok('splash: центр=1, середина=0.5, край/за краем=0', splashFactor(0, 1000) === 1 && splashFactor(500, 1000) === 0.5 && splashFactor(1000, 1000) === 0 && splashFactor(1500, 1000) === 0);
ok('смещение снаряда: скорость 12 raw/мс × 50 мс = 600', projectileDisplacement(12, 50) === 600);

const byCat = (c: number) => items.filter((i: any) => itemCategory(i) === c);
const lo = { booster: byCat(CAT.BOOSTER)[0], engine: byCat(CAT.ENGINE)[0], shield: byCat(CAT.SHIELD)[0], armor: byCat(CAT.ARMOR)[0] };
const bot = byCat(CAT.REPAIR)[0];
const a = new PlayerFlight(computeStats(ships[0], { ...lo, repair: bot }));
a.hull = 50; a.armor = 10;
for (let t = 0; t < 6000; t += 50) a.step(50, { yaw: 0, pitch: 0, boost: false });
ok('ремонтный робот: за 6 с корпус ≈ +9..10, броня ≈ +5..6', a.hull >= 58 && a.hull <= 60 && a.armor >= 15 && a.armor <= 16, `(корпус ${a.hull}, броня ${a.armor})`);
const b = new PlayerFlight(computeStats(ships[0], lo));
b.hull = 50;
for (let t = 0; t < 6000; t += 50) b.step(50, { yaw: 0, pitch: 0, boost: false });
ok('без робота корпус не чинится', b.hull === 50);
const c = new PlayerFlight(computeStats(ships[0], lo));
ok('PlayerFlight.damage = applyDamage (щит→броня→корпус)', (c.damage(60), c.shield === 0 && c.armor === 30 && c.hull === 95));
