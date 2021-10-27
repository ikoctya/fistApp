package ru.ikoctya.firstapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"
private const val MY_OWN_LOG_TAG = "MyOwnLog"
private const val VALUE = "Value"

val pushkin  = listOf(
    "Ты видел деву на скале \n В одежде белой над волнами",  //0
    "Когда, бушуя в бурной мгле,\n Играло море с берегами",  //1
    "Когда луч молний озарял \n Ее всечасно блеском алым",  //2
    "И ветер бился и летал\n С ее летучим покрывалом?",  //3
    "Прекрасно море в бурной мгле\n И небо в блесках без лазури;", //4
    "Но верь мне: дева на скале \n  Прекрасней волн, небес и бури.") //5

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart(){
       super.onStart()
        Log.d(MY_OWN_LOG_TAG, pushkin[0])
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_OWN_LOG_TAG,pushkin[1])
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_OWN_LOG_TAG,pushkin[2])
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_OWN_LOG_TAG,pushkin[3])
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_OWN_LOG_TAG,pushkin[4])
    }

}




