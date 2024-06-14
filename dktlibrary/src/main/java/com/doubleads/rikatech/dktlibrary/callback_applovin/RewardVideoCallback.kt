package com.doubleads.rikatech.dktlibrary.callback_applovin

interface RewardVideoCallback {
    fun onRewardClosed()
    fun onRewardEarned()
    fun onRewardFailed()
    fun onRewardNotAvailable()
}