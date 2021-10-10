package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buGetAge.setOnClickListener {
            buUserAgeCLick()
        }
    }

    fun buUserAgeCLick(){
        val userDOB : Int =  Integer.parseInt (etDOB.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val userAge = currentYear - userDOB
        textView.text = "Your Age is $userAge Years"
    }
}