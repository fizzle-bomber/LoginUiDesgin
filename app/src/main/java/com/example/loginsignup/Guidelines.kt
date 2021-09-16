package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Guidelines : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guidelines)
    }
    fun OpenGone(view: View) {
        val intent = Intent(this, GoneView::class.java)
        startActivity(intent)
    }
}