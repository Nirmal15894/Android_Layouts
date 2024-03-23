package com.example.androidlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListActivity : AppCompatActivity() {

    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        listView = findViewById(R.id.list_view_id)
        var countryList = resources.getStringArray(R.array.countries)
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countryList)
        listView.adapter = adapter
        listView.setOnItemClickListener { parent, view, position, id ->
            val countryName = parent.getItemAtPosition(position).toString()
            Toast.makeText(this, "You have selected $countryName",Toast.LENGTH_LONG).show()
        }
    }
}