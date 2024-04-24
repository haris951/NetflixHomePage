package com.example.netflixhomescreen

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.netflixhomescreen.R.id
import com.example.netflixhomescreen.adapter.MainAdapter
import com.example.netflixhomescreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Activity 1"
    }fun openMain(view: View) {
        val intent = Intent(this, HomeScreen::class.java)
        startActivity(intent)
    }
}
