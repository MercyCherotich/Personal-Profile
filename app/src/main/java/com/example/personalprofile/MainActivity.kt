package com.example.personalprofile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOpenGithub: Button = findViewById(R.id.buttonOpenGithub)

        buttonOpenGithub.setOnClickListener {
            val openURL=Intent(android.content.Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://github.com/MercyCherotich")

            startActivity(openURL)
        }
    }
}