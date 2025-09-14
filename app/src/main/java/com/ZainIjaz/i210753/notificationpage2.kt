package com.ZainIjaz.i210753

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class notificationpage2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_notificationpage2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val search = findViewById<ImageView>(R.id.searchbutton)
        search.setOnClickListener {
            val intent =
                Intent(this, SearchPage::class.java)
            startActivity(intent)
            finish()
        }

        val home = findViewById<ImageView>(R.id.homebutton)
        home.setOnClickListener {
            val intent =
                Intent(this, mainpage::class.java)
            startActivity(intent)
            finish()
        }

        val following = findViewById<TextView>(R.id.following)
        following.setOnClickListener {
            val intent =
                Intent(this, notificationspage1::class.java)
            startActivity(intent)
            finish()
        }

        val profile = findViewById<ImageView>(R.id.profile)
        profile.setOnClickListener {
            val intent =
                Intent(this, Myprofile::class.java)
            startActivity(intent)
            finish()
        }

    }
}