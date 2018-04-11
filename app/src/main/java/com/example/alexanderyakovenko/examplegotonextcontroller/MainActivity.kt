package com.example.alexanderyakovenko.examplegotonextcontroller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    val TAG: String = "States"
    lateinit var button: Button

    var user = User("Sasha", 90)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button1)
        button.setOnClickListener {
           println("ok")
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("USER", user.name)
            intent.putExtra("UserClass", user)
            startActivity(intent)


        }
        Log.d(TAG, "MainActivity: onCreate()");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "MainActivity: onRestart()");
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity: onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity: onResume()")
    }





}
