package com.lib.dktechads

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.doubleads.rikatech.dktlibrary.ApplovinUtil
import com.doubleads.rikatech.dktlibrary.callback_applovin.BannerCallback
import com.doubleads.rikatech.dktlibrary.callback_applovin.InterstititialCallback
import com.applovin.mediation.MaxAd

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btn = findViewById<Button>(R.id.btn_2)
        btn.setOnClickListener {
                ApplovinUtil.loadAndShowInterstitialsWithDialogCheckTime(this,"loadandshow",1500,object :
                    InterstititialCallback {
                    override fun onInterstitialReady() {

                    }

                    override fun onInterstitialClosed() {


                    }

                    override fun onInterstitialLoadFail(error: String) {


                    }

                    override fun onInterstitialShowSucceed() {

                    }

                })
        }
    }
    override fun onResume() {
        val bannerContainer = findViewById<FrameLayout>(R.id.banner_container)
        ApplovinUtil.showBanner(this,bannerContainer,"banner_main", object : BannerCallback {
            override fun onBannerLoadFail(error: String) {
            }

            override fun onBannerShowSucceed() {
            }
        })
        super.onResume()
    }
}