package ru.ikoctya.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val bannerList: List<Banner> = listOf(
            Banner(R.drawable.androids, "Hello"),
            Banner(R.drawable.androids, "Bye"),
            Banner(R.drawable.androids, "Bye"),
            Banner(R.drawable.androids, "Bye"),
            Banner(R.drawable.androids, "Bye"),
            Banner(R.drawable.androids, "Bye")

        )

        val peopleList: List<People>
        peopleList = listOf(
            People.Man("Ivan",22,"89090675434"),
            People.Woman("Anna",21,"anna@mail.ru"),
            People.Man("Nikita",35,"89074562354"),
            People.Woman("Olga",16,"olga@gmail.com")
        )

        //       val cardsRecyclerView: RecyclerView = findViewById(R.id.cardsRecycleView)
 //       cardsRecyclerView.layoutManager =
 //           LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
 //       cardsRecyclerView.addItemDecoration( DividerItemDecoration(this,
 //           DividerItemDecoration.VERTICAL)
 //       )
 //       cardsRecyclerView.adapter = BannerAdapter(bannerList)

        val peopleRecyclerView: RecyclerView = findViewById(R.id.cardsRecycleView)
        peopleRecyclerView.layoutManager =
                   LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        peopleRecyclerView.addItemDecoration( DividerItemDecoration(this,      DividerItemDecoration.VERTICAL))
        peopleRecyclerView.adapter = PeopleAdapter(peopleList)

    }
}