import { defineConfig } from 'vite';

export default defineConfig({
  base: './',
  build: {
    rollupOptions: { input: { main: 'index.html', flight: 'flight.html' } },
  },
  server: { port: 5173 },
});
