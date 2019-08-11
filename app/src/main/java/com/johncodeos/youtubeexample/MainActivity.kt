package com.johncodeos.youtubeexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        officiallibbtn.setOnClickListener {
            val intent = Intent(this, YouTubePlayerAPIActivity::class.java)
            ContextCompat.startActivity(this, intent, null)
        }

        thirdpartylibbtn.setOnClickListener {
            val intent = Intent(this, AndroidYoutubePlayerActivity::class.java)
            ContextCompat.startActivity(this, intent, null)
        }

        webviewbtn.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            ContextCompat.startActivity(this, intent, null)
        }
    }
}
