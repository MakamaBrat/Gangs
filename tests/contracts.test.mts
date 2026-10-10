import fs from 'node:fs';
import { fileURLToPath } from 'node:url';
import { generateContract, pickDestination, rankScore, roundTo50, systemDistance, updateRank, RANK_START, type ContractWorld } from '../src/contracts';
const ok = (n: string, c: boolean, extra = '') => console.log(c ? 'OK  ' : 'FAIL', n, extra);
const systems = JSON.parse(fs.readFileSync(fileURLToPath(new URL('../public/data/systems.json', import.meta.url)), 'utf8'));

// --- ранг ---
ok('очки: 4 убийства + t/2 + руда/50 + редкие + 2·контракты', rankScore({ kills: 4, t: 5, ore: 120, rare: 1, contracts: 3 }) === 4 + 2 + 2 + 1 + 6, `(${rankScore({ kills: 4, t: 5, ore: 120, rare: 1, contracts: 3 })})`);
let r = RANK_START;
const st = { kills: 19, t: 0, ore: 0, rare: 0, contracts: 0 };
ok('порог 15 × 1.3 = 19.5: 19 очков — ранг 1', updateRank(r, st).rank === 1);
st.kills = 20; r = updateRank(r, st);
ok('20 очков > 19.5 → ранг 2, порог = 20', r.rank === 2 && r.threshold === 20);
st.kills = 25; ok('25 < 20×1.3 = 26 → ранг не растёт', updateRank(r, st).rank === 2);
st.kills = 27; ok('27 > 26 → ранг 3', updateRank(r, st).rank === 3);
st.kills = 1000; ok('за один вызов не больше +1', updateRank(r, st).rank === 3);

// --- дистанция ---
ok('одна и та же система → 0', systemDistance(systems[0], systems[0]) === 0);
const d01 = systemDistance(systems[0], systems[1]);
ok('Suteo→Pan: floor(sqrt(3²+3²+0²)=4.24)=4 × 18.85 = 75.4', Math.abs(d01 - 4 * 18.85) < 1e-9, `(${d01.toFixed(2)})`);
ok('симметрична', systemDistance(systems[3], systems[7]) === systemDistance(systems[7], systems[3]));

// --- округление до 50 ---
ok('1234 → 1200 (вниз)', roundTo50(1234) === 1200);
ok('1260 → 1250 (вниз)', roundTo50(1260) === 1250);
ok('1275 → 1300 (ровно 25 — вверх)', roundTo50(1275) === 1300);
ok('1300 → 1300', roundTo50(1300) === 1300);

// --- генератор ---
const mkWorld = (over: Partial<ContractWorld> = {}): ContractWorld => ({
  currentSystem: 0, storyStep: 20, rank: 1, systems, discovered: () => true, currentStation: systems[0].stations[0],
  offeredStations: [], itemInfo: () => ({ value: 100, level: 5 }), deliverableItems: [100, 101, 102], ...over });
let seed = 12345; const rnd = (n: number) => { seed = (seed * 1103515245 + 12345) & 0x7fffffff; return seed % n; };
let bad = 0; const types = new Set<number>(); let allMult50 = true;
for (let i = 0; i < 400; i++) {
  const c = generateContract({ faction: 2, station: systems[2].stations[0], role: 0 }, mkWorld({ rank: 1 + (i % 10) }), rnd);
  types.add(c.type);
  if (c.type === 8 || c.difficulty < 1 || c.difficulty > 10 && c.type !== 8 || c.reward < 1000 && c.type !== 8) bad++;
  if (c.reward % 50 !== 0) allMult50 = false;
}
ok('400 контрактов: типы из набора без 8 (при роли ≠ 5), награда кратна 50', allMult50 && !types.has(8) && bad === 0, `(типы: ${[...types].sort((a, b) => a - b).join(',')})`);
const early = new Set<number>(); for (let i = 0; i < 200; i++) early.add(generateContract({ faction: 0, station: 0, role: 0 }, mkWorld({ storyStep: 3 }), rnd).type);
ok('до шага 16 только типы 11, 0, 7, 4, 12', [...early].every((t) => [11, 0, 7, 4, 12].includes(t)), `(${[...early].sort((a, b) => a - b).join(',')})`);
const del = generateContract({ faction: 1, station: systems[1].stations[0], role: 5 }, mkWorld(), rnd);
ok('роль 5 → доставка (тип 8), назначение — станция агента', del.type === 8 && del.destStation === systems[1].stations[0] && del.qty >= 5 && del.qty < 20);
const hi = generateContract({ faction: 0, station: 0, role: 0 }, mkWorld({ rank: 20, storyStep: 20 }), () => 0);
const lo = generateContract({ faction: 0, station: 0, role: 0 }, mkWorld({ rank: 1, storyStep: 20 }), () => 0);
ok('награда растёт с рангом на 200 за ранг', hi.type === lo.type && hi.reward - lo.reward >= 19 * 200 - 50 && hi.reward - lo.reward <= 19 * 200 + 50, `(${lo.reward} → ${hi.reward})`);
const w = mkWorld({ offeredStations: [systems[0].stations[0]] });
let dd = new Set<number>(); for (let i = 0; i < 200; i++) dd.add(pickDestination(systems[0].stations[0], w, rnd));
ok('уже предложенные станции не выбираются заново', !dd.has(systems[0].stations[0]));
const w2 = mkWorld({ discovered: (s) => s === 0 }); let all0 = true;
for (let i = 0; i < 200; i++) { const d = pickDestination(0, w2, rnd); if (!systems[0].stations.includes(d)) all0 = false; }
ok('неоткрытые системы не выбираются', all0);

// --- контракт → план миссии ---
import { contractMissionPlan } from '../src/contracts';
let withPlan = 0, withoutPlan = 0; const noPlan = new Set<number>();
for (let i = 0; i < 300; i++) {
  const c = generateContract({ faction: 2, station: systems[2].stations[0], role: 0 }, mkWorld({ rank: 5 }), rnd);
  const p = contractMissionPlan(c, rnd);
  if (p) { withPlan++; if (p.type !== c.type) withoutPlan += 1000; } else { withoutPlan++; noPlan.add(c.type); }
}
ok('для контрактов генератора есть план миссии (кроме типов без ветки в ed.java)', withPlan === 300 && withoutPlan === 0, `(с планом ${withPlan}, без плана типы: ${[...noPlan].sort((a, b) => a - b).join(',') || '—'})`);
