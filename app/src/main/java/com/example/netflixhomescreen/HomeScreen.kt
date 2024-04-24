package com.example.netflixhomescreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.netflixhomescreen.adapter.MainAdapter
import com.example.netflixhomescreen.databinding.ActivityHomeScreenBinding
import com.example.netflixhomescreen.databinding.ActivityMainBinding
import com.example.netflixhomescreen.utils.SampleData

class HomeScreen : AppCompatActivity() {
    private lateinit var binding: ActivityHomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvMain.adapter=MainAdapter(SampleData.collections)
        }
        supportActionBar?.title = "Activity 1"

    }
}