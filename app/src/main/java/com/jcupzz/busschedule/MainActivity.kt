package com.jcupzz.busschedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var driver_id = findViewById<ImageButton>(R.id.driver);
        var people_id = findViewById<ImageButton>(R.id.people);

        people_id.setOnClickListener {
            Log.d("tag", "message");
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

    }
}