package com.jcupzz.busschedule

import HomeFragment
import Location_Fragment
import People_Fragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView);

        val firstFragment=HomeFragment()
        val secondFragment=Location_Fragment()
        val thirdFragment=People_Fragment()

        setCurrentFragment(firstFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(firstFragment)
                R.id.location->setCurrentFragment(secondFragment)
                R.id.people->setCurrentFragment(thirdFragment)
            }
            true
        }

    }
    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {

            replace(R.id.flFragment,fragment)
            commit()
        }
}