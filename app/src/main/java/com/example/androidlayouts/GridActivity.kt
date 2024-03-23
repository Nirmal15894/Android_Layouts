package com.example.androidlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class GridActivity : AppCompatActivity() {

    private lateinit var gridView:GridView

    var teamImages = ArrayList<Int>()
    var teamNames = ArrayList<String>()
    lateinit var teamsAdapter: TeamsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
        gridView = findViewById(R.id.grid_view_id)
        teamNames.add("man utd")
        teamNames.add("man city")
        teamNames.add("Arsenal")
        teamNames.add("Chelsea")
        teamNames.add("Liverpool")
        teamNames.add("Everton")
        teamNames.add("Aston villa")
        teamNames.add("Brighton")
        teamNames.add("Luton town")
        teamNames.add("Brentford")
        teamImages.add(R.drawable.starbucks)
        teamImages.add(R.drawable.starbucks)
        teamImages.add(R.drawable.starbucks)
        teamImages.add(R.drawable.starbucks)
        teamImages.add(R.drawable.starbucks)
        teamImages.add(R.drawable.starbucks)
        teamImages.add(R.drawable.starbucks)
        teamImages.add(R.drawable.starbucks)
        teamImages.add(R.drawable.starbucks)
        teamImages.add(R.drawable.starbucks)
        teamsAdapter =  TeamsAdapter(teamNames,teamImages, this@GridActivity)
        gridView.adapter = teamsAdapter

    }
}