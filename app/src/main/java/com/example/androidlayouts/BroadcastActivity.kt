package com.example.androidlayouts

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BroadcastActivity : AppCompatActivity() {

    var airPlaneBroadcast = MyBroadcastReceiver()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)
        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        this.registerReceiver(airPlaneBroadcast, filter)
    }

    override fun onDestroy() {
        super.onDestroy()
        this.unregisterReceiver(airPlaneBroadcast)
    }
}