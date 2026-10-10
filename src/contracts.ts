import type { StarSystem } from './assets';
import { planMission, type Contract } from './missions';

/**
 * Контракты и награды — порт bx.a(cy) (генератор), cr.a(dx,dx) (дистанция), cf.void_e() (ранг).
 * [КОД] — правило прямо из декомпиляции; [ДОГАДКА] — моя интерпретация.
 * Параметры мира (какие системы открыты, что уже предложено) приходят через ContractWorld.
 */

/* ----------------------------- ранг игрока ----------------------------- */

/** Статистика, из которой считается ранг (поля cf: C, t, l, m, D). */
export interface RankStats {
  /** cf.C — уничтожено кораблей игроком (растёт в cf.void_f из ed.a(false)) */
  kills: number;
  /** cf.t — растёт на `1 + agent.j()` в Main/d.java (case 6); смысл не выяснен */
  t: number;
  /** cf.l — добыто руды (сумма количества при добыче) */
  ore: number;
  /** cf.m — число найденных редких предметов при добыче */
  rare: number;
  /** cf.D — выполнено контрактов (cf.void_a) */
  contracts: number;
}

export interface RankState { rank: number; threshold: number }
/** [КОД] cf.void_i(): E = 1, F = 15 */
export const RANK_START: RankState = { rank: 1, threshold: 15 };

/** [КОД] cf.void_e(): C + t/2 + l/50 + m + 2·D, целочисленное деление как в Java */
export const rankScore = (s: RankStats): number =>
  s.kills + Math.trunc(s.t / 2) + Math.trunc(s.ore / 50) + s.rare + 2 * s.contracts;

/** [КОД] ранг растёт на 1, когда очки больше порога × 1.3; порог становится равным очкам. За один вызов — не больше +1. */
export function updateRank(state: RankState, stats: RankStats): RankState {
  const score = rankScore(stats);
  if (state.threshold * 1.3 < score) return { rank: state.rank + 1, threshold: score };
  return state;
}

/* ----------------------------- дистанция ----------------------------- */

/** [КОД] cr.a(dx, dx): floor(sqrt(Σ(Δ)²)), z делится на 10 (целочисленно), результат × 18.85; одна и та же система → 0 */
export function systemDistance(a: Pick<StarSystem, 'id' | 'pos'>, b: Pick<StarSystem, 'id' | 'pos'>): number {
  if (a.id === b.id) return 0;
  const dx = a.pos[0] - b.pos[0];
  const dy = a.pos[1] - b.pos[1];
  const dz = Math.trunc(a.pos[2] / 10) - Math.trunc(b.pos[2] / 10);
  return Math.floor(Math.sqrt(dx * dx + dy * dy + dz * dz)) * 18.85;
}

/* ----------------------------- генератор ----------------------------- */

export interface AgentLike {
  /** cy.int_c() — фракция (идёт в контракт как dj.int_e) */
  faction: number;
  /** cy.int_e() — домашняя станция (кандидат назначения) */
  station: number;
  /** cy.int_b() — роль; 5 → контракт-доставка (тип 8) */
  role: number;
}

export interface ContractWorld {
  /** индекс текущей системы (cf.dx_a().int_a()) */
  currentSystem: number;
  /** сюжетный шаг (cf.int_a()); до 16 генератор выдаёт упрощённый набор */
  storyStep: number;
  rank: number;
  systems: Pick<StarSystem, 'id' | 'pos' | 'stations' | 'neighbors'>[];
  /** cf.boolean_arr_a — открыта ли система */
  discovered(system: number): boolean;
  /** станция, где игрок находится сейчас (cf.bv_a().int_b()) */
  currentStation: number;
  /** уже предложенные назначения (bx.a[]) */
  offeredStations: number[];
  /** цена/ценность предмета для типа 8 (ad.g()) и «значимость» (ad.int_c()) */
  itemInfo?(id: number): { value: number; level: number } | undefined;
  /** индексы предметов, подходящих для доставки (≥ 97, e() ≠ 0, кроме 175/164/131) */
  deliverableItems?: number[];
}

export interface GeneratedContract extends Contract {
  /** награда, кредиты (dj.int_f) */
  reward: number;
  /** второе значение, dj.int_g (b(n2)); смысл не выяснен — похоже на задаток/штраф [ДОГАДКА] */
  bonus: number;
  /** станция назначения (dj.h) */
  destStation: number;
  /** dj.a(n7, n6): предмет/тип единицы и их число */
  itemId: number;
  qty: number;
  faction: number;
}

type Rnd = (n: number) => number;
const defaultRnd: Rnd = (n) => Math.floor(Math.random() * n);

/** [КОД] округление до кратного 50 из bx.a: r = trunc(x) % 50; вверх, если (x + r) % 50 == 0, иначе вниз */
export function roundTo50(x: number): number {
  const r = Math.trunc(x) % 50;
  return (x + r) % 50 === 0 ? x + r : x - r;
}

/** [КОД] bx.a(dx[], int): выбор станции назначения */
export function pickDestination(agentStation: number, w: ContractWorld, rnd: Rnd = defaultRnd): number {
  const cur = w.systems[w.currentSystem];
  for (let guard = 0; guard < 10000; guard++) {
    let st: number;
    if (rnd(100) < 20) st = agentStation;
    else if (rnd(100) < 40) st = cur.stations[rnd(cur.stations.length)];
    else st = rnd(100);
    if (w.currentSystem === 15) st = cur.stations[rnd(cur.stations.length)]; // [КОД] особый случай системы 15
    if (w.offeredStations.includes(st)) continue;
    let sys = 0;
    for (let i = 0; i < w.systems.length; i++) if (w.systems[i].stations.includes(st)) { sys = i; break; }
    if (!w.discovered(sys)) continue;
    // [КОД] принимается система с непустым списком соседей (dx.int_arr_b != null) или текущая
    if (!(w.systems[sys].neighbors.length > 0 || sys === w.currentSystem)) continue;
    return st;
  }
  return agentStation; // страховка от бесконечного цикла (в оригинале цикл без выхода)
}

/** [КОД] bx.a(cy): полный генератор одного контракта */
export function generateContract(agent: AgentLike, w: ContractWorld, rnd: Rnd = defaultRnd): GeneratedContract {
  const systems = w.systems;
  let dest = pickDestination(agent.station, w, rnd);
  if (w.currentSystem === 15) dest = systems[15].stations[0] + rnd(4); // [КОД] cf.dx.int_arr_a()[0] + nextInt(4)

  let type = 0;
  do { type = rnd(13); } while (type === 8);
  if (w.storyStep < 16) type = [11, 0, 7, 4, 12][rnd(5)];
  if (type === 12) dest = agent.station;
  if (agent.role === 5) { type = 8; dest = agent.station; }
  if (type === 11 || type === 0) {
    let guard = 0;
    while (dest === w.currentStation && guard++ < 1000) dest = pickDestination(agent.station, w, rnd);
  }

  let difficulty = w.storyStep < 16 ? 1 + rnd(2) : 1 + rnd(9);
  let qty = 0;
  let itemId = 0;
  const items = w.deliverableItems ?? [];
  if (type === 8) {
    itemId = items.length ? items[rnd(items.length)] : 97;
    qty = 5 + rnd(15);
    difficulty = w.itemInfo?.(itemId)?.level ?? difficulty;
  } else if (type === 3 || type === 5) {
    qty = 2 + Math.trunc(8 * (difficulty / 10));
    itemId = type === 3 ? 116 : 117;
  } else if (type === 0) {
    qty = 5 + Math.trunc(95 * (difficulty / 10));
    itemId = rnd(7);
  } else if (type === 11) {
    qty = 2 + Math.trunc(18 * (difficulty / 10));
  } else if (type === 2) {
    qty = 2 + rnd(4);
  }
  difficulty = Math.min(10, difficulty); // k.c(10, n5)

  // [КОД] награда
  const destSystem = Math.max(0, systems.findIndex((s) => s.stations.includes(dest)));
  const dist = systemDistance(systems[w.currentSystem], systems[destSystem]);
  let f = 1500 + Math.trunc((difficulty / 10) * 5500);
  f *= 1 + dist / 1200;
  f += w.rank * 200;
  if (type === 7) f *= 0.7;
  else if (type === 9) f *= 1.2;
  else if (type === 8) f = f / 2 + qty * (w.itemInfo?.(itemId)?.value ?? 0) * 3;
  else if (type === 11) { f *= 0.6; f += qty * (f / 5); }
  else if (type === 5 || type === 3) f *= 2;
  const reward = Math.trunc(roundTo50(f));

  let bonus = Math.trunc(reward / 10 + rnd(Math.max(1, Math.trunc(reward / 10))));
  if (type === 8) bonus = Math.trunc(bonus * 0.5);
  bonus = Math.trunc(roundTo50(bonus));

  return { type, difficulty, count: qty, reward, bonus, destStation: dest, itemId, qty, faction: agent.faction };
}

/** План миссии для сгенерированного контракта: тип, сложность и число единиц идут прямо в planMission (ed.java). */
export function contractMissionPlan(c: GeneratedContract, rnd?: (n: number) => number) {
  return planMission({ type: c.type, difficulty: c.difficulty, count: c.qty }, rnd);
}
