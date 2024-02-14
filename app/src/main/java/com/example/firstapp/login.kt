package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val connect = findViewById<Button>(R.id.connect)
        val username = findViewById<TextInputLayout>(R.id.username)
        val password = findViewById<TextInputLayout>(R.id.password)
        val error = findViewById<TextView>(R.id.error)
        val signUp = findViewById<Button>(R.id.sign_up)

        error.visibility = View.GONE

        connect.setOnClickListener(View.OnClickListener {
            error.visibility = View.GONE
            val TxtUsername = username.editText?.text.toString().trim()
            val TxtPassword = password.editText?.text.toString().trim()
            if (TxtUsername.isEmpty() || TxtPassword.isEmpty()){
                error.text = "You must fill all the fields"
                error.visibility = View.VISIBLE
            }else{
                val correctUsername = "adambouisfi"
                val correctPassword = "adam1234"
                if (TxtUsername==correctUsername && TxtPassword == correctPassword){
                    Toast.makeText(this, "welcome, now you can acces top your account", Toast.LENGTH_LONG ).show()
                    val intent = Intent(this@login, dashboard::class.java)
                    startActivity(intent)
                    finish()
                }else{
                    error.text = "username or password incorrect"
                    error.visibility = View.VISIBLE
                }

            }
        })
        signUp.setOnClickListener(View.OnClickListener{
            val intent = Intent(this@login, sign_up::class.java)
            startActivity(intent)
            finish()
        })
    }
}