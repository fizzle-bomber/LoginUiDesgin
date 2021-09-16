package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OpenHomePage(view: View) {
        val editText = findViewById(R.id.etEmail) as EditText
        val editTextPass = findViewById(R.id.etPassword) as EditText
        val email = editText.text.toString()
        val pass = editTextPass.text.toString()
        if (email.trim().isNotEmpty() && pass.trim().isNotEmpty()) {
            Toast.makeText(this, "Welcome User", Toast.LENGTH_SHORT).show()
            val intent = Intent(this , HomePage::class.java)
            startActivity(intent)
        }
        else
        {
            Toast.makeText(this, "Either of Email or Password is empty", Toast.LENGTH_SHORT).show()
        }
    }

    fun OpenSignUp(view: View) {
        val intent = Intent(this, SignupActivity::class.java)
        startActivity(intent)
    }

    fun OpenRecovery(view: View) {
        val intent = Intent(this , ForgotPassword::class.java)
        startActivity(intent)
    }
}