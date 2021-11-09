package ru.ikoctya.firstapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(userName: String){
        val userNameTextView:TextView=itemView.findViewById(R.id.usernameTextView)
        userNameTextView.text=userName
    }
}