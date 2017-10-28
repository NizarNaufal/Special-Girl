package com.nizar.specialgirl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Poncoe on 29/10/17.
 */

public class SplashActivity extends Activity {

    //Set waktu lama splashscreen
    private static int splashInterval = 6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }


            //selesai Splashscreen


            private void finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval);

    }

    ;

}