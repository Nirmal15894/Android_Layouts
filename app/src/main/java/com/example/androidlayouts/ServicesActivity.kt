package com.example.androidlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ServicesActivity : AppCompatActivity() {

    lateinit var startService: Button
    lateinit var startJobIntentService: Button
    lateinit var stopService: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)
        startService = findViewById(R.id.startService)
        startJobIntentService = findViewById(R.id.startIntentService)
        stopService = findViewById(R.id.stopService)

        startService.setOnClickListener {
            var intent = Intent(this@ServicesActivity, ClassicServiceExample::class.java)
            startService(intent)
        }

        startJobIntentService.setOnClickListener {
            var intent = Intent(this@ServicesActivity, IntentServiceExample::class.java)
            startService(intent)
        }

        stopService.setOnClickListener {
            var intent = Intent(this@ServicesActivity, ClassicServiceExample::class.java)
            stopService(intent)
        }
    }
}