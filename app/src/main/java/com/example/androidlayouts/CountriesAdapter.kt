package com.example.androidlayouts

import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidlayouts.CountriesAdapter.*

class CountriesAdapter(
    var countryName: ArrayList<String>,
    var countryDesc: ArrayList<String>,
    var countryImages: ArrayList<Int>,
    var context: Context
): RecyclerView.Adapter<CountriesViewHolder>() {

    class CountriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var countryTextView: TextView = itemView.findViewById(R.id.textView5)
        var countryDesctext: TextView = itemView.findViewById(R.id.textView6)
        var countryImages: ImageView = itemView.findViewById(R.id.imageView2)
        var cardView: CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountriesViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_recycler,parent,false)
        return CountriesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryName.size
    }

    override fun onBindViewHolder(holder: CountriesViewHolder, position: Int) {
        holder.countryDesctext.text = countryDesc.get(position)
        holder.countryTextView.text = countryName.get(position)
        holder.countryImages.setImageResource(countryImages.get(position))
        holder.cardView.setOnClickListener {
        Toast.makeText(context, "You clicked on ${holder.countryTextView.text}",Toast.LENGTH_SHORT).show()
        }
    }
}

