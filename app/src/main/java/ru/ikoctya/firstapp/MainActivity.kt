package ru.ikoctya.firstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.thread
import kotlin.random.Random

private const val TAG = "MainActivity"
private const val MY_OWN_LOG_TAG = "MyOwnLog"
private const val VALUE = "Value"
private const val KEY = "HELLO KEY"

class MainActivity : AppCompatActivity() {
    private lateinit var helloTextView: TextView
    private lateinit var randomizeButton: Button

    val pushkin = listOf(
        " \n Ты видел деву на скале \n В одежде белой над волнами\n",           //0
        " \n Когда, бушуя в бурной мгле,\n Играло море с берегами\n",           //1
        " \n Когда луч молний озарял \n Ее всечасно блеском алым\n",            //2
        " \n И ветер бился и летал \n С ее летучим покрывалом?\n",              //3
        " \n Прекрасно море в бурной мгле \n И небо в блесках без лазури;\n",   //4
        " \n Но верь мне: дева на скале \n  Прекрасней волн, небес и бури.\n"
    )  //5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTextView = findViewById(R.id.textView2)
        randomizeButton = findViewById(R.id.rand2)

        if (savedInstanceState != null)
            helloTextView.text = savedInstanceState.getString(VALUE)
        else
            randomize()

        randomizeButton.setOnClickListener { randomize() }
        Log.d(MY_OWN_LOG_TAG, pushkin[0])

        val nextButton: Button = findViewById(R.id.nexxt_button)
        val link = Uri.parse("https://glazovlife.ru")

        //val intent = Intent(this, SecondActivity::class.java)
        //val intent = Intent(Intent.ACTION_VIEW, link)
        //intent.putExtra(KEY, "Hello from MainActivity")

        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_APP_BROWSER)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        nextButton.setOnClickListener { this.startActivity(intent) }
           }

        fun randomize() {
            val randomValue = Random.nextInt(10000)
            helloTextView.text = randomValue.toString()
        }

        override fun onStart() {
            super.onStart()
            Log.d(MY_OWN_LOG_TAG, pushkin[1])
        }

        override fun onResume() {
            super.onResume()
            Log.d(MY_OWN_LOG_TAG, pushkin[2])
        }

        override fun onPause() {
            super.onPause()
            Log.d(MY_OWN_LOG_TAG, pushkin[3])

        }

        override fun onStop() {
            super.onStop()
            Log.d(MY_OWN_LOG_TAG, pushkin[4])
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d(MY_OWN_LOG_TAG, pushkin[5])
        }

        override fun onSaveInstanceState(outState: Bundle) {
            super.onSaveInstanceState(outState)
            outState.putString(VALUE, helloTextView.text.toString())
        }
    }