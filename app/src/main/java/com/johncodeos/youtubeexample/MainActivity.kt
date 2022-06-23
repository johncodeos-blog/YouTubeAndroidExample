package com.johncodeos.youtubeexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val officialLibButton = findViewById<Button>(R.id.official_lib_button)
        officialLibButton.setOnClickListener {
            val intent = Intent(this, YouTubePlayerAPIActivity::class.java)
            ContextCompat.startActivity(this, intent, null)
        }

        val thirdPartyLibButton = findViewById<Button>(R.id.third_party_lib_button)
        thirdPartyLibButton.setOnClickListener {
            val intent = Intent(this, AndroidYoutubePlayerActivity::class.java)
            ContextCompat.startActivity(this, intent, null)
        }

        val webViewButton = findViewById<Button>(R.id.web_view_button)
        webViewButton.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            ContextCompat.startActivity(this, intent, null)
        }
    }
}
