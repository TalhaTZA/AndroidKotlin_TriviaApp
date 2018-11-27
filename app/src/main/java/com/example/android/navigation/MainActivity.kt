
package com.example.android.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.ActivityMainBinding
import com.example.android.navigation.databinding.FragmentTitleBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mNavController : NavController
    private lateinit var mDrawerLayout: DrawerLayout
    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        Init()

        NavigationUI.setupActionBarWithNavController(this, mNavController,mDrawerLayout)
        NavigationUI.setupWithNavController(mBinding.navView,mNavController)
    }

    override fun onSupportNavigateUp(): Boolean {
        Init()
        return NavigationUI.navigateUp(mDrawerLayout,mNavController)
    }

    private fun Init() {
        mNavController= this.findNavController(R.id.myNavHostFragment)
        mDrawerLayout = mBinding.drawerLayout
    }

}
