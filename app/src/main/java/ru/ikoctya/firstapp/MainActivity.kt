package ru.ikoctya.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun alfabet{

    var bukva:Char = 'a'
  for  (bukva in 'a'..'z' step 2){println(bukva)}

}



