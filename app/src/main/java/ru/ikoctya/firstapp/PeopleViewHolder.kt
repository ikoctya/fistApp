package ru.ikoctya.firstapp

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PeopleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val contactInfoTextView: TextView =
        itemView.findViewById(R.id.people_contactinfo_textview)

    @SuppressLint("SetTextI18n")
     private fun bindMan(man: People.Man) {
        contactInfoTextView.text = "номер телефона - ${man.phoneNumber}"
    }

    @SuppressLint("SetTextI18n")
     private fun bindWoman(woman: People.Woman) {
        contactInfoTextView.text = "email - ${woman.email}"
    }

    @SuppressLint("SetTextI18n")
    fun bind(human: People.Human) {
        val nameTextView: TextView = itemView.findViewById(R.id.people_name_textview)
        val ageTextView: TextView = itemView.findViewById(R.id.people_age_textview)
        nameTextView.text = human.name
        ageTextView.text = "${human.age} лет"

        when (human) {
            is People.Man -> bindMan(human)
            is People.Woman -> bindWoman(human)
        }
    }

}