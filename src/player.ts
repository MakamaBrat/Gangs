import type { ItemDef, ShipDef } from './assets';
import { applyDamage, REPAIR, SHIELD_TICK_MS } from './combat';
import { angleToRad } from './fixed';

/**
 * Корабль игрока: формулы из dq.a(int, cq, ae, ay, int), df.void_d() и ak.java.
 * [КОД] — число/формула прямо из кода, [ДОГАДКА] — моя интерпретация.
 */

/** Значение атрибута предмета по ключу (ad.int_a(key); в оригинале «нет» = -979797979). */
export function attr(item: ItemDef | undefined, key: number): number | undefined {
  if (!item) return undefined;
  for (const [k, v] of item.attrs) if (k === key) return v;
  return undefined;
}

/** категория предмета (ad.d()) — пара с ключом 2 */
export const itemCategory = (item: ItemDef): number => attr(item, 2) ?? -1;
export const itemId = (item: ItemDef): number => attr(item, 0) ?? item.id;

/** Категории из df.void_d(): 0,1,2,3,8 — оружие; 9 — щит; 10 — броня; 12 — расширение трюма; 14 — форсаж; 16 — двигатель. */
export const CAT = { WEAPONS: [0, 1, 2, 3, 8], SHIELD: 9, ARMOR: 10, CARGO: 12, BOOSTER: 14, REPAIR: 15, ENGINE: 16 } as const;
export const isWeapon = (item: ItemDef): boolean => (CAT.WEAPONS as readonly number[]).includes(itemCategory(item));

/** Название предмета: строка ru.lang[569 + id] (проверено на оружии, щитах, форсаже, двигателях). */
export const ITEM_NAME_BASE = 569;
export const itemName = (lang: string[], item: ItemDef): string => lang[ITEM_NAME_BASE + itemId(item)] ?? `#${itemId(item)}`;

export interface Loadout {
  booster?: ItemDef;
  engine?: ItemDef;
  shield?: ItemDef;
  armor?: ItemDef;
  /** категория 15 — «Робот-помощник»: чинит корпус (+1/600 мс) и броню (+1/1000 мс) */
  repair?: ItemDef;
}

export interface ShipStats {
  /** базовый корпус (ships.bin, 2-е поле) */
  hull: number;
  shieldMax: number;
  /** время полной зарядки щита, мс (атрибут 17) */
  shieldRechargeMs: number;
  armorMax: number;
  /** df.int_e(): корпус + щит + броня */
  totalHp: number;
  /** манёвренность: ships.bin[8]/100 + бонус двигателя/100 (df.float_a + df.m/100) */
  maneuver: number;
  hasBooster: boolean;
  hasRepair: boolean;
  /** скорость форсажа, raw/мс: 2 + (int)(бонус%/100*2) */
  boostSpeed: number;
  boostDurationMs: number;
  boostCooldownMs: number;
}

/** [КОД] крейсерская скорость, raw-юнитов в мс (в dq: var_int_a = 2) */
export const CRUISE_SPEED = 2;
/** [КОД] предел визуального крена, единиц угла (384 ≈ 33.75°) */
export const MAX_BANK = 384;

export function computeStats(ship: ShipDef, lo: Loadout): ShipStats {
  const shieldMax = attr(lo.shield, 16) ?? 0;
  const armorMax = attr(lo.armor, 18) ?? 0;
  const boostPct = attr(lo.booster, 23) ?? 0;
  return {
    hull: ship.f1,
    shieldMax,
    shieldRechargeMs: attr(lo.shield, 17) ?? 0,
    armorMax,
    totalHp: ship.f1 + shieldMax + armorMax,
    maneuver: ship.scale + (attr(lo.engine, 26) ?? 0) / 100,
    hasBooster: !!lo.booster,
    hasRepair: !!lo.repair,
    boostSpeed: CRUISE_SPEED + Math.trunc((boostPct / 100) * 2),
    boostDurationMs: attr(lo.booster, 25) ?? 0,
    boostCooldownMs: attr(lo.booster, 24) ?? 0,
  };
}

export interface FlightInput {
  /** -1..1: поворот влево(+)/вправо(-) — ось, которая кренит корабль (dq: var_int_f) */
  yaw: number;
  /** -1..1: тангаж (dq: var_int_e) */
  pitch: number;
  boost: boolean;
}

export interface FlightStep {
  yawRad: number;
  pitchRad: number;
  /** шаг вперёд за кадр в raw-юнитах */
  forwardRaw: number;
  /** визуальный крен, радианы */
  bankRad: number;
  boosting: boolean;
  boostReady: boolean;
}

export class PlayerFlight {
  readonly stats: ShipStats;
  speed = CRUISE_SPEED;
  boosting = false;
  /** dq.var_int_j: растёт с каждым кадром; отрицательное значение — перезарядка форсажа */
  boostTimer = 0;
  /** dq.var_int_g: накопленный крен, единиц угла */
  bank = 0;
  hull: number;
  shield: number;
  armor: number;
  private shieldTimer = 0;
  private hullTimer = 0;
  private armorTimer = 0;
  /** сообщение «Ускоритель готов» (lang 155): сработает один раз при выходе из перезарядки */
  boostReadyEvent = false;

  constructor(stats: ShipStats) {
    this.stats = stats;
    this.hull = stats.hull;
    this.shield = stats.shieldMax;
    this.armor = stats.armorMax;
  }

  get hp(): number { return this.hull + this.shield + this.armor; }

  /** [КОД] ak.b(): щит → броня → корпус, щит усекается до int (см. combat.applyDamage). true — корабль уничтожен. */
  damage(n: number): boolean {
    const p = { hull: this.hull, shield: this.shield, armor: this.armor };
    const dead = applyDamage(p, n);
    this.hull = p.hull; this.shield = p.shield; this.armor = p.armor;
    return dead;
  }

  /** [КОД] форсаж доступен, если он установлен и таймер ≥ 0 */
  canBoost(): boolean { return this.stats.hasBooster && !this.boosting && this.boostTimer >= 0; }

  step(dtMs: number, inp: FlightInput): FlightStep {
    const st = this.stats;
    this.boostReadyEvent = false;

    // [КОД] таймер растёт всегда; при выходе из отрицательной зоны — событие «готов»
    const wasCooling = this.boostTimer < 0;
    this.boostTimer += dtMs;
    if (wasCooling && this.boostTimer >= 0 && st.hasBooster) this.boostReadyEvent = true;

    if (inp.boost && this.canBoost()) {
      this.boosting = true;
      this.boostTimer = 0;
      this.speed = st.boostSpeed;
    }
    // [КОД] по истечении длительности: скорость 2, таймер = -перезарядка
    if (this.boosting && this.boostTimer > st.boostDurationMs) {
      this.boosting = false;
      this.speed = CRUISE_SPEED;
      this.boostTimer = -st.boostCooldownMs;
    }

    // [КОД] поворот за кадр: манёвренность * ввод * dt / 3 единиц угла (ось «yaw» кренит корабль)
    const k = (st.maneuver * dtMs) / 3;
    const yawRad = angleToRad(inp.yaw * k);
    const pitchRad = angleToRad(inp.pitch * k);

    // [КОД] крен: растёт на манёвренность*dt до ±384, без ввода затухает на dt/2 за мс
    if (inp.yaw !== 0) {
      this.bank = Math.max(-MAX_BANK, Math.min(MAX_BANK, this.bank + Math.sign(inp.yaw) * st.maneuver * dtMs));
    } else if (this.bank > 0) {
      this.bank = Math.max(0, this.bank - dtMs / 2);
    } else if (this.bank < 0) {
      this.bank = Math.min(0, this.bank + dtMs / 2);
    }

    // [КОД] щит: каждые 100 мс + shieldMax/(rechargeMs/100); при rechargeMs=0 восстановления нет
    if (st.shieldRechargeMs > 0 && st.shieldMax > 0) {
      this.shieldTimer += dtMs;
      while (this.shieldTimer >= SHIELD_TICK_MS) {
        this.shieldTimer -= SHIELD_TICK_MS;
        this.shield = Math.min(st.shieldMax, this.shield + st.shieldMax / (st.shieldRechargeMs / 100));
      }
    }

    // [КОД] ремонтный робот: корпус +1 каждые 600 мс, броня +1 каждые 1000 мс
    if (st.hasRepair) {
      this.hullTimer += dtMs;
      this.armorTimer += dtMs;
      if (this.hullTimer > REPAIR.hullEveryMs) {
        this.hullTimer = 0;
        if (this.hull < st.hull) this.hull = Math.min(st.hull, this.hull + REPAIR.perTick);
      }
      if (this.armorTimer > REPAIR.armorEveryMs) {
        this.armorTimer = 0;
        if (this.armor < st.armorMax) this.armor = Math.min(st.armorMax, this.armor + REPAIR.perTick);
      }
    }

    return { yawRad, pitchRad, forwardRaw: dtMs * this.speed, bankRad: angleToRad(this.bank),
      boosting: this.boosting, boostReady: this.canBoost() };
  }
}

/**
 * Параметры оружия из атрибутов предмета. Подтверждено кодом (ed.java:196 → br): 9 — урон (ak.b), 12 — время жизни снаряда, мс,
 * 13 — скорость, raw/мс. Атрибут 11 (br.d) — [ДОГАДКА]: интервал выстрелов; использование не найдено.
 */
export interface WeaponStats {
  damage: number;
  /** интервал между выстрелами, мс (атрибут 11) — ДОГАДКА */
  intervalMs: number;
  /** время жизни снаряда, мс (атрибут 12) — КОД */
  lifetimeMs: number;
  /** скорость снаряда, raw/мс (атрибут 13) — КОД */
  speedRaw: number;
}

export function weaponStats(item: ItemDef): WeaponStats {
  return {
    damage: attr(item, 9) ?? 1,
    intervalMs: attr(item, 11) ?? 400,
    lifetimeMs: attr(item, 12) ?? 2000,
    speedRaw: attr(item, 13) ?? 12,
  };
}
