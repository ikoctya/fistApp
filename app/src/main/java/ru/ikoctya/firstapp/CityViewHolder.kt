package ru.ikoctya.firstapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    fun bind(city:City){
        val nameTextView: TextView =itemView.findViewById(R.id.name_text_view)
        val populationTextView: TextView =itemView.findViewById(R.id.population_text_view)

        nameTextView.text = city.name
        populationTextView.text = city.population.toString()



    }
}