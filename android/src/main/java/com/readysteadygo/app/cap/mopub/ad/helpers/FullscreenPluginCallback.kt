package com.readysteadygo.app.cap.mopub.ad.helpers

import com.getcapacitor.JSObject
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.common.util.BiConsumer
import com.readysteadygo.app.cap.mopub.ad.models.AdMobPluginError
import com.readysteadygo.app.cap.mopub.ad.models.LoadPluginEventNames


class FullscreenPluginCallback(private val loadPluginObject: LoadPluginEventNames,
                               private val notifyListenersFunction: BiConsumer<String, JSObject>): FullScreenContentCallback() {

    override fun onAdShowedFullScreenContent() {
        notifyListenersFunction.accept(loadPluginObject.Showed, JSObject())
    }

    override fun onAdFailedToShowFullScreenContent(adError: AdError) {
        val adMobError = AdMobPluginError(adError)
        notifyListenersFunction.accept(
                loadPluginObject.FailedToShow, adMobError
        )
    }

    override fun onAdDismissedFullScreenContent() {
        notifyListenersFunction.accept(loadPluginObject.Dismissed, JSObject())
    }
}