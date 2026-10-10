import * as THREE from 'three';
import { FP } from './fixed';

/**
 * Поведение вражеского корабля, восстановленное из cb.a(long) (декомпиляция, местами искажена).
 * Помечено: [КОД] — число/правило прямо из кода, [ДОГАДКА] — моя интерпретация или подстановка.
 */
export const AI = {
  /** [КОД] переоценка цели каждые 5000 мс; 30% шанс переключиться на случайную цель */
  retargetMs: 5000,
  retargetSwitchPct: 30,
  /** [КОД] дальность обнаружения цели по каждой оси: 50000 (100000 в одном режиме cf.boolean_c) */
  detectRange: 50000 / FP,
  /** [КОД] скорость/поворот по умолчанию (поля var_float_a/b = 2.0), единицы: raw-юнитов на мс */
  cruiseSpeed: 2.0,
  cruiseTurn: 2.0,
  /** [КОД] «паника» после потери >40% корпуса: скорость 3.0, поворот 1.3 на 5000–8000 мс */
  evadeSpeed: 3.0,
  evadeTurn: 1.3,
  evadeDamageFrac: 0.4,
  evadeMinMs: 5000,
  evadeRandMs: 3000,
  /** [КОД] дополнительный шанс уйти в манёвр при переоценке: поле var_int_o = 20 (%) */
  evadeChancePct: 20,
  /** [КОД] стрельба, когда ошибка наведения по обеим осям < 0.05 */
  aimTolerance: 0.05,
  /** [КОД] дальность стрельбы по осям 35000 */
  fireRange: 35000 / FP,
  /** [КОД] обломки держатся 45000 мс (состояние 4), затем удаляются */
  wreckMs: 45000,
  /** [ДОГАДКА] период выстрелов и урон — в коде зависят от оружия, здесь подстановка */
  fireIntervalMs: 700,
  damagePerHit: 12,
} as const;

export type EnemyState = 'combat' | 'exploding' | 'wreck';

const RAW_PER_MS_TO_UNITS_PER_S = 1000 / FP; // raw-юнитов/мс -> единиц сцены/с

export class EnemyShip {
  readonly pos = new THREE.Vector3();
  /** текущее направление носа (единичный вектор) */
  readonly fwd = new THREE.Vector3(0, 0, -1);
  state: EnemyState = 'combat';
  hull: number;
  readonly maxHull: number;
  speed: number = AI.cruiseSpeed;
  turn: number = AI.cruiseTurn;
  /** радиус попадания в единицах сцены */
  radius: number;
  private sinceRetarget = 0;
  private lostHull = 0;
  private lastHull: number;
  private evadeUntil = 0;
  private evadeTimer = 0;
  private fireCd = 0;
  stateMs = 0;
  /** выставляется при выстреле; потребитель сам создаёт снаряд */
  wantsFire = false;

  constructor(pos: THREE.Vector3, hull = 100, radius = 0.12) {
    this.pos.copy(pos);
    this.hull = this.maxHull = this.lastHull = hull;
    this.radius = radius;
  }

  damage(n: number): void {
    if (this.state !== 'combat') return;
    this.hull -= n;
    if (this.hull <= 0) { this.state = 'exploding'; this.stateMs = 0; }
  }

  /** Шаг симуляции. dtMs — миллисекунды кадра. */
  update(dtMs: number, target: THREE.Vector3): void {
    this.wantsFire = false;
    this.stateMs += dtMs;

    if (this.state === 'exploding') {
      // [КОД] взрыв, затем состояние 4 (обломки)
      if (this.stateMs > 800) { this.state = 'wreck'; this.stateMs = 0; }
      return;
    }
    if (this.state === 'wreck') return;

    this.sinceRetarget += dtMs;

    // [КОД] «паника»: потеря >40% корпуса -> скорость 3.0 / поворот 1.3 на 5–8 с
    if (this.lastHull > this.hull) {
      this.lostHull += this.lastHull - this.hull;
      this.lastHull = this.hull;
      if ((this.lostHull / this.maxHull) * 100 > AI.evadeDamageFrac * 100) {
        this.lostHull = 0;
        this.sinceRetarget = AI.retargetMs + 1;
        this.evadeTimer = 0;
        this.evadeUntil = AI.evadeMinMs + Math.random() * AI.evadeRandMs;
        this.speed = AI.evadeSpeed;
        this.turn = AI.evadeTurn;
      }
    }
    if (this.speed === AI.evadeSpeed) {
      this.evadeTimer += dtMs;
      if (this.evadeTimer > this.evadeUntil) {
        this.speed = AI.cruiseSpeed;
        this.turn = AI.cruiseTurn;
      }
    }

    const to = target.clone().sub(this.pos);
    const dist = to.length();
    const desired = dist > 1e-6 ? to.divideScalar(dist) : this.fwd.clone();

    // [ДОГАДКА] в коде вектор курса масштабируется на dt*turn (turn/4096 на мс). Я трактую это как
    // предельную угловую скорость turn/4096 рад/мс (~0.49 рад/с при turn=2.0) и поворачиваю курс
    // к цели на ограниченный угол. Смешивание векторов не умеет разворачиваться на 180°.
    const err = Math.acos(Math.min(1, Math.max(-1, this.fwd.dot(desired))));
    if (err > 1e-6) {
      const step = Math.min(err, (dtMs * this.turn) / FP);
      const axis = new THREE.Vector3().crossVectors(this.fwd, desired);
      if (axis.lengthSq() < 1e-12) axis.crossVectors(this.fwd, new THREE.Vector3(0, 1, 0));
      if (axis.lengthSq() < 1e-12) axis.set(1, 0, 0);
      this.fwd.applyAxisAngle(axis.normalize(), step).normalize();
    }

    // [КОД] полёт вперёд на dt * speed raw-юнитов
    const step = dtMs * this.speed / FP;
    this.pos.addScaledVector(this.fwd, step);

    // [КОД] стрельба при ошибке наведения < 0.05 (здесь — угол в радианах) и в радиусе fireRange
    const aimErr = Math.acos(Math.min(1, Math.max(-1, this.fwd.dot(desired))));
    this.fireCd -= dtMs;
    if (aimErr < AI.aimTolerance && dist < AI.fireRange && dist < AI.detectRange && this.fireCd <= 0) {
      this.fireCd = AI.fireIntervalMs;
      this.wantsFire = true;
    }
  }

  /** скорость в единицах сцены в секунду (для сравнения с игроком) */
  get speedPerSec(): number { return this.speed * RAW_PER_MS_TO_UNITS_PER_S; }
}

/**
 * Точки вылета снарядов залпа из br.java (volley_layouts.json): для N снарядов — N смещений (raw-юниты) в системе корабля.
 * Возвращает смещения в единицах сцены.
 */
export function volleyOffsets(layouts: number[][][], count: number): THREE.Vector3[] {
  const f = layouts[Math.min(Math.max(count, 1), layouts.length) - 1];
  return f.slice(0, count).map(([x, y, z]) => new THREE.Vector3(x / FP, y / FP, z / FP));
}
