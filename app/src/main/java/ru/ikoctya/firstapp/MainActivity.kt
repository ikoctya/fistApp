package ru.ikoctya.firstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

private const val TAG = "MainActivity"
private const val MY_OWN_LOG_TAG = "MyOwnLog"
private const val VALUE = "Value"
private const val KEY = "HELLO KEY"
private const val LAST_SELECTED_ITEM="item"

class MainActivity : AppCompatActivity() {
    private lateinit var helloTextView: TextView
    private lateinit var randomizeButton: Button
    private lateinit var bottomMenu: BottomNavigationView

    val pushkin = listOf(
        " \n Ты видел деву на скале \n В одежде белой над волнами\n",           //0
        " \n Когда, бушуя в бурной мгле,\n Играло море с берегами\n",           //1
        " \n Когда луч молний озарял \n Ее всечасно блеском алым\n",            //2
        " \n И ветер бился и летал \n С ее летучим покрывалом?\n",              //3
        " \n Прекрасно море в бурной мгле \n И небо в блесках без лазури;\n",   //4
        " \n Но верь мне: дева на скале \n  Прекрасней волн, небес и бури.\n")  //5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomMenu = findViewById(R.id.bottom_menu)
        bottomMenu.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu -> {
                    val menuFragment = MenuFragment()
                    ReplaceFragment(menuFragment)
                }
                R.id.about -> {
                    val aboutFragment = AboutFragment()
                    ReplaceFragment(aboutFragment)
                }
            }
            true
        }

        bottomMenu.selectedItemId= savedInstanceState?.getInt(
            LAST_SELECTED_ITEM) ?: R.id.menu


        helloTextView = findViewById(R.id.randr_text)
        randomizeButton = findViewById(R.id.rand2)

        if (savedInstanceState != null)
            helloTextView.text = savedInstanceState.getString(VALUE)
        else
            randomize()

        randomizeButton.setOnClickListener { randomize() }
        Log.d(MY_OWN_LOG_TAG, pushkin[0])

        val nextButton: Button = findViewById(R.id.nexxt_button)
        val link = Uri.parse("https://glazovlife.ru")

        val intentSecondActivity = Intent(this, SecondActivity::class.java)
        val toSecActivity: Button = findViewById(R.id.gotoSecondActivity)
        toSecActivity.setOnClickListener { this.startActivity(intentSecondActivity) }

        val intentThirdActivity = Intent(this, ThirdActivity::class.java)
        val toThirdActivity: Button = findViewById(R.id.gotoThirdActivity)
        toThirdActivity.setOnClickListener { this.startActivity(intentThirdActivity) }

        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_APP_BROWSER)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        nextButton.setOnClickListener { this.startActivity(intent) }

        val snackBut: Button = findViewById(R.id.snackButton)
        snackBut.setOnClickListener {
            showSnackBar(it)
        }

        val razButton: Button = findViewById(R.id.raz)
        val dvaButton: Button = findViewById(R.id.dva)
        val triButton: Button = findViewById(R.id.tri)
        val swOne: Switch = findViewById(R.id.sw1)
        val swTwo: Switch = findViewById(R.id.sw2)
        val swThree: Switch = findViewById(R.id.sw3)
        razButton.setOnClickListener { swOne.isChecked = swOne.isChecked == false }
        dvaButton.setOnClickListener { swTwo.isChecked = swTwo.isChecked == false }
        triButton.setOnClickListener { swThree.isChecked = swThree.isChecked == false }
    }

    private fun showSnackBar(view: View) {
        Snackbar.make(this, view, "Snackbar показан", Snackbar.LENGTH_INDEFINITE)
            .setAction("Action") { Toast.makeText(this, "TOAST1111", Toast.LENGTH_LONG).show() }
            .show()
    }

    private fun ReplaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    fun switchRaz(view: View) {
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
        outState.putInt(LAST_SELECTED_ITEM,bottomMenu.selectedItemId)

    }
}

// Adapter натягивает view на RecyclerVire
// ViewHolder натягивает данные на View
