package com.sushant.developershelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val frontendButton: Button = findViewById(R.id.frontend)
        frontendButton.setOnClickListener{
            val intent = Intent(this, FrontEnd::class.java)
            startActivity(intent)
        }
        val backendButton: Button = findViewById(R.id.backend)
        backendButton.setOnClickListener{
            val intent = Intent(this, Backend::class.java)
            startActivity(intent)
        }
        val appDevelopmentButton: Button = findViewById(R.id.appDevelopment)
        appDevelopmentButton.setOnClickListener{
            val intent = Intent(this, AppDevelopment::class.java)
            startActivity(intent)
        }
        val blockChainDevelopmentButton: Button = findViewById(R.id.blockchainDevelopment)
        blockChainDevelopmentButton.setOnClickListener{
            val intent = Intent(this, Blockchain::class.java)
            startActivity(intent)
        }
    }
}