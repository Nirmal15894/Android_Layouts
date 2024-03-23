package com.example.androidlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    var countryName = ArrayList<String>()
    var countryDesc = ArrayList<String>()
    var countryImages = ArrayList<Int>()
    lateinit var countriesAdapter: CountriesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        recyclerView = findViewById(R.id.recycler_view1)
        recyclerView.layoutManager = LinearLayoutManager(this@RecyclerActivity)
        this.countryName.add("India")
        this.countryName.add("Pakistan")
        this.countryName.add("Bangladesh")
        this.countryName.add("Nepal")
        this.countryName.add("Sri Lanka")
        this.countryName.add("Afghanistan")
        this.countryName.add("Australia")
        this.countryName.add("Newzeland")
        this.countryDesc.add("This is India")
        this.countryDesc.add("This is Pakistan")
        this.countryDesc.add("This is Bangladesh")
        this.countryDesc.add("This is Nepal")
        this.countryDesc.add("This is Sri Lanka")
        this.countryDesc.add("This is Afghanistan")
        this.countryDesc.add("This is Australia")
        this.countryDesc.add("This is Newzeland")
        this.countryImages.add(R.drawable.starbucks)
        this.countryImages.add(R.drawable.starbucks)
        this.countryImages.add(R.drawable.starbucks)
        this.countryImages.add(R.drawable.starbucks)
        this.countryImages.add(R.drawable.starbucks)
        this.countryImages.add(R.drawable.starbucks)
        this.countryImages.add(R.drawable.starbucks)
        this.countryImages.add(R.drawable.starbucks)
        countriesAdapter = CountriesAdapter(countryName, countryDesc,countryImages, this@RecyclerActivity)
        recyclerView.adapter = countriesAdapter
    }
}