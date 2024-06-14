package com.lib.dktechads

import com.doubleads.rikatech.dktlibrary.adjust.AdjustUtils
import com.doubleads.rikatech.dktlibrary.application.AdsApplication

class MyApplication : AdsApplication() {
    override fun onCreateApplication() {
        AdjustUtils.initAdjust(this,"",false)
    }
}