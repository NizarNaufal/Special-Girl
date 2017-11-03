package com.nizar.specialgirl.kotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.view.View

import com.nizar.specialgirl.R

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById<View>(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Yaela, Dipelajarin Tuh Kodingannya", Snackbar.LENGTH_LONG)
                    .setAction("Iya Bang Poncoe", null).show()
            //startActivity(new Intent(MainActivity.this, TidakTersedia.class));
        }

        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.setDrawerListener(toggle)
        toggle.syncState()

        val navigationView = findViewById<View>(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    //RAISED WHEN NAV VIEW ITEM IS SELECTED
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId

        if (id == R.id.nav_home) {
            startActivity(Intent(this, TidakTersedia::class.java))

        } else if (id == R.id.nav_artist) {
            val app = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=LuckyTrue+Development"))
            startActivity(app)

        } else if (id == R.id.nav_aboutus) {
            startActivity(Intent(this, ContohCardView::class.java))

        } else if (id == R.id.nav_syarat) {
            startActivity(Intent(this, ContohListView::class.java))

        } else if (id == R.id.nav_pertanyaan) {
            startActivity(Intent(this, TidakTersedia::class.java))

        } else if (id == R.id.nav_login) {
            startActivity(Intent(this, TidakTersedia::class.java))

        } else if (id == R.id.nav_daftar) {
            startActivity(Intent(this, TidakTersedia::class.java))

        }

        //REFERENCE AND CLOSE DRAWER LAYOUT
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}
