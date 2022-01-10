package com.sushant.developershelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val continueButton: Button = findViewById(R.id.continueButton);
        continueButton.setOnClickListener{
            val intent = Intent(this, Dashboard::class.java);
            startActivity(intent);
        }
    }
}