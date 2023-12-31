package com.example.familytrackingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BottomBar = findViewById<BottomNavigationView>(R.id.bottom_Bar)

        BottomBar.setOnItemSelectedListener{MenuItem->
          when (MenuItem.itemId) {
              R.id.nav_guard -> {inflateFragment(GuardFragment.newInstance())}
              R.id.nav_home -> {inflateFragment(HomeFragment.newInstance())}
              R.id.nav_Dashboard -> {inflateFragment(MapsFragment())}
              R.id.nav_profile -> {inflateFragment(ProfileFragment.newInstance())}
          }

            true

        }
        BottomBar.selectedItemId = R.id.nav_home
    }

    private fun inflateFragment(newInstance: Fragment) {
        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,newInstance)
        transaction.commit()
    }


}