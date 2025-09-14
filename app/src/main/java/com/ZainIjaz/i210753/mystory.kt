package com.ZainIjaz.i210753

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class mystory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mystory)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val cancelstory1 = findViewById<ImageView>(R.id.cancelmystory)
        cancelstory1.setOnClickListener {
            val intent = Intent(this, mainpage::class.java)
            startActivity(intent)
            finish()
        }

        val addstory1 = findViewById<ImageView>(R.id.addstorybutton)
        addstory1.setOnClickListener {
            val intent = Intent(this, addstory::class.java)
            startActivity(intent)
            finish()
        }

    }
}