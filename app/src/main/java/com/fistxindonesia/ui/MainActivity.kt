package com.fistxindonesia.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.fistxindonesia.R
import com.fistxindonesia.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        actionbarSetup()

        val bottomNavigationView: BottomNavigationView = binding.bottomNavigationView
        navController = findNavController(R.id.navHostFragmentMain)
        navController.addOnDestinationChangedListener { controller, destination, arguments ->

            val tabMenu = destination.id == R.id.navigation_home
                    || destination.id == R.id.navigation_activity
                    || destination.id == R.id.navigation_forum
                    || destination.id == R.id.navigation_profile


        }

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_activity,
                R.id.navigation_forum,
                R.id.navigation_profile
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)


    }

    private fun actionbarSetup() {
        val actionBar = supportActionBar
        val title = actionBar?.customView?.findViewById<TextView>(R.id.label_main)
        title?.text = navController.currentDestination?.label.toString()
        actionBar?.let {
            it.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
            it.setCustomView(R.layout.action_bar_main)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}