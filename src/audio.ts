/**
 * Звуковой менеджер. В архиве звука НЕТ (data/sound/ отсутствует), поэтому всё
 * загружается лениво и тихо пропускается, если файла нет.
 *
 * Положи свои файлы в public/sound/ (.ogg или .mp3). Имена взяты из кода игры:
 * MIDI в браузере не играет — конвертируй музыку в .ogg/.mp3.
 */
export const SFX = [
  'fx_boost_01', 'fx_boost_02', 'fx_explosion_01', 'fx_explosion_03', 'fx_menu_04',
  'fx_message_02', 'fx_message_03', 'fx_message_05', 'fx_mining_05', 'fx_thunder_01',
  'wpn_nuke_02', 'wpn_rocket_02', 'wpn_rocket_03', 'wpn_rocket_04',
] as const;

export const MUSIC = ['gof2_theme', 'gof2_hangar', 'gof2_bar', 'gof2_gaction', 'gof2_gneutral'] as const;

export type SfxName = (typeof SFX)[number];
export type MusicName = (typeof MUSIC)[number];

const EXTS = ['ogg', 'mp3'];

export class AudioManager {
  private ctx?: AudioContext;
  private buffers = new Map<string, AudioBuffer | null>();
  private music?: AudioBufferSourceNode;
  private musicGain?: GainNode;
  volume = { sfx: 1, music: 0.6 };

  /** вызывать из обработчика клика/тапа (политика автоплея браузеров) */
  unlock(): void {
    if (!this.ctx) this.ctx = new AudioContext();
    void this.ctx.resume();
  }

  private async load(name: string): Promise<AudioBuffer | null> {
    if (this.buffers.has(name)) return this.buffers.get(name) ?? null;
    this.buffers.set(name, null);
    if (!this.ctx) return null;
    for (const ext of EXTS) {
      try {
        const r = await fetch(`${import.meta.env.BASE_URL}sound/${name}.${ext}`);
        if (!r.ok || !(r.headers.get('content-type') ?? '').match(/audio|ogg|mpeg|octet/)) continue;
        const buf = await this.ctx.decodeAudioData(await r.arrayBuffer());
        this.buffers.set(name, buf);
        return buf;
      } catch {
        /* пробуем следующее расширение */
      }
    }
    return null;
  }

  async playSfx(name: SfxName): Promise<void> {
    const buf = await this.load(name);
    if (!buf || !this.ctx) return;
    const src = this.ctx.createBufferSource();
    const g = this.ctx.createGain();
    g.gain.value = this.volume.sfx;
    src.buffer = buf;
    src.connect(g).connect(this.ctx.destination);
    src.start();
  }

  async playMusic(name: MusicName): Promise<void> {
    this.stopMusic();
    const buf = await this.load(name);
    if (!buf || !this.ctx) return;
    this.music = this.ctx.createBufferSource();
    this.musicGain = this.ctx.createGain();
    this.musicGain.gain.value = this.volume.music;
    this.music.buffer = buf;
    this.music.loop = true;
    this.music.connect(this.musicGain).connect(this.ctx.destination);
    this.music.start();
  }

  stopMusic(): void {
    try { this.music?.stop(); } catch { /* already stopped */ }
    this.music = undefined;
  }
}
