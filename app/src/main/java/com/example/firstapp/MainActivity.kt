package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.view.animation.Animation
import android.widget.ImageView
import android.widget.TextView
import android.os.Handler


class MainActivity : AppCompatActivity() {
    companion object{
        const val splash_screen = 5000
    }
    //variables
    private lateinit var topAnim: Animation
    private lateinit var bottomAnim: Animation
    private lateinit var image: ImageView
    private lateinit var logo: TextView
    private lateinit var underLogo: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        //hooks
        image = findViewById(R.id.imageView)
        logo = findViewById(R.id.title)
        underLogo = findViewById(R.id.slogan)

        image.startAnimation(topAnim)
        logo.startAnimation(bottomAnim)
        underLogo.startAnimation(bottomAnim)

         Handler().postDelayed({
            val intent = Intent(this@MainActivity, login::class.java)
            startActivity(intent)
            finish()
        }, splash_screen.toLong())
    }
}