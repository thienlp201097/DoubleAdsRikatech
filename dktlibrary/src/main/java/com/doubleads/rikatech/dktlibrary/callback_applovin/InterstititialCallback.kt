package com.doubleads.rikatech.dktlibrary.callback_applovin

import com.applovin.mediation.MaxAd

interface InterstititialCallback {
    fun onInterstitialReady()
    fun onInterstitialClosed()
    fun onInterstitialLoadFail(error:String)
    fun onInterstitialShowSucceed()

}