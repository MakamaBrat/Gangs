import * as THREE from 'three';
import { OrbitControls } from 'three/examples/jsm/controls/OrbitControls.js';
import { loadGameData, loadManifest, loadModel, type Manifest } from './assets';

const view = document.getElementById('view') as HTMLDivElement;
const listEl = document.getElementById('list') as HTMLDivElement;
const infoEl = document.getElementById('info') as HTMLDivElement;
const qEl = document.getElementById('q') as HTMLInputElement;
const wireEl = document.getElementById('wire') as HTMLInputElement;
const rotEl = document.getElementById('rot') as HTMLInputElement;

const renderer = new THREE.WebGLRenderer({ antialias: true });
renderer.setPixelRatio(Math.min(devicePixelRatio, 2));
view.appendChild(renderer.domElement);

const scene = new THREE.Scene();
scene.background = new THREE.Color(0x0b0e14);
const camera = new THREE.PerspectiveCamera(45, 1, 0.01, 200);
camera.position.set(2.2, 1.2, 2.6);
const controls = new OrbitControls(camera, renderer.domElement);
controls.enableDamping = true;

scene.add(new THREE.HemisphereLight(0xcfe0ff, 0x202030, 1.1));
const sun = new THREE.DirectionalLight(0xffffff, 2.2);
sun.position.set(3, 4, 2);
scene.add(sun);
scene.add(new THREE.GridHelper(4, 16, 0x263048, 0x161d2c));

let current: THREE.Object3D | null = null;

function resize(): void {
  const w = view.clientWidth, h = view.clientHeight;
  renderer.setSize(w, h);
  camera.aspect = w / h;
  camera.updateProjectionMatrix();
}
addEventListener('resize', resize);
resize();

function setWire(root: THREE.Object3D, on: boolean): void {
  root.traverse((o) => {
    const m = (o as THREE.Mesh).material as THREE.MeshStandardMaterial | undefined;
    if (m && 'wireframe' in m) m.wireframe = on;
  });
}

async function show(key: string, manifest: Manifest): Promise<void> {
  if (current) scene.remove(current);
  const info = manifest[key];
  // нормируем в единичный размер для просмотра
  const model = await loadModel(key, manifest, 1);
  const box = new THREE.Box3().setFromObject(model);
  const size = box.getSize(new THREE.Vector3());
  const k = 2 / Math.max(size.x, size.y, size.z, 1e-6);
  const holder = new THREE.Group();
  holder.add(model);
  model.position.sub(box.getCenter(new THREE.Vector3()));
  holder.scale.setScalar(k);
  setWire(holder, wireEl.checked);
  scene.add(holder);
  current = holder;
  controls.target.set(0, 0, 0);
  infoEl.textContent = [
    key + (info.placeholder ? '   [ЗАГЛУШКА]' : ''),
    `вершин: ${info.vertices ?? '—'}   треугольников: ${info.triangles ?? '—'}   мешей: ${info.meshes ?? '—'}`,
    `размер (M3G): ${info.size ? info.size.map((x) => Math.round(x)).join(' × ') : '—'}`,
    info.note ?? '',
  ].filter(Boolean).join('\n');
}

function group(key: string): string {
  if (key.startsWith('ship_')) return 'корабли';
  if (key.startsWith('stat_')) return 'станции (части)';
  if (/^(h\d|b\d)s\d/.test(key)) return 'ангары / базы';
  if (/^(laser|blaster|cannon|gun|gunshot|nuke|emp)/.test(key)) return 'оружие';
  if (key.startsWith('fig_')) return 'персонажи';
  return 'прочее';
}

async function main(): Promise<void> {
  const manifest = await loadManifest();
  const keys = Object.keys(manifest).sort();

  function render(filter = ''): void {
    listEl.innerHTML = '';
    let last = '';
    for (const k of keys.filter((x) => x.toLowerCase().includes(filter.toLowerCase()))) {
      const g = group(k);
      if (g !== last) {
        const h = document.createElement('h4');
        h.textContent = g;
        listEl.appendChild(h);
        last = g;
      }
      const d = document.createElement('div');
      d.textContent = k;
      if (manifest[k].placeholder) d.className = 'ph';
      d.onclick = () => {
        listEl.querySelectorAll('.sel').forEach((e) => e.classList.remove('sel'));
        d.classList.add('sel');
        void show(k, manifest);
      };
      listEl.appendChild(d);
    }
  }
  render();
  qEl.oninput = () => render(qEl.value);
  wireEl.onchange = () => current && setWire(current, wireEl.checked);

  const data = await loadGameData();
  console.info(`данные: ${data.systems.length} систем, ${data.stations.length} станций, ` +
    `${data.ships.length} кораблей, ${data.items.length} предметов, ${data.lang.length} строк`);
  console.info('systems[0]:', data.systems[0].name, '| lang[0]:', data.t(0));

  const first = keys.find((k) => k.startsWith('ship_') && !manifest[k].placeholder) ?? keys[0];
  await show(first, manifest);
  listEl.querySelectorAll('div').forEach((e) => e.textContent === first && e.classList.add('sel'));

  renderer.setAnimationLoop(() => {
    if (current && rotEl.checked) current.rotation.y += 0.006;
    controls.update();
    renderer.render(scene, camera);
  });
}

main().catch((e) => { infoEl.textContent = 'Ошибка: ' + e.message; console.error(e); });
