package com.example.androidlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class IntentWelcomeActivity : AppCompatActivity() {

    lateinit var welcomeText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_welcome)
        welcomeText= findViewById(R.id.textView8)
        var name = intent.getStringExtra("userName")
        var age = intent.getStringExtra("userAge")
        var welcomeMessage = "Hi $name . your age is $age"
        welcomeText.text = welcomeMessage
    }
}