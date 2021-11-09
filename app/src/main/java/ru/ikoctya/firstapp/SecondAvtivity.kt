package ru.ikoctya.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val KEY = "Hello_key"

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val userNameList:List<String> = listOf("Максим","Олег","Ольга","Елена","Андрей","Иван")


        val userRecyclerView: RecyclerView = findViewById(R.id.usersRecycleView)
        userRecyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        userRecyclerView.adapter = UserAdapter(userNameList)
    }
}