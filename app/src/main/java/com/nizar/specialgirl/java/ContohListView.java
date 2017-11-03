package com.nizar.specialgirl.java;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import com.nizar.specialgirl.R;

/**
 * Created by Poncoe on 29/10/17.
 */

public class ContohListView extends Activity {

    private final String CONTOH1 = "Tidak Tersedia";
    private final String CONTOH2 = "Contoh CardView";
    private final String CONTOH3 = "Kembali";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ListView list = (ListView) findViewById(R.id.mainAct_list);
        ListAdapter adapter = new ListAdapter(getData());
        adapter.setOnListActionClicked(new ListAdapter.ListAction() {

            @Override
            public void openMenu(String menuName) {
                startActivity(menuName);
            }
        });
        list.setAdapter(adapter);
    }

    private void startActivity(String menuList) {
        switch (menuList) {
            case CONTOH1:
                startActivity(new Intent(this, TidakTersedia.class));
                break;
            case CONTOH2:
                startActivity(new Intent(this, ContohCardView.class));
                break;
            case CONTOH3:
                finish();
                break;

        }
    }


    private List<String> getData() {
        List<String> data = new ArrayList<String>();
        data.add(CONTOH1);
        data.add(CONTOH2);
        data.add(CONTOH3);

        return data;
    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        ContohListView.this.finish();
    }
}