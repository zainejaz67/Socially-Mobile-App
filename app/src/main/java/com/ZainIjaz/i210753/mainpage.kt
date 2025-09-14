package com.ZainIjaz.i210753

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class mainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mainpage)
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

        val send = findViewById<ImageView>(R.id.sendmessage)
        send.setOnClickListener {
            val intent =
                Intent(this, chatsection::class.java)
            startActivity(intent)
            finish()
        }

        val heart = findViewById<ImageView>(R.id.heart)
        heart.setOnClickListener {
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

        val add = findViewById<ImageView>(R.id.addpost)
        add.setOnClickListener {
            val intent =
                Intent(this, Addpost::class.java)
            startActivity(intent)
            finish()
        }

        val cameraopen = findViewById<ImageView>(R.id.camera)
        cameraopen.setOnClickListener {
            val intent =
                Intent(this, camera::class.java)
            startActivity(intent)
            finish()
        }

        val openstory = findViewById<LinearLayout>(R.id.story)
        openstory.setOnClickListener {
            val intent =
                Intent(this, story::class.java)
            startActivity(intent)
            finish()
        }
    }
}