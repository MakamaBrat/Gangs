/**
 * Ввод — точная копия логики Main/n.java (keyPressed / keyReleased).
 * Состояние — битовая маска; «нажато» и «отпущено» — рёбра за кадр.
 * Коды клавиш — J2ME: -1 вверх, -2 вниз, -3 влево, -4 вправо, -5 fire,
 * -6/-7 софт-клавиши, -8 clear, -11 (call/back); остальные — ASCII.
 */
/**
 * Раскладка полёта из справки игры (ru.lang[22]):
 *   5 — выбор/огонь, 9 — автопилот, 7 — авто-огонь, 3 — ускоритель, 0 — вид назад/турель, правый софт — меню действий.
 */
export const KEY = {
  UP: 0x2,
  LEFT: 0x4,
  RIGHT: 0x20,
  DOWN: 0x40,
  FIRE: 0x100,
  K7: 0x200,
  K9: 0x400,
  STAR: 0x800,
  POUND: 0x1000,
  SOFT_RIGHT: 0x2000,
  SOFT_LEFT: 0x4000,
  K1: 0x8000,
  K3: 0x10000,
  K0: 0x20000,
  KEY_M11: 0x40000,
  CLEAR: 0x80000,
} as const;

const c = (s: string): number[] => [...s].map((ch) => ch.charCodeAt(0));

/** таблица из keyPressed(): какие J2ME-коды включают какой бит */
const TABLE: [number, number[]][] = [
  [KEY.SOFT_RIGHT, [-7]],
  [KEY.SOFT_LEFT, [-6]],
  [KEY.K1, [49, ...c('er')]],
  [KEY.K3, [51, ...c('iu')]],
  [KEY.K0, [48, 32]],
  [KEY.KEY_M11, [-11]],
  [KEY.CLEAR, [-8]],
  [KEY.UP, [-1, 50, ...c('yt')]],
  [KEY.DOWN, [-2, 56, ...c('bv')]],
  [KEY.LEFT, [-3, 52, ...c('df')]],
  [KEY.RIGHT, [-4, 54, ...c('jk')]],
  [KEY.FIRE, [-5, 53, ...c('gh')]],
  [KEY.K7, [55, ...c('cx')]],
  [KEY.K9, [57, ...c('mn')]],
  [KEY.STAR, [42]],
  [KEY.POUND, [35]],
];

/** KeyboardEvent -> J2ME-код (или null) */
export function j2meCode(e: KeyboardEvent): number | null {
  switch (e.code) {
    case 'ArrowUp': return -1;
    case 'ArrowDown': return -2;
    case 'ArrowLeft': return -3;
    case 'ArrowRight': return -4;
    case 'Enter': case 'NumpadEnter': return -5;
    case 'F1': return -6;
    case 'F2': return -7;
    case 'Backspace': return -8;
    case 'Escape': return -11;
    case 'Space': return 32;
  }
  if (e.key.length === 1) return e.key.toLowerCase().charCodeAt(0);
  return null;
}

export class InputState {
  /** удерживается (b в оригинале) */
  held = 0;
  /** нажато в этом кадре (e) */
  pressed = 0;
  /** отпущено в этом кадре (d) */
  released = 0;
  private prev = 0;

  keyDown(code: number): void {
    this.prev = this.held;
    for (const [bit, codes] of TABLE) if (codes.includes(code)) this.held |= bit;
    this.pressed |= this.held & ~this.prev;
  }

  keyUp(code: number): void {
    this.prev = this.held;
    for (const [bit, codes] of TABLE) if (codes.includes(code)) this.held &= ~bit;
    this.released |= ~this.held & this.prev;
  }

  /** вызывать в конце каждого кадра (в оригинале e = d = -1/0 после обработки) */
  endFrame(): void {
    this.pressed = 0;
    this.released = 0;
  }

  isHeld(bit: number): boolean { return (this.held & bit) !== 0; }
  wasPressed(bit: number): boolean { return (this.pressed & bit) !== 0; }

  attach(target: Window | HTMLElement = window): () => void {
    const kd = (e: Event): void => {
      const code = j2meCode(e as KeyboardEvent);
      if (code === null) return;
      if (!(e as KeyboardEvent).repeat) this.keyDown(code);
      e.preventDefault();
    };
    const ku = (e: Event): void => {
      const code = j2meCode(e as KeyboardEvent);
      if (code !== null) this.keyUp(code);
    };
    target.addEventListener('keydown', kd);
    target.addEventListener('keyup', ku);
    return () => { target.removeEventListener('keydown', kd); target.removeEventListener('keyup', ku); };
  }
}
