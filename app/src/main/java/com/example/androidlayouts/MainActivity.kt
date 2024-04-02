package com.example.androidlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("nirmal","activity oncreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("nirmal","activity onstart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("nirmal","activity onresume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("nirmal","activity onpause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("nirmal","activity onstop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("nirmal","activity onrestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("nirmal","activity ondestroy")
    }
}