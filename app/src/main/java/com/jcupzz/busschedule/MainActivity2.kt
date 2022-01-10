package com.jcupzz.busschedule

import Home_Fragment
import Location_Fragment
import People_Fragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)



        val firstFragment=Home_Fragment()
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