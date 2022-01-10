package com.sushant.developershelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class AppDevelopment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_development)
        val appDevelopmentWebView: WebView = findViewById(R.id.appDevelopmentWebView)
        appDevelopmentWebView.loadUrl("https://medium.com/google-developer-experts/roadmap-to-learn-flutter-like-a-pro-594f5c38e74a")
    }
}