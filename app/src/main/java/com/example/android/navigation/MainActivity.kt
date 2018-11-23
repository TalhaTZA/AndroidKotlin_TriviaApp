
package com.example.android.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mNavController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        Init()

        NavigationUI.setupActionBarWithNavController(this, mNavController)

    }

    override fun onSupportNavigateUp(): Boolean {
        Init()
        return mNavController.navigateUp()
    }

    private fun Init() {
        mNavController= this.findNavController(R.id.myNavHostFragment)
    }

}
