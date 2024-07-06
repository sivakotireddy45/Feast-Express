package com.example.bdaycardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val setName = findViewById<TextView>(R.id.setName)

        val name = intent.getStringExtra("name")

        setName.setText(name)
    }
}