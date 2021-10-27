package ru.ikoctya.firstapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"
private const val MY_OWN_LOG_TAG = "MyOwnLog"
private const val VALUE = "Value"

class MainActivity : AppCompatActivity() {
    val pushkin  = listOf(
        "\r\n 111 Ты видел деву на скале \r\n В одежде белой над волнами\r\n",                 //0
        "\r\n 222 Когда, бушуя в бурной мгле,\r\n Играло море с берегами\r\n",                 //1
        "\r\n 333 Когда луч молний озарял \r\n Ее всечасно блеском алым\r\n",                 //2
        "\r\n 444 И ветер бился и летал \r\n С ее летучим покрывалом?\r\n",                      //3
        "\r\n 555 Прекрасно море в бурной мгле \r\n И небо в блесках без лазури;\r\n",    //4
        "\r\n 666Но верь мне: дева на скале \r\n  Прекрасней волн, небес и бури.\r\n")        //5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(MY_OWN_LOG_TAG, pushkin[0])
        setContentView(R.layout.activity_main)
    }

    override fun onStart(){
       super.onStart()
        Log.d(MY_OWN_LOG_TAG, pushkin[1])
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_OWN_LOG_TAG,pushkin[2])
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_OWN_LOG_TAG,pushkin[3])
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_OWN_LOG_TAG,pushkin[4])
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_OWN_LOG_TAG,pushkin[5])
    }

}




