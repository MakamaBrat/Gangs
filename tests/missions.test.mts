import { check, planMission, STATE, type EntityView, type MissionView } from '../src/missions';
const ok = (n: string, c: boolean, extra = '') => console.log(c ? 'OK  ' : 'FAIL', n, extra);
const alive = (n: number, faction = 8): EntityView[] => Array.from({ length: n }, () => ({ state: 1, faction }));
const kill = (e: EntityView) => { e.state = STATE.DESTROYED; };

// тип 4: 2 + trunc(5*f)
ok('тип 4, сложность 0 → 2 врага; 10 → 7', planMission({ type: 4, difficulty: 0 })!.groups[0].count === 2 && planMission({ type: 4, difficulty: 10 })!.groups[0].count === 7);
ok('тип 1, сложность 5: 3 + trunc(2.5) = 5', planMission({ type: 1, difficulty: 5 }, () => 0)!.groups[0].count === 5);
ok('тип 7: 15 + trunc(35*f), лимит 121 с', planMission({ type: 7, difficulty: 10 })!.groups[0].count === 50 && planMission({ type: 7, difficulty: 10 })!.timeLimitMs === 121000);
ok('тип 9: 5 защищаемых, враги 2 + trunc(6*f)', (() => { const p = planMission({ type: 9, difficulty: 5 })!; return p.groups[1].count === 5 && p.groups[0].count === 5; })());
ok('тип 12: нечётное число, особый → 7', planMission({ type: 12, difficulty: 5 })!.groups[1].count % 2 === 1 && planMission({ type: 12, difficulty: 0, special: true })!.groups[1].count === 7);
ok('тип 8 в генераторе отсутствует', planMission({ type: 8, difficulty: 5 }) === undefined);

// условия
const p4 = planMission({ type: 4, difficulty: 5 })!;
const v4: MissionView = { entities: alive(p4.groups[0].count) };
ok('тип 4: победа только когда уничтожены все', !check(p4.win!, v4));
v4.entities.slice(0, -1).forEach(kill);
ok('  не хватает одного → не победа', !check(p4.win!, v4));
kill(v4.entities[v4.entities.length - 1]);
ok('  все уничтожены → победа', check(p4.win!, v4));

const p9 = planMission({ type: 9, difficulty: 0 })!; // 2 врага + 5 объектов
const v9: MissionView = { entities: alive(7) };
kill(v9.entities[2]); kill(v9.entities[3]);
ok('тип 9: часть защищаемых уничтожена — ещё не поражение', !check(p9.lose!, v9));
for (let i = 2; i < 7; i++) kill(v9.entities[i]);
ok('тип 9: все 5 объектов уничтожены → поражение', check(p9.lose!, v9));

const p12 = planMission({ type: 12, difficulty: 0 })!; // n = 3 → индексы 1..3
const mk12 = (mine: number, theirs: number): MissionView => {
  const e = alive(4); e.forEach((x, i) => { if (i > 0) { kill(x); } });
  return { entities: e, killsPlayer: mine, killsOthers: theirs };
};
ok('тип 12: убийств больше, чем у напарника → победа, не поражение', check(p12.win!, mk12(2, 1)) && !check(p12.lose!, mk12(2, 1)));
ok('тип 12: поровну или меньше → поражение', !check(p12.win!, mk12(1, 1)) && check(p12.lose!, mk12(1, 1)));
ok('тип 12: пока не все убиты — ни победы, ни поражения', (() => { const v = mk12(3, 0); v.entities[2].state = 1; return !check(p12.win!, v) && !check(p12.lose!, v); })());

const p3 = planMission({ type: 3, difficulty: 5, count: 4 })!;
const v3: MissionView = { entities: [...alive(4)] };
v3.entities[3].arrived = true;
ok('тип 3/5: победа по флагу VIP (индекс count-1), поражение по другому флагу', check(p3.win!, v3) && !check(p3.lose!, v3));
ok('тип 6: цель уничтожена', (() => { const v: MissionView = { entities: alive(1) }; const w = planMission({ type: 6, difficulty: 3 })!.win!; const a = check(w, v); kill(v.entities[0]); return !a && check(w, v); })());
ok('тип 3 (таймер): n > b', check({ type: 3, b: 100 }, { entities: [] }, 101) && !check({ type: 3, b: 100 }, { entities: [] }, 100));
ok('тип 10 всегда false, тип 9: b=0 и длина > 0', !check({ type: 10, b: 0 }, { entities: [] }) && check({ type: 9, b: 0 }, { entities: [], extra: alive(2) }));
