package com.sushant.developershelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Blockchain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blockchain)
        val blockchainWebView: WebView = findViewById(R.id.blockchainWebView)
        blockchainWebView.loadUrl("https://www.softwaretestinghelp.com/blockchain-developer/")
    }
}