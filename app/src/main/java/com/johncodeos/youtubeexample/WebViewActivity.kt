package com.johncodeos.youtubeexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web_view.*

@SuppressLint("SetJavaScriptEnabled")
class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)


        webview_player_view.settings.javaScriptEnabled = true
        webview_player_view.loadUrl("https://www.youtube.com/embed/YE7VzlLtp-4")
    }
}
