package com.readysteadygo.app.cap.mopub.ad.interstitial

import com.readysteadygo.app.cap.mopub.ad.models.LoadPluginEventNames


object InterstitialAdPluginPluginEvent: LoadPluginEventNames {
    const val Loaded = "interstitialAdLoaded"
    const val FailedToLoad = "interstitialAdFailedToLoad"
    override val Showed = "interstitialAdShowed"
    override val FailedToShow = "interstitialAdFailedToShow"
    override val Dismissed = "interstitialAdDismissed"
}