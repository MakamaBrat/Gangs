import * as THREE from 'three';
import { GLTFLoader } from 'three/examples/jsm/loaders/GLTFLoader.js';

/** Движок игры — фиксированная точка 4096 = 1.0 (см. src/fixed.ts); 3d_planet и skybox ≈ ровно 4096, значит 1 единица сцены = 4096 юнитов M3G. */
export const UNIT = 1 / 4096;

const BASE = import.meta.env.BASE_URL;

export interface ModelInfo {
  file: string;
  /** true — модели нет в .jar, это заглушка (см. tools/m3g2glb.py) */
  placeholder: boolean;
  vertices?: number;
  triangles?: number;
  meshes?: number;
  /** размеры bbox в юнитах M3G [x, y, z] */
  size?: number[];
  bbox?: number[][];
  /** цвета палитры 2x2 (в оригинале все оттенки серого) */
  colors?: string[];
  note?: string;
  source?: string | null;
}
export type Manifest = Record<string, ModelInfo>;

export async function loadManifest(): Promise<Manifest> {
  const r = await fetch(`${BASE}models/models.json`);
  if (!r.ok) throw new Error(`models.json: ${r.status}`);
  return r.json();
}

const loader = new GLTFLoader();
const cache = new Map<string, Promise<THREE.Group>>();

/**
 * Загружает модель по ключу из manifest (имя как в коде игры, без .m3g,
 * например "ship_04_[13005]", "laser0", "stat_hangar0").
 * Возвращает КЛОН — можно спокойно создавать много экземпляров.
 */
export async function loadModel(key: string, manifest: Manifest, scale = UNIT): Promise<THREE.Group> {
  const info = manifest[key];
  if (!info) throw new Error(`нет модели "${key}"`);
  let p = cache.get(key);
  if (!p) {
    p = loader.loadAsync(`${BASE}models/${info.file}`).then((g) => g.scene);
    cache.set(key, p);
  }
  const root = (await p).clone(true);
  root.scale.setScalar(scale);
  root.userData.modelKey = key;
  root.userData.placeholder = info.placeholder;
  return root;
}

/* ------------------------------------------------------------------ */
/* Игровые данные (из data/txt/*.bin и data/lang/ru/ru.lang)           */
/* ------------------------------------------------------------------ */

export interface StarSystem {
  id: number;
  name: string;
  f0: number;
  flag: boolean;
  nums: number[];
  /** координаты на карте галактики */
  pos: number[];
  /** индексы в stations */
  stations: number[];
  /** соседние системы (индексы), куда ведут переходы; пусто — у закрытых систем (в коде: dx.int_arr_b == null) */
  neighbors: number[];
  /** смысл не выяснен (у всех систем [0,1,2]) */
  extra_b: number[];
}
export interface Station { id: number; name: string; f0: number; f1: number; f2: number; f3: number }
export interface ShipDef {
  id: number; f0: number; f1: number; f2: number; f3: number;
  /** 4 числа слотов оборудования */
  slots: number[];
  scale: number;
}
export interface Agent {
  index: number; name: string; id: number; f1: number; f2: number; f3: number;
  flag: boolean; f5: number; f6: number; f7: number; blob: number[];
}
export interface ItemDef {
  id: number; arr_a: number[]; arr_b: number[];
  attrs_raw: number[];
  /** пары [ключ, значение] характеристик предмета */
  attrs: [number, number][];
}
export interface PartRef { model: number; pos: number[]; r: number[] }
export interface ShipParts { ship_id: number; raw_id: number; parts: PartRef[] }
export interface StationParts { raw_id: number; station_type: number; head: number; parts: PartRef[] }

export interface GameData {
  systems: StarSystem[];
  stations: Station[];
  ships: ShipDef[];
  agents: Agent[];
  items: ItemDef[];
  shipParts: ShipParts[];
  stationParts: StationParts[];
  names: Record<string, string[]>;
  lang: string[];
  /** строка локализации по индексу (как dn.a(int) в оригинале) */
  t(i: number): string;
}

async function getJson<T>(name: string): Promise<T> {
  const r = await fetch(`${BASE}data/${name}`);
  if (!r.ok) throw new Error(`${name}: ${r.status}`);
  return r.json() as Promise<T>;
}

export async function loadGameData(): Promise<GameData> {
  const [systems, stations, ships, agents, items, shipParts, stationParts, names, lang] = await Promise.all([
    getJson<StarSystem[]>('systems.json'),
    getJson<Station[]>('stations.json'),
    getJson<ShipDef[]>('ships.json'),
    getJson<Agent[]>('agents.json'),
    getJson<ItemDef[]>('items.json'),
    getJson<ShipParts[]>('ship_parts.json'),
    getJson<StationParts[]>('station_parts.json'),
    getJson<Record<string, string[]>>('names.json'),
    getJson<string[]>('lang_ru.json'),
  ]);
  return { systems, stations, ships, agents, items, shipParts, stationParts, names, lang, t: (i) => lang[i] ?? '' };
}
