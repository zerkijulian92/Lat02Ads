package com.takatutustudio.lat02ads

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //Berpindah Activity
        btn_getstarted.setOnClickListener {
            finish()
            startActivity(Intent(this, OnboardingOneActivity::class.java))
            //Memasukan animasi transisi
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out)

        }
    }
}
