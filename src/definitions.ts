export interface CapMopubAdPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
