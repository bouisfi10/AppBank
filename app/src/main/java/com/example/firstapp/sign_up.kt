package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val connect = findViewById<Button>(R.id.connect)

        connect.setOnClickListener(View.OnClickListener{
            val intent = Intent(this@sign_up, login::class.java)
            startActivity(intent)
            finish()
        })



    }
}