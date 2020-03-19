package com.takatutustudio.lat02ads

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_blog.*

class BlogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        Toast.makeText(this,"Silahkan tunggu..", Toast.LENGTH_SHORT).show()

        web_blog.loadUrl("https://www.qmfinancial.com/blog-dan-artikel/")
        web_blog.settings.javaScriptEnabled
    }
}
