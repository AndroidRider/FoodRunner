package com.androidrider.foodrunner.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.androidrider.foodrunner.R


class SplashActivity : AppCompatActivity() {

    lateinit var topAnim: Animation
    lateinit var txtFoodZest: TextView
    lateinit var imgAppIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash)

        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash)

        //set animation for logo
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        txtFoodZest = findViewById(R.id.txtFoodRunner)
        imgAppIcon = findViewById(R.id.imgAppIcon)

        txtFoodZest.animation = topAnim
        imgAppIcon.animation = topAnim


        Handler().postDelayed({
            val mainIntent =
                Intent(this@SplashActivity, LoginRegisterActivity::class.java)
            finish()
            startActivity(mainIntent)
        }, 3000)
    }
}
