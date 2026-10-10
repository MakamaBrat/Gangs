import * as THREE from 'three';
import { AI, EnemyShip, volleyOffsets } from './ai';
import { loadGameData, loadManifest, loadModel, UNIT, type GameData, type Manifest } from './assets';
import { boxHit } from './combat';
import { CAMERA_PRESETS, fovToDeg, FP } from './fixed';
import { InputState, KEY } from './input';
import {
  CAT, computeStats, isWeapon, itemCategory, itemName, PlayerFlight, weaponStats,
  type Loadout,
} from './player';

const hud = document.getElementById('hud') as HTMLDivElement;
const panel = document.getElementById('panel') as HTMLDivElement;

const renderer = new THREE.WebGLRenderer({ antialias: true });
renderer.setPixelRatio(Math.min(devicePixelRatio, 2));
document.body.appendChild(renderer.domElement);

const cam = CAMERA_PRESETS.main; // fov 750, near 500, far 32000 — Main/o.java
const camera = new THREE.PerspectiveCamera(fovToDeg(cam.fov), 1, cam.near / FP, cam.far / FP);
const scene = new THREE.Scene();
scene.background = new THREE.Color(0x000000);
scene.add(new THREE.AmbientLight(0xffffff, 1.4));
const sun = new THREE.DirectionalLight(0xffffff, 2.6);
sun.position.set(5, 3, 2);
scene.add(sun);

function resize(): void {
  renderer.setSize(innerWidth, innerHeight);
  camera.aspect = innerWidth / innerHeight;
  camera.updateProjectionMatrix();
}
addEventListener('resize', resize);
resize();

const input = new InputState();
input.attach();

/** Ось «носа» моделей в M3G неизвестна — переключатель V. */
let flip = false;
const flipSign = (): number => (flip ? -1 : 1);

interface Projectile { obj: THREE.Object3D; vel: THREE.Vector3; ttl: number; damage: number }
interface EnemyVis { ai: EnemyShip; holder: THREE.Group; model: THREE.Group; boom?: THREE.Mesh; wreckLeft: number }

const RAW_MS_TO_UNITS_S = 1000 / FP; // raw-юнитов/мс -> единиц сцены/с

function addSelect(label: string, options: [string, string][], value: string, onChange: (v: string) => void): HTMLSelectElement {
  const l = document.createElement('div');
  l.textContent = label;
  const s = document.createElement('select');
  for (const [v, t] of options) s.add(new Option(t, v));
  s.value = value;
  s.onchange = () => onChange(s.value);
  panel.append(l, s);
  return s;
}

async function main(): Promise<void> {
  const [manifest, data]: [Manifest, GameData] = await Promise.all([loadManifest(), loadGameData()]);
  const real = (k: string): boolean => k in manifest && !manifest[k].placeholder;

  const byCat = (c: number) => data.items.filter((i) => itemCategory(i) === c);
  const weapons = data.items.filter(isWeapon);
  const nm = (i: (typeof data.items)[number]): string => itemName(data.lang, i);
  const opts = (list: typeof data.items): [string, string][] => list.map((i) => [String(i.id), nm(i)]);

  // --- выбор корабля/модели/оборудования ---
  const modelKeys = Object.keys(manifest).filter((k) => /^ship_\d\d_\[/.test(k) && real(k)).sort();
  let shipDef = data.ships[0];
  const lo: Loadout = {
    booster: byCat(CAT.BOOSTER)[0], engine: byCat(CAT.ENGINE)[0],
    shield: byCat(CAT.SHIELD)[0], armor: byCat(CAT.ARMOR)[0],
  };
  let weapon = weapons[0];
  const itemById = (id: string) => data.items[Number(id)];
  const noneOpt: [string, string] = ['-1', '— нет —'];

  const defaultModel = modelKeys.includes('ship_04_[13005]') ? 'ship_04_[13005]' : modelKeys[0];
  let player = new PlayerFlight(computeStats(shipDef, lo));
  const rebuild = (): void => { player = new PlayerFlight(computeStats(shipDef, lo)); };

  addSelect('Модель', modelKeys.map((k) => [k, k]), defaultModel, (v) => void setShip(v));
  addSelect('Корабль (данные)', data.ships.map((s) => [String(s.id), `#${s.id}  манёвр ${s.scale}  корпус ${s.f1}`]), '0',
    (v) => { shipDef = data.ships[Number(v)]; rebuild(); });
  addSelect('Оружие', opts(weapons), String(weapon.id), (v) => { weapon = itemById(v); });
  addSelect('Форсаж', [noneOpt, ...opts(byCat(CAT.BOOSTER))], String(lo.booster?.id ?? -1), (v) => { lo.booster = v === '-1' ? undefined : itemById(v); rebuild(); });
  addSelect('Двигатель', [noneOpt, ...opts(byCat(CAT.ENGINE))], String(lo.engine?.id ?? -1), (v) => { lo.engine = v === '-1' ? undefined : itemById(v); rebuild(); });
  addSelect('Щит', [noneOpt, ...opts(byCat(CAT.SHIELD))], String(lo.shield?.id ?? -1), (v) => { lo.shield = v === '-1' ? undefined : itemById(v); rebuild(); });
  addSelect('Броня', [noneOpt, ...opts(byCat(CAT.ARMOR))], String(lo.armor?.id ?? -1), (v) => { lo.armor = v === '-1' ? undefined : itemById(v); rebuild(); });
  addSelect('Ремонт', [noneOpt, ...opts(byCat(CAT.REPAIR))], String(lo.repair?.id ?? -1), (v) => { lo.repair = v === '-1' ? undefined : itemById(v); rebuild(); });

  // --- сцена ---
  const sky = await loadModel('skybox', manifest, UNIT * 4);
  sky.traverse((o) => {
    const m = (o as THREE.Mesh).material as THREE.Material | undefined;
    if (m) { m.depthWrite = false; m.side = THREE.BackSide; }
  });
  scene.add(sky);
  const planet = await loadModel('3d_planet', manifest, UNIT * 3);
  planet.position.set(2.5, -0.6, -6);
  scene.add(planet);

  const holder = new THREE.Group();   // позиция и ориентация корабля
  const roll = new THREE.Group();     // визуальный крен
  const body = new THREE.Group();     // поправка «носа» (V)
  roll.add(body);
  holder.add(roll);
  scene.add(holder);

  async function setShip(key: string): Promise<void> {
    body.clear();
    const m = await loadModel(key, manifest);
    const inner = new THREE.Group();
    inner.rotation.x = -Math.PI / 2; // M3G-модель лежит в XY, толщина по Z
    inner.add(m);
    body.add(inner);
    body.rotation.y = flip ? Math.PI : 0;
  }
  await setShip(defaultModel);

  const layouts: number[][][] = (await (await fetch(`${import.meta.env.BASE_URL}data/volley_layouts.json`)).json()).layouts;

  // снаряды: простая светящаяся капсула (модели laser0 и т. п. — другой тип эффекта)
  const projGeo = new THREE.CapsuleGeometry(0.006, 0.05, 4, 8);
  const projGeoRot = projGeo.rotateX(Math.PI / 2);
  const playerShotMat = new THREE.MeshBasicMaterial({ color: 0x66ffcc });
  const enemyShotMat = new THREE.MeshBasicMaterial({ color: 0xff4040 });
  const shots: Projectile[] = [];
  const enemyShots: Projectile[] = [];

  // --- враги ---
  const enemyKeys = modelKeys;
  const enemies: EnemyVis[] = [];
  let kills = 0;
  let respawnIn = 0;

  async function spawnWave(count: number): Promise<void> {
    for (let i = 0; i < count; i++) {
      const key = enemyKeys[Math.floor(Math.random() * enemyKeys.length)];
      const m = await loadModel(key, manifest);
      const inner = new THREE.Group();
      inner.rotation.x = -Math.PI / 2;
      inner.add(m);
      const h = new THREE.Group();
      h.add(inner);
      const dir = new THREE.Vector3((Math.random() - 0.5) * 2, (Math.random() - 0.5) * 0.6, -1).normalize();
      const pos = holder.position.clone().addScaledVector(dir.applyQuaternion(holder.quaternion), 4.5 + Math.random() * 1.5);
      h.position.copy(pos);
      scene.add(h);
      const size = manifest[key].size ?? [800, 800, 300];
      const ai = new EnemyShip(pos, 100, (Math.max(...size) / FP) * 0.35);
      ai.fwd.copy(holder.position).sub(pos).normalize();
      enemies.push({ ai, holder: h, model: inner, wreckLeft: AI.wreckMs });
    }
  }
  await spawnWave(3);

  // звёздная пыль
  const N = 600;
  const pos = new Float32Array(N * 3);
  for (let i = 0; i < N * 3; i++) pos[i] = (Math.random() - 0.5) * 12;
  const dustGeo = new THREE.BufferGeometry();
  dustGeo.setAttribute('position', new THREE.BufferAttribute(pos, 3));
  scene.add(new THREE.Points(dustGeo, new THREE.PointsMaterial({ color: 0x9fb4ff, size: 0.02 })));

  let fireCd = 0;
  let autoFire = false;
  let notice = '';
  let noticeT = 0;
  const q = new THREE.Quaternion();
  const fwd = new THREE.Vector3();
  const clock = new THREE.Clock();

  function say(t: string): void { notice = t; noticeT = 2; }

  function respawnPlayer(): void {
    rebuild();
    holder.position.set(0, 0, 0);
    holder.quaternion.identity();
    say('Корабль уничтожен');
  }

  renderer.setAnimationLoop(() => {
    const dt = Math.min(clock.getDelta(), 0.05);
    const dtMs = dt * 1000;
    const fs = flipSign();

    // --- физика игрока (src/player.ts) ---
    const yaw = (input.isHeld(KEY.LEFT) ? 1 : 0) - (input.isHeld(KEY.RIGHT) ? 1 : 0);
    const pitch = (input.isHeld(KEY.UP) ? 1 : 0) - (input.isHeld(KEY.DOWN) ? 1 : 0);
    const step = player.step(dtMs, { yaw, pitch, boost: input.isHeld(KEY.K3) });
    holder.rotateX(step.pitchRad * fs);
    holder.rotateY(step.yawRad * fs);
    roll.rotation.z = -step.bankRad * fs;
    if (player.boostReadyEvent) say('Ускоритель готов');
    // раскладка полёта из ru.lang[22]: 5 — огонь, 9 — автопилот, 7 — авто-огонь, 3 — ускоритель, 0 — вид назад
    if (input.wasPressed(KEY.K7)) { autoFire = !autoFire; say(autoFire ? 'Авто огонь: вкл' : 'Авто огонь: выкл'); }
    if (input.wasPressed(KEY.K9)) say('Автопилот пока не реализован');
    const rear = input.isHeld(KEY.K0);

    holder.getWorldQuaternion(q);
    fwd.set(0, 0, flip ? 1 : -1).applyQuaternion(q);
    holder.position.addScaledVector(fwd, step.forwardRaw / FP);

    // --- стрельба: залп по раскладке br.java; число стволов — [ДОГАДКА] slots[0] ---
    fireCd -= dtMs;
    const w = weaponStats(weapon);
    if ((input.isHeld(KEY.FIRE) || autoFire) && fireCd <= 0) {
      fireCd = w.intervalMs;
      const guns = Math.min(10, Math.max(1, shipDef.slots[0]));
      for (const off of volleyOffsets(layouts, guns)) {
        const b = new THREE.Mesh(projGeoRot, playerShotMat);
        const local = new THREE.Vector3(off.x, off.y, -off.z * fs);
        b.position.copy(holder.position).add(local.applyQuaternion(q));
        b.quaternion.copy(q);
        if (flip) b.rotateY(Math.PI);
        scene.add(b);
        shots.push({ obj: b, vel: fwd.clone().multiplyScalar(w.speedRaw * RAW_MS_TO_UNITS_S), ttl: w.lifetimeMs / 1000, damage: w.damage });
      }
    }

    for (let i = shots.length - 1; i >= 0; i--) {
      const s = shots[i];
      s.obj.position.addScaledVector(s.vel, dt);
      let hit = false;
      // [КОД] br.a(long): куб с полу-стороной = радиус цели; формула цель − снаряд + смещение за кадр
      const pr: [number, number, number] = [s.obj.position.x * FP, s.obj.position.y * FP, s.obj.position.z * FP];
      const disp: [number, number, number] = [s.vel.x * dt * FP, s.vel.y * dt * FP, s.vel.z * dt * FP];
      for (const e of enemies) {
        if (e.ai.state !== 'combat') continue;
        const tp: [number, number, number] = [e.ai.pos.x * FP, e.ai.pos.y * FP, e.ai.pos.z * FP];
        if (boxHit(tp, pr, disp, e.ai.radius * FP)) { e.ai.damage(s.damage); hit = true; break; }
      }
      if (hit || (s.ttl -= dt) <= 0) { scene.remove(s.obj); shots.splice(i, 1); }
    }

    // --- враги ---
    for (let i = enemies.length - 1; i >= 0; i--) {
      const e = enemies[i];
      const prev = e.ai.state;
      e.ai.update(dtMs, holder.position);
      if (e.ai.state === 'combat') {
        e.holder.position.copy(e.ai.pos);
        e.holder.quaternion.setFromUnitVectors(new THREE.Vector3(0, 0, flip ? 1 : -1), e.ai.fwd);
        if (e.ai.wantsFire) {
          const b = new THREE.Mesh(projGeoRot, enemyShotMat);
          b.position.copy(e.ai.pos).addScaledVector(e.ai.fwd, e.ai.radius);
          b.quaternion.setFromUnitVectors(new THREE.Vector3(0, 0, 1), e.ai.fwd);
          scene.add(b);
          enemyShots.push({ obj: b, vel: e.ai.fwd.clone().multiplyScalar(2.5), ttl: 3, damage: AI.damagePerHit });
        }
      }
      if (prev === 'combat' && e.ai.state === 'exploding') {
        kills++;
        e.model.visible = false;
        e.boom = new THREE.Mesh(new THREE.SphereGeometry(1, 16, 12), new THREE.MeshBasicMaterial({ color: 0xffa040, transparent: true }));
        e.boom.position.copy(e.ai.pos);
        scene.add(e.boom);
      }
      if (e.boom) {
        const t = Math.min(1, e.ai.stateMs / 800);
        e.boom.scale.setScalar(0.05 + 0.4 * t);
        (e.boom.material as THREE.MeshBasicMaterial).opacity = 1 - t;
      }
      if (e.ai.state === 'wreck') {
        if (e.boom) { scene.remove(e.boom); e.boom = undefined; }
        e.model.visible = true;
        e.model.traverse((o) => {
          const mm = (o as THREE.Mesh).material as THREE.MeshStandardMaterial | undefined;
          if (mm && 'color' in mm) mm.color.setScalar(0.12);
        });
        e.wreckLeft -= dtMs;
        if (e.wreckLeft <= 0) { scene.remove(e.holder); enemies.splice(i, 1); }
      }
    }
    for (let i = enemyShots.length - 1; i >= 0; i--) {
      const s = enemyShots[i];
      s.obj.position.addScaledVector(s.vel, dt);
      const hit = s.obj.position.distanceTo(holder.position) < 0.12;
      if (hit) player.damage(s.damage); // ak.b: щит → броня → корпус
      if (hit || (s.ttl -= dt) <= 0) { scene.remove(s.obj); enemyShots.splice(i, 1); }
    }
    if (player.hull <= 0) respawnPlayer();
    if (!enemies.some((e) => e.ai.state === 'combat')) {
      respawnIn += dt;
      if (respawnIn >= 5) { respawnIn = 0; void spawnWave(2 + Math.floor(Math.random() * 4)); }
    }

    // --- камера от третьего лица ---
    const cs = rear ? -1 : 1; // вид назад (клавиша 0): камера спереди, смотрит на корабль и назад
    const back = fwd.clone().multiplyScalar(-0.9 * cs);
    const up = new THREE.Vector3(0, 1, 0).applyQuaternion(q).multiplyScalar(0.28);
    camera.position.copy(holder.position).add(back).add(up);
    camera.up.set(0, 1, 0).applyQuaternion(q);
    camera.lookAt(holder.position.clone().addScaledVector(fwd, 0.6 * cs));
    sky.position.copy(camera.position);

    const p = dustGeo.attributes.position as THREE.BufferAttribute;
    for (let i = 0; i < N; i++) {
      for (let a = 0; a < 3; a++) {
        const c = holder.position.getComponent(a);
        let v = p.getComponent(i, a) as number;
        if (v - c > 6) v -= 12; else if (v - c < -6) v += 12;
        p.setComponent(i, a, v);
      }
    }
    p.needsUpdate = true;

    // --- HUD ---
    noticeT -= dt;
    const st = player.stats;
    const boostTxt = !st.hasBooster ? 'нет'
      : player.boosting ? `работает (${Math.max(0, st.boostDurationMs - player.boostTimer).toFixed(0)} мс)`
      : player.boostTimer < 0 ? `перезарядка ${(-player.boostTimer / 1000).toFixed(1)} с` : 'готов (клавиша 3)';
    const alive = enemies.filter((e) => e.ai.state === 'combat').length;
    hud.textContent =
      `корпус ${player.hull.toFixed(0)}/${st.hull}   броня ${player.armor.toFixed(0)}/${st.armorMax}   щит ${player.shield.toFixed(1)}/${st.shieldMax}\n` +
      `скорость ${player.speed} raw/мс (${(player.speed * RAW_MS_TO_UNITS_S).toFixed(2)} ед/с)   манёвр ${st.maneuver.toFixed(2)}   форсаж: ${boostTxt}\n` +
      `оружие: ${nm(weapon)}  урон ${w.damage}  интервал ${w.intervalMs} мс   авто-огонь: ${autoFire ? 'вкл' : 'выкл'}\n` +
      `врагов ${alive}   уничтожено ${kills}` + (noticeT > 0 ? `\n>>> ${notice}` : '');
    input.endFrame();
    renderer.render(scene, camera);
  });

  addEventListener('keydown', (e) => {
    if (e.key.toLowerCase() === 'v') { flip = !flip; body.rotation.y = flip ? Math.PI : 0; }
  });
}

main().catch((e) => { hud.textContent = 'Ошибка: ' + e.message; console.error(e); });
