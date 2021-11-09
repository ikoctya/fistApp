package ru.ikoctya.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val KEY = "Hello_key"

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val userNameList: List<String> =
            listOf("Максим", "Олег", "Ольга", "Елена", "Андрей", "Иван")
        val carList: List<Car> = listOf(
            Car("Audi", "red", 300),
            Car("BMW", "blue", 350),
            Car("Ferrari", "white", 450)

        )

        val userRecyclerView: RecyclerView = findViewById(R.id.usersRecycleView)
        userRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        userRecyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
//        userRecyclerView.adapter = UserAdapter(userNameList)
        userRecyclerView.adapter = CarAdapter(carList)
    }
}