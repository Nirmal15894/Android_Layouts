package com.example.androidlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebActivity : AppCompatActivity() {

    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        webView = findViewById(R.id.web_view)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("http://www.google.com")
    }

    override fun onBackPressed() {

        if(webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }

    }
}