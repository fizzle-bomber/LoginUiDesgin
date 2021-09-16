package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GoneView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gone_view)
    }

    fun OpenBarrier(view: View) {

            val intent = Intent(this, Barrier::class.java)
            startActivity(intent)
        }
    }
