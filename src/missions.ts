/**
 * Миссии: генератор (ed.java, switch по типу контракта dj.int_d()) и проверка условий (cl.java).
 * Числа и правила — из кода; [ДОГАДКА] помечено явно. Названия типов в игре мне найти не удалось —
 * имена ниже описывают поведение, а не официальный текст.
 */

/** состояние сущности w.var_short_a: 3 — взрыв, 4 — уничтожен (w.boolean_f / w.boolean_e) */
export const STATE = { EXPLODING: 3, DESTROYED: 4 } as const;

/** Минимальный «вид» сущности, нужный условиям (поля w/cb/ak из кода). */
export interface EntityView {
  /** w.var_short_a */
  state: number;
  /** w.var_int_d — фракция/тип (8 в миссиях — пираты/враги по умолчанию) */
  faction?: number;
  /** cb.boolean_a() */
  arrived?: boolean;
  /** cb.h() */
  flagE?: boolean;
  /** ak.boolean_d() */
  active?: boolean;
  /** w.var_boolean_j */
  flagJ?: boolean;
  /** w.var_int_a (== 0 → условие 25) */
  idle?: boolean;
}

export interface MissionView {
  /** ed.w_arr_a — сущности миссии */
  entities: EntityView[];
  /** ed.w_arr_c — дополнительные сущности (например, астероиды сектора) */
  extra?: EntityView[];
  /** ed.int_b() — оставшиеся враги (ed.l); уменьшается в ed.a(bool) */
  remainingHostile?: number;
  /** ed.int_c() (ed.m) */
  remainingOther?: number;
  /** ed.var_int_c — убийства игрока; ed.var_int_b — убийства не игроком */
  killsPlayer?: number;
  killsOthers?: number;
  /** by_a().dh_b().var_boolean_n — достигнута ли путевая точка */
  waypointReached?: boolean;
  /** ed.ck_arr_a()[i].boolean_b() — диалоги завершены */
  dialogsDone?: boolean[];
  /** ed.boolean_b() */
  flagB?: boolean;
}

/** Условие cl(type, b, c). Номера типов — из cl.java. */
export interface Condition { type: number; b?: number; c?: number }

const destroyed = (e: EntityView | undefined): boolean => e?.state === STATE.DESTROYED;

/** Порт cl.a(int n2): n — прошедшее время для типа 3. */
export function check(cond: Condition, v: MissionView, n = 0): boolean {
  const b = cond.b ?? 0;
  const c = cond.c ?? 0;
  const ents = v.entities;
  switch (cond.type) {
    case 0: return (v.remainingHostile ?? 0) === 0;
    case 5: return (v.remainingOther ?? 0) === 0;
    case 1:
    case 6: return destroyed(ents[b]);
    case 2: return !!v.waypointReached;
    case 3: return n > b;
    case 4: return !!v.dialogsDone?.[b];
    case 22: return !!v.dialogsDone?.[v.dialogsDone.length - 1];
    case 7: { // первые b сущностей уничтожены
      let k = 0;
      for (let i = 0; i < b; i++) if (destroyed(ents[i])) k++;
      return k === b;
    }
    case 8: return (v.extra ?? []).filter(destroyed).length > b;
    case 9: return (v.extra?.length ?? 0) > b ? b === 0 : false; // код: 0 >= b при длине > b
    case 10: return false;
    case 11: return !!ents[b]?.arrived;
    case 12: return !!ents[b]?.flagE;
    case 13: return false;
    case 14: return 0 >= b; // ed.int_a() в этом билде всегда 0
    case 15: return !!ents[b]?.active;
    case 23: return !!ents[b]?.flagJ;
    case 16: return ents.every((e) => !!e.arrived);
    case 17: return ents.some((e) => !!e.flagE);
    case 18: { // все в [b, c) уничтожены
      let k = 0;
      for (let i = b; i < c; i++) if (destroyed(ents[i])) k++;
      return k === c - b;
    }
    case 19: return !!v.flagB;
    case 20:
    case 21: { // все «враги типа 8» в [b, c) уничтожены, и сравнение убийств игрока с чужими
      let k = 0;
      for (let i = b; i < c; i++) if (destroyed(ents[i]) && ents[i].faction === 8) k++;
      if (k !== c - b) return false;
      const mine = v.killsPlayer ?? 0, theirs = v.killsOthers ?? 0;
      return cond.type === 20 ? mine > theirs : mine <= theirs;
    }
    case 25: return !!ents[b]?.idle;
  }
  return false;
}

/** Параметры контракта (класс dj): тип, сложность 0..10 (dj.i()), число из контракта (dj.int_b()), особый флаг (dj.boolean_g()). */
export interface Contract {
  type: number;
  difficulty: number;
  /** dj.int_b() — для некоторых типов число кораблей/объектов задаёт сам контракт */
  count?: number;
  special?: boolean;
}

export interface MissionPlan {
  type: number;
  /** описание поведения (не официальное название) */
  kind: string;
  /** число сущностей по группам, в порядке индексов w_arr_a */
  groups: { role: string; count: number }[];
  win?: Condition;
  lose?: Condition;
  /** лимит времени, мс (ed.p = 121000 для типа 7) */
  timeLimitMs?: number;
  /** что я не смог выяснить */
  notes?: string[];
}

/** (int)(k * difficulty/10) — как в коде: (int)(4.0f * ((float)i / 10.0f)) */
const scale = (k: number, difficulty: number): number => Math.trunc(k * (difficulty / 10));

/**
 * Состав миссии по типу (ed.java, метод настройки миссии). rnd(n) — целое [0, n), для случайных частей.
 * Типы, которых нет в switch (например, 8), возвращают undefined.
 */
export function planMission(ct: Contract, rnd: (n: number) => number = (n) => Math.floor(Math.random() * n)): MissionPlan | undefined {
  const d = ct.difficulty;
  switch (ct.type) {
    case 1: {
      const hostile = 3 + scale(5, d);
      const others = 2 + rnd(6);
      return { type: 1, kind: 'уничтожить группу врагов (рядом нейтралы)', groups: [{ role: 'враги', count: hostile }, { role: 'нейтралы', count: others }],
        win: { type: 7, b: hostile } };
    }
    case 2: {
      const attackers = 2 + scale(4, d);
      const defenders = ct.count ?? 3;
      return { type: 2, kind: 'защитить союзников от атакующих', groups: [{ role: 'атакующие', count: attackers }, { role: 'союзники (корпус ×3)', count: defenders }],
        win: { type: 18, b: 0, c: attackers }, lose: { type: 18, b: attackers, c: attackers + defenders } };
    }
    case 3:
    case 5: {
      const ships = ct.count ?? 3;
      return { type: ct.type, kind: 'сопровождение: последний корабль группы — подопечный', groups: [{ role: 'корабли (последний — VIP)', count: ships }],
        win: { type: 11, b: ships - 1 }, lose: { type: 12, b: ships - 1 },
        notes: ['что именно означают флаги cb.boolean_a (победа) и cb.h (поражение) у VIP — по имени не выяснено; предположительно «прибыл» и «уничтожен»'] };
    }
    case 4: {
      const hostile = 2 + scale(5, d);
      return { type: 4, kind: 'уничтожить пиратов', groups: [{ role: 'враги', count: hostile }], win: { type: 18, b: 0, c: hostile } };
    }
    case 6:
      return { type: 6, kind: 'одна цель с усиленным корпусом', groups: [{ role: 'цель', count: 1 }], win: { type: 1, b: 0 },
        notes: ['корпус цели = сложность × k.c(cf.m(), 20) + 300; k.c в этом порте не разобран'] };
    case 7: {
      const asteroids = 15 + scale(35, d);
      const enemies = scale(2, d);
      return { type: 7, kind: 'расчистить поле астероидов за 121 с', groups: [{ role: 'астероиды', count: asteroids }, { role: 'враги', count: enemies }],
        win: { type: 7, b: asteroids }, timeLimitMs: 121000 };
    }
    case 9: {
      const enemies = 2 + scale(6, d);
      return { type: 9, kind: 'защитить 5 объектов от атакующих', groups: [{ role: 'атакующие', count: enemies }, { role: 'защищаемые объекты', count: 5 }],
        win: { type: 18, b: 0, c: enemies }, lose: { type: 18, b: enemies, c: enemies + 5 } };
    }
    case 10: {
      const objects = 2 + rnd(2);
      const hostile = 2 + scale(2, d);
      return { type: 10, kind: 'уничтожить объекты, охраняемые врагами', groups: [{ role: 'объекты', count: objects }, { role: 'охрана', count: hostile }],
        win: { type: 7, b: objects } };
    }
    case 0:
    case 11:
      // [КОД] у типов 0 и 11 нет ветки с сущностями; генератор контрактов требует назначение не в текущей станции
      return { type: ct.type, kind: 'перелёт/доставка до станции (сущностей в секторе нет)', groups: [],
        notes: ['условия победы не заданы в ed.java — выполнение, по-видимому, засчитывается по прибытию на станцию назначения'] };
    case 12: {
      let n = 3 + scale(4, d);
      if (n % 2 === 0) n++;
      if (ct.special) n = 7;
      return { type: 12, kind: 'соревнование с напарником: убей больше врагов, чем он', groups: [{ role: 'напарник/босс (индекс 0)', count: 1 }, { role: 'враги', count: n }],
        win: { type: 20, b: 1, c: n + 1 }, lose: { type: 21, b: 1, c: n + 1 } };
    }
  }
  return undefined;
}
