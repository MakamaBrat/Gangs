/**
 * Фиксированная точка оригинала (класс k.java и ba.java):
 *  - длина:  4096 = 1.0 (12 бит)
 *  - угол:   4096 = полный круг, т.е. 1 единица = 360/4096 = 0.087890625°
 *  - FOV камеры задаётся в тех же единицах: градусы = fov * 0.087890625
 */
export const FP = 4096;
export const ANGLE_TO_DEG = 360 / 4096; // 0.087890625
export const ANGLE_TO_RAD = (Math.PI * 2) / 4096;

export const angleToRad = (a: number): number => a * ANGLE_TO_RAD;
export const fovToDeg = (fov: number): number => fov * ANGLE_TO_DEG;
/** целочисленная координата движка -> float (4096 -> 1.0) */
export const fromFixed = (v: number): number => v / FP;

/**
 * Параметры камер, найденные в коде: ba.a(width, height, fov, near, far).
 * fov/near/far — в «родных» единицах (near/far делить на 4096 для единиц сцены).
 */
export const CAMERA_PRESETS = {
  /** Main/o.java:120 — основная игровая сцена */
  main: { fov: 750, near: 500, far: 32000 },
  /** Main/b.java:225 — просмотр корабля (камера (0,400,-dist), поворот (256,2048,0)) */
  shipView: { fov: 1000, near: 10, far: 31768 },
  /** dq.java:199 — камера (0,500,-1400), поворот (0,2048,0) */
  dq: { fov: 700, near: 100, far: 31768 },
  /** co.java:12 */
  co: { fov: 800, near: 100, far: 31768 },
  /** Main/k.java:57 и :107 */
  k1: { fov: 1024, near: 200, far: 28000 },
  k2: { fov: 900, near: 10, far: 31768 },
  /** Main/r.java:167 */
  r: { fov: 1000, near: 10, far: 31768 },
} as const;

/** df.a[] — дистанция камеры просмотра для каждого из 37 кораблей (камера в Main/b.java: z = -df.a[id]) */
export const SHIP_VIEW_DIST = [
  622, 1338, 1066, 783, 1181, 912, 939, 1471, 1199, 1192, 763, 1633, 1103, 2000, 2000, 2000, 1802, 1930,
  1590, 1205, 1024, 1623, 1266, 1038, 1370, 1370, 1110, 1276, 1722, 1553, 975, 1175, 627, 1185, 916, 767, 1738,
] as const;
/** df.b[] — смещения для просмотра кораблей */
export const SHIP_VIEW_OFFSET = [
  24, -51, -37, 78, -197, 8, -14, 37, -104, 121, -100, -381, -132, 0, 0, 0, -520, -137, -206, 0, -182, -347,
  2, -61, -116, -254, -316, -40, -182, -372, -68, -160, -142, 131, -102, -72, -402,
] as const;
