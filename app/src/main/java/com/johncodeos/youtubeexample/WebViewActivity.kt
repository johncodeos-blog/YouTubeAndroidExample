package com.johncodeos.youtubeexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

@SuppressLint("SetJavaScriptEnabled")
class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val webViewPlayerView = findViewById<WebView>(R.id.webview_player_view)
        webViewPlayerView.settings.javaScriptEnabled = true
        webViewPlayerView.loadUrl("https://www.youtube.com/embed/YE7VzlLtp-4")
    }
}
