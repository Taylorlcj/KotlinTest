package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstancestate)
        setContentView(R.Layout.activity_main)

        val btnCLickME = findViewById<Button>(R.id.mybutton)

    }

}