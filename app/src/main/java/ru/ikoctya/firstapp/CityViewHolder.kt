package ru.ikoctya.firstapp

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(city: City) {
        val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
        //тут было население, перенес в тост
        // val populationTextView: TextView = itemView.findViewById(R.id.population_text_view)
        nameTextView.text = city.name
            //  populationTextView.text = city.population.toString()
       nameTextView.setOnClickListener{
           Toast.makeText(itemView.context,"Население= "+city.population.toString(),Toast.LENGTH_SHORT).show()

       }
    }
}