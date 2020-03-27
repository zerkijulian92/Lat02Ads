package com.takatutustudio.lat02ads

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Berpindah ke BlogActivity
        tv_blog.setOnClickListener {
            startActivity(Intent(this, BlogActivity::class.java))
        }
        /**
         * Catt : Jangan lupa tambahkan Internet Permission di Manifest
         **/
    }

    //Menambahkan Fungsi onBackPrassed (AlertDialog)

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Konfirmasi")
            .setMessage("Apakah anda ingin keluar dari aplikasi?")
            .setPositiveButton("Ya", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "Terimakasih telah menggunakan Aplikasi My Financial",
                    Toast.LENGTH_SHORT).show()
                finish()
            })
            .setNegativeButton("Batal", DialogInterface.OnClickListener { dialogInterface, i ->

            }).show()
    }
}
