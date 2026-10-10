import { FP } from './fixed';

/**
 * Попадания и снаряды — из br.java (пул снарядов) и ak.java (пулы щит/броня/корпус).
 * Все расстояния здесь в raw-юнитах движка (4096 = 1.0 единицы сцены).
 */

/**
 * Проверка попадания из br.a(long): по каждой оси d = цель − снаряд + смещение_за_кадр,
 * попадание, если |d| < радиус по всем трём осям (куб, а не шар). [КОД]
 * Радиус цели — ak.float_a() (int-усечение).
 */
export function boxHit(
  target: readonly [number, number, number], proj: readonly [number, number, number],
  disp: readonly [number, number, number], radius: number,
): boolean {
  const r = Math.trunc(radius);
  for (let i = 0; i < 3; i++) {
    const d = target[i] - proj[i] + disp[i];
    if (d >= r || d <= -r) return false;
  }
  return true;
}

/** Смещение снаряда за кадр, raw: скорость (атрибут 13, raw/мс) × dt. [КОД: br.a(dl,long,bool)] */
export const projectileDisplacement = (speedRaw: number, dtMs: number): number => speedRaw * dtMs;

/** Ослабление урона по площади из br.b(): (радиус − расстояние) / радиус, 0 за радиусом. [КОД] */
export function splashFactor(dist: number, radius: number): number {
  if (dist >= radius) return 0;
  return Math.min(1, (radius - dist) / radius);
}

/** Для ракет с броней (ak.boolean_a): урон по площади ×0.6. [КОД] */
export const SPLASH_ARMORED_FACTOR = 0.6;

export interface Pools {
  hull: number;
  /** дробное значение, как float в ak */
  shield: number;
  armor: number;
}

/**
 * ak.b(int dmg, bool): щит → броня → корпус. Щит перед вычитанием усекается до int. [КОД]
 * Возвращает true, если корпус исчерпан (≤ 0).
 */
export function applyDamage(p: Pools, dmg: number): boolean {
  let rem = Math.trunc(p.shield) - Math.trunc(dmg);
  if (rem < 0) {
    p.shield = 0;
    rem = p.armor - -rem;
    if (rem < 0) {
      p.armor = 0;
      p.hull -= -rem;
    } else {
      p.armor = rem;
    }
  } else {
    p.shield = rem;
  }
  if (p.hull <= 0) { p.hull = 0; return true; }
  return false;
}

/** Лимиты регенерации из dq (ремонтный робот — предмет категории 15). [КОД] */
export const REPAIR = { hullEveryMs: 600, armorEveryMs: 1000, perTick: 1 } as const;
/** Щит восстанавливается каждые 100 мс (если время зарядки > 0). [КОД] */
export const SHIELD_TICK_MS = 100;

/** Скорость снаряда в единицах сцены в секунду. */
export const rawPerMsToUnitsPerSec = (v: number): number => (v * 1000) / FP;
