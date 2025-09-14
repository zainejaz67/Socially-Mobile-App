package com.ZainIjaz.i210753

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Myprofile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_myprofile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val home = findViewById<ImageView>(R.id.homeprofile)
        home.setOnClickListener {
            val intent =
                Intent(this, mainpage::class.java)
            startActivity(intent)
            finish()
        }

        val search = findViewById<ImageView>(R.id.searchprofile)
        search.setOnClickListener {
            val intent =
                Intent(this, SearchPage::class.java)
            startActivity(intent)
            finish()
        }

        val heart1 = findViewById<ImageView>(R.id.heartprofile)
        heart1.setOnClickListener {
            val intent =
                Intent(this, notificationspage1::class.java)
            startActivity(intent)
            finish()
        }

        val highlight1 = findViewById<LinearLayout>(R.id.highlight)
        highlight1.setOnClickListener {
            val intent =
                Intent(this, highlight::class.java)
            startActivity(intent)
            finish()
        }
    }
}