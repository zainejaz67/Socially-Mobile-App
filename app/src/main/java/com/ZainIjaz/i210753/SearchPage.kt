package com.ZainIjaz.i210753

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SearchPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val home = findViewById<ImageView>(R.id.home)
        home.setOnClickListener {
            val intent =
                Intent(this, mainpage::class.java) // replace HomePage with your target Activity
            startActivity(intent)
            finish() // optional: close MainActivity3 after login
        }
        val search = findViewById<LinearLayout>(R.id.search)
        search.setOnClickListener {
            val intent =
                Intent(this, searchbarpage::class.java) // replace HomePage with your target Activity
            startActivity(intent)
            finish() // optional: close MainActivity3 after login
        }
    }
}