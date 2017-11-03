package com.nizar.specialgirl.kotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.View
import android.view.Window

import com.nizar.specialgirl.R

/**
 * Created by Poncoe on 29/10/17.
 */

class ContohCardView : Activity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.contoh_cardview)

        val contoh1 = findViewById<View>(R.id.card_view1) as CardView
        val contoh2 = findViewById<View>(R.id.card_view2) as CardView

        contoh1.setOnClickListener { view ->
            val i = Intent(view.context, TidakTersedia::class.java)
            startActivity(i)
        }
        contoh2.setOnClickListener { view ->
            val i = Intent(view.context, TidakTersedia::class.java)
            startActivity(i)
        }
    }

    override fun onBackPressed() {
        finish()
    }
}