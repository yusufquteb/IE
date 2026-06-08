package com.my.iengineer1.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.my.iengineer1.databinding.ActivityAppMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AppMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAppMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHost = supportFragmentManager
            .findFragmentById(binding.navHostFragment.id) as NavHostFragment
        navController = navHost.navController

        binding.bottomNav.setupWithNavController(navController)
    }
}
