package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Barrier : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barrier)
    }

    fun OpenCenter(view: View) {

        val intent = Intent(this, centerConstraint::class.java)
        startActivity(intent)

    }
}