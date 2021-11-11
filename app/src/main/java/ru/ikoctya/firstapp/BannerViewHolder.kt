package ru.ikoctya.firstapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BannerViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
    fun bind(banner:Banner){
        val bannerImageView:ImageView=itemView.findViewById(R.id.image_banner_view)
        val bannerDescriptionTextView:TextView = itemView.findViewById(R.id.description_text_view)
        bannerDescriptionTextView.text = banner.description
        bannerImageView.setImageDrawable(itemView.context.getDrawable(banner.imageRes))

    }
}
//   itemView.context.getDrawable(banner.imageRes)