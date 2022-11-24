package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickME = findViewById<Button>(R.id.mybutton)
        val peopleCounter = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickME.setOnClickListener {
            timesClicked += 1

            peopleCounter.text = timesClicked.toString()
            Toast.makeText(this, "Hey Taylor!", Toast.LENGTH_LONG).show()
        }

    }

}