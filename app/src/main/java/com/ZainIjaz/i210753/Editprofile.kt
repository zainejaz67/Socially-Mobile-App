package com.ZainIjaz.i210753

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Editprofile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_editprofile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val cancel = findViewById<TextView>(R.id.cancel)
        cancel.setOnClickListener {
            val intent =
                Intent(this, Myprofile::class.java)
            startActivity(intent)
            finish()
        }

        val Done = findViewById<TextView>(R.id.Done)
        Done.setOnClickListener {
            val intent =
                Intent(this, Myprofile::class.java)
            startActivity(intent)
            finish()
        }
    }
}