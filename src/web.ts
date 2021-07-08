import { WebPlugin } from '@capacitor/core';

import type { CapMopubAdPlugin } from './definitions';

export class CapMopubAdWeb extends WebPlugin implements CapMopubAdPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
