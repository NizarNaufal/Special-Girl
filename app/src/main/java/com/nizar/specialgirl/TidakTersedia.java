package com.nizar.specialgirl;

/**
 * Created by Poncoe on 28/10/17.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class TidakTersedia extends Activity {

    private FirebaseAuth.AuthStateListener authListener;
    private FirebaseAuth auth;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tidak_tersedia);

        //get firebase auth instance
        auth = FirebaseAuth.getInstance();

        //get current user
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    // user auth state is changed - user is null
                    // launch login activity
                    startActivity(new Intent(TidakTersedia.this, LoginActivity.class));
                    finish();
                }
            }
        };

    }

    public void onClick(View arg0) {
        // TODO Auto-generated method stub
        finish();
    }
}