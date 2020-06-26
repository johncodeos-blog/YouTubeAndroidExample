package com.johncodeos.youtubeexample


import android.os.Bundle
import com.johncodeos.youtubeexample.R
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_youtube_player_api.*
import com.google.android.youtube.player.*
import android.content.pm.ActivityInfo




class YouTubePlayerAPIActivity : AppCompatActivity(), YouTubePlayer.OnInitializedListener {


    private val RECOVERY_DIALOG_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube_player_api)

        val youTubePlayerFragment = supportFragmentManager.findFragmentById(R.id.official_player_view) as YouTubePlayerSupportFragment?
        youTubePlayerFragment?.initialize("YOUR_API_KEY", this)
    }

    override fun onInitializationSuccess(provider: YouTubePlayer.Provider,youTubePlayer: YouTubePlayer,wasRestored: Boolean) {
        if (!wasRestored) {
            youTubePlayer.cueVideo("YE7VzlLtp-4")
        }
    }


    override fun onInitializationFailure(provider: YouTubePlayer.Provider,youTubeInitializationResult: YouTubeInitializationResult) {
        if (youTubeInitializationResult.isUserRecoverableError) {
            youTubeInitializationResult.getErrorDialog(this, RECOVERY_DIALOG_REQUEST).show()
        } else {
            val errorMessage = String.format(
                "There was an error initializing the YouTubePlayer (%1\$s)",
                youTubeInitializationResult.toString()
            )
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show()
        }
    }
}