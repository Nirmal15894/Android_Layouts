package com.example.androidlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class IntentLoginActivity : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var age: EditText
    lateinit var submit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_login)
        name = findViewById(R.id.editTextText)
        age = findViewById(R.id.editTextText2)
        submit = findViewById(R.id.button)

        submit.setOnClickListener {
            var userName = name.text.toString()
            var userAge = age.text.toString()
            var intent = Intent(this@IntentLoginActivity, IntentWelcomeActivity::class.java)
            intent.putExtra("userName", userName)
            intent.putExtra("userAge",userAge)
            startActivity(intent)
        }
    }
}