package com.sushant.developershelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Backend : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backend)
        val backendWebView: WebView = findViewById(R.id.backendWebView)
        backendWebView.loadUrl("https://dev.to/creativetim_official/the-complete-roadmap-for-becoming-a-backend-developer-step-by-step-instructions-d4j")
    }
}