package com.sibaamap.servicekotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sibaamap.servicekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnStart.setOnClickListener {
                startService(Intent(this@MainActivity,MyService::class.java))

            }
            btnStop.setOnClickListener {
                stopService(Intent(this@MainActivity,MyService::class.java))
            }
        }




    }
}