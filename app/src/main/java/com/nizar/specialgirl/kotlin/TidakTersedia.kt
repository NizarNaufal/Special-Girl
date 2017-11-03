package com.nizar.specialgirl.kotlin

/**
 * Created by Poncoe on 28/10/17.
 */

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.nizar.specialgirl.R

class TidakTersedia : Activity() {

    private var authListener: FirebaseAuth.AuthStateListener? = null
    private var auth: FirebaseAuth? = null


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tidak_tersedia)

        //get firebase auth instance
        auth = FirebaseAuth.getInstance()

        //get current user
        val user = FirebaseAuth.getInstance().currentUser

        authListener = FirebaseAuth.AuthStateListener { firebaseAuth ->
            val user = firebaseAuth.currentUser
            if (user == null) {
                // user auth state is changed - user is null
                // launch login activity
                startActivity(Intent(this@TidakTersedia, LoginActivity::class.java))
                finish()
            }
        }

    }

    fun onClick(arg0: View) {
        // TODO Auto-generated method stub
        finish()
    }
}