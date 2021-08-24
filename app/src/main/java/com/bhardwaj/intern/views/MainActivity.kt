package com.bhardwaj.intern.views

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.bhardwaj.intern.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), NavController.OnDestinationChangedListener {

    private lateinit var clRootMain: ConstraintLayout
    private lateinit var navController: NavController
    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialise()
    }

    private fun initialise() {
        clRootMain = findViewById(R.id.clRootMain)
        bottomNavigation = findViewById(R.id.bottomNavigationBar)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentMain) as NavHostFragment
        navController = navHostFragment.navController
        bottomNavigation.setupWithNavController(navController)
        navController.addOnDestinationChangedListener(this)
    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {
        when (destination.id) {
            R.id.homeFragment, R.id.communityFragment, R.id.profileFragment, R.id.savedFragment -> {
                bottomNavigation.visibility = View.VISIBLE
            }
            else -> {
                bottomNavigation.visibility = View.GONE
            }
        }
    }
}