package com.nizar.specialgirl.kotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView

import com.nizar.specialgirl.R

import java.util.ArrayList

/**
 * Created by Poncoe on 29/10/17.
 */

class ContohListView : Activity() {

    private val CONTOH1 = "Tidak Tersedia"
    private val CONTOH2 = "Contoh CardView"
    private val CONTOH3 = "Kembali"


    private val data: List<String>
        get() {
            val data = ArrayList<String>()
            data.add(CONTOH1)
            data.add(CONTOH2)
            data.add(CONTOH3)

            return data
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview)

        val list = findViewById<View>(R.id.mainAct_list) as ListView
        val adapter = ListAdapter(data)
        adapter.setOnListActionClicked(com.nizar.specialgirl.kotlin.ListAdapter.ListAction { menuName -> startActivity(menuName) })
        list.adapter = adapter
    }

    private fun startActivity(menuList: String) {
        when (menuList) {
            CONTOH1 -> startActivity(Intent(this, TidakTersedia::class.java))
            CONTOH2 -> startActivity(Intent(this, ContohCardView::class.java))
            CONTOH3 -> finish()
        }
    }

    override fun onBackPressed() {
        // TODO Auto-generated method stub
        this@ContohListView.finish()
    }
}