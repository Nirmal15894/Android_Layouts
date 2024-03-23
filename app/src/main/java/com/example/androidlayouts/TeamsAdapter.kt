package com.example.androidlayouts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class TeamsAdapter(
    var teamNames: ArrayList<String>,
    var teamImages: ArrayList<Int>,
    var context: Context
) : BaseAdapter() {

    override fun getCount(): Int {
        return teamNames.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View = LayoutInflater.from(parent!!.context).inflate(R.layout.teams_grid, parent, false)
        var teamName: TextView = view.findViewById(R.id.textView7)
        var teamImage: ImageView = view.findViewById(R.id.imageView3)
        var layout : ConstraintLayout = view.findViewById(R.id.constraint_id)
        teamName.text = teamNames.get(position)
        teamImage.setImageResource(teamImages.get(position))
        layout.setOnClickListener {
            Toast.makeText(context,"You have selected the team: ${teamNames.get(position)}", Toast.LENGTH_SHORT).show()
        }
        return view
    }
}