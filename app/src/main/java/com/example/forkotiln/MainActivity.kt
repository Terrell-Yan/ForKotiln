package com.example.forkotiln

import android.database.Observable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    var arr_string:MutableList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_on.setOnClickListener {
            Toast.makeText(this, "nihao", Toast.LENGTH_LONG).show()
        }
//        main()
//      main_for()

    }
    fun main_for(){
        val cakes= listOf("var","cage","age")
        for (cake in cakes){
            println("ymy,it's  +"+cake)
        }

    }

    public class StringUtils() {
        companion object {
            fun myFun() {

            }
        }
    }
    fun main() {
        cases("hello")
    }

    fun cases(obj: Any) {
        when (obj) {
            1 -> println("one")
            "" -> println("Greeting")
            is Long -> println("Long")
            !is String -> println("Not a String")
            else -> println("Unknown")
        }
    }

}
