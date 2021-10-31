package ru.ikoctya.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

private const val KEY = "Hello_key"

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val hello:String? = intent.extras?.getString(KEY)
        Toast.makeText(this,hello, Toast.LENGTH_LONG).show()

    }
}