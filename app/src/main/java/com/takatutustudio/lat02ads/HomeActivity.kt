package com.takatutustudio.lat02ads

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        Berpindah ke BlogActivity
        tv_blog.setOnClickListener {
            startActivity(Intent(this, BlogActivity::class.java))
        }
        /**
         * Catt : Jangan lupa tambahkan Internet Permission di Manifest
         **/
    }
}
