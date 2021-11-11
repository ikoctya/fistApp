package ru.ikoctya.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val bannerList:List<Banner> = listOf(
            Banner(R.drawable.androids,"Hello"),
            Banner(R.drawable.androids,"Bye")
        )

        val cardsRecyclerView: RecyclerView = findViewById(R.id.cardsRecycleView)
        cardsRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        cardsRecyclerView.adapter = BannerAdapter(bannerList)

    }
}