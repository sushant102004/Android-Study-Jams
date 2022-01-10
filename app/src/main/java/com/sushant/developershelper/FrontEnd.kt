package com.sushant.developershelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class FrontEnd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front_end)
        val frontendWebView: WebView = findViewById(R.id.frontendWebView)
        frontendWebView.loadUrl("https://vitto.cc/the-complete-front-end-developer-roadmap-2021/")
    }
}