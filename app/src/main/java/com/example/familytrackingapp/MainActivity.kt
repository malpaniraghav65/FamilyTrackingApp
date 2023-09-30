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
          if(MenuItem.itemId == R.id.nav_guard){inflateFragment(GuardFragment.newInstance())}
          else if(MenuItem.itemId == R.id.nav_home){inflateFragment(HomeFragment.newInstance())}
          else if(MenuItem.itemId == R.id.nav_Dashboard){inflateFragment(DashboardFragment.newInstance())}
          else if(MenuItem.itemId == R.id.nav_profile){inflateFragment(ProfileFragment.newInstance())}

            true

        }
    }

    private fun inflateFragment(newInstance: Fragment) {
        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,newInstance)
        transaction.commit()
    }


}