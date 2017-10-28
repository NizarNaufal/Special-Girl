package com.nizar.specialgirl;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Poncoe on 29/10/17.
 */

public class ContohCardView extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.contoh_cardview);

        CardView contoh1 = (CardView) findViewById(R.id.card_view1);
        CardView contoh2 = (CardView) findViewById(R.id.card_view2);

        contoh1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), TidakTersedia.class);
                startActivity(i);
            }
        });
        contoh2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), TidakTersedia.class);
                startActivity(i);
            }
        });
    }

    public void onBackPressed() {
        finish();
    }
}