import { IBannerDefinitions } from "./banner";
import { InterstitialDefinitions } from "./interstitial";
import { IRewardDefinitions } from "./reward";

type CapMopubAdDefinitions = IBannerDefinitions & IRewardDefinitions &
  InterstitialDefinitions;
export interface CapMopubAdPlugin extends CapMopubAdDefinitions{
  initialize(options: CapMopubAdInitializationOptions): Promise<void>;

}
 
export interface CapMopubAdInitializationOptions {
  /**
   * Use or not requestTrackingAuthorization in iOS(>14)
   * 
   */
  requestTrackingAuthorization?: boolean;

  /* 
   */
  testingDevices?: string[];

  /**
   * @default false 
   */
  initializeForTesting?: boolean;
}