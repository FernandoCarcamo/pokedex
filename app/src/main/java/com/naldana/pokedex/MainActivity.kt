package com.naldana.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    private var favBtn = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        findViewById<Button>(R.id.button).setOnClickListener {
            navController.navigate(R.id.favoriteFragment)
        }
    }
}
