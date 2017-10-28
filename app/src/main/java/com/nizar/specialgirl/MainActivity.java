package com.nizar.specialgirl;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.nizar.specialgirl.fragment.DijatuhinFragment;
import com.nizar.specialgirl.fragment.disakitinFragment;
import com.nizar.specialgirl.fragment.DiputusinFragment;
import com.nizar.specialgirl.fragment.diduainFragment;
import com.nizar.specialgirl.fragment.dimaininFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //REFERENCE DRAWER,TOGGLE ITS INDICATOR
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        //REFERNCE NAV VIEW AND ATTACH ITS ITEM SELECTION LISTENER
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    //CLOSE DRAWER WHEN BACK BTN IS CLICKED,IF OPEN
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    //RAISED WHEN NAV VIEW ITEM IS SELECTED
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        //OPEN APPROPRIATE FRAGMENT WHEN NAV ITEM IS SELECTED
        if (id == R.id.nav_home) {
            //PERFORM TRANSACTION TO REPLACE CONTAINER WITH FRAGMENT
            MainActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.containerID, disakitinFragment.newInstance()).commit();

        } else if (id == R.id.nav_artist) {
            MainActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.containerID, dimaininFragment.newInstance()).commit();

        } else if (id == R.id.nav_aboutus) {
            MainActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.containerID, diduainFragment.newInstance()).commit();

        } else if (id == R.id.nav_syarat) {
            MainActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.containerID, DiputusinFragment.newInstance()).commit();

        } else if (id == R.id.nav_pertanyaan) {
            MainActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.containerID, DijatuhinFragment.newInstance()).commit();
        } else if (id == R.id.nav_login) {

        } else if (id == R.id.nav_daftar) {

        }

        //REFERENCE AND CLOSE DRAWER LAYOUT
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
