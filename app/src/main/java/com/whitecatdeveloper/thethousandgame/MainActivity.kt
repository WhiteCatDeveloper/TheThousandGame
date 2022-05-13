package com.whitecatdeveloper.thethousandgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Тут будет просто заставка

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        Thread.sleep(3000)
    }

}