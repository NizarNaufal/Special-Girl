package com.nizar.specialgirl.kotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager

import com.nizar.specialgirl.R

/**
 * Created by Poncoe on 29/10/17.
 */

class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.splash)

        Handler().postDelayed(object : Runnable {


            override fun run() {
                val i = Intent(this@SplashActivity, LoginActivity::class.java)
                startActivity(i)
                finish()
            }


            //selesai Splashscreen


            private fun finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval.toLong())

    }

    companion object {

        //Set waktu lama splashscreen
        private val splashInterval = 6000
    }

}