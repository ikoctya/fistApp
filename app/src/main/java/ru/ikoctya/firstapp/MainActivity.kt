package ru.ikoctya.firstapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart(){
       super.onStart()
        Log.d(TAG, "1onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"2onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"3onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"4onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"5onDestroy()")
    }

}




