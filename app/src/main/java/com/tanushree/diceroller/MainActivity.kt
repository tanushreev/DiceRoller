package com.tanushree.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bRoll: Button = findViewById(R.id.bRoll)
        bRoll.text = "Let's Roll"
        bRoll.setOnClickListener { Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show() }
    }
}
