package com.bhardwaj.intern.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.bhardwaj.intern.R
import com.bhardwaj.intern.databinding.ActivityMainBinding
import com.bhardwaj.intern.ui.fragments.home.HomeFragment
import com.bhardwaj.intern.viewModels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var homeFragment: HomeFragment
    private lateinit var navController: NavController
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialise()
        clickListeners()
    }

    private fun initialise() {
        navController = findNavController(R.id.fragmentContainerView)
        binding.bnvNavigation.setupWithNavController(navController)
    }

    private fun clickListeners() {
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}
