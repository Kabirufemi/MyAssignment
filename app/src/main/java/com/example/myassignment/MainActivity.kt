package com.example.myassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGithub = findViewById<Button>(R.id.btn)
        btnGithub.setOnClickListener {
            startActivity(Intent(this@MainActivity, GoHereActivity::class.java))
            finish()
        }
    }
}