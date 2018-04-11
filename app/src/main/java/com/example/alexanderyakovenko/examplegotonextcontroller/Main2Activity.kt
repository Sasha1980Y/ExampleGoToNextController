package com.example.alexanderyakovenko.examplegotonextcontroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Main2Activity : AppCompatActivity() {

    var user: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var user1 = getIntent().getExtras().getSerializable("USER")
        var user2 = getIntent().getExtras().getSerializable("UserClass") as User
        println("print object class")
        println(user2.name)
        println(user2.age)

        println("print, print")
        println(user1)
    }
}
