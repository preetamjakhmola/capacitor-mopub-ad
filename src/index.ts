import { registerPlugin } from '@capacitor/core';

import type { CapMopubAdPlugin } from './definitions';

const CapMopubAd = registerPlugin<CapMopubAdPlugin>('CapMopubAd', {
  web: () => import('./web').then(m => new m.CapMopubAdWeb()),
});

export * from './definitions';
export { CapMopubAd };
