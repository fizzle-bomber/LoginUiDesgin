package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

    }

    fun OpenMain(view: View) {
        val editText = findViewById<EditText>(R.id.etEmail)
        val email = editText.text.toString()
        if (email.trim().isNotEmpty()) {
            Toast.makeText(this, "Mail Sent", Toast.LENGTH_SHORT).show()
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }
        else
        {
            Toast.makeText(this, "Please provide Email Id", Toast.LENGTH_SHORT).show()
        }
    }


    fun BackToHome(view: View) {
        val intent = Intent(this , MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}