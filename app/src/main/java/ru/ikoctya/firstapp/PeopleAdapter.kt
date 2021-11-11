package ru.ikoctya.firstapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PeopleAdapter(private val peopleList: List<People.Human>):RecyclerView.Adapter<PeopleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        val peopleView = LayoutInflater.from(parent.context)
            .inflate(R.layout.human_list_item,parent,false)
        return PeopleViewHolder(peopleView)
            }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        val human=peopleList[position]
        holder.bind(human)
    }

    override fun getItemCount(): Int {
        return peopleList.size
    }
}