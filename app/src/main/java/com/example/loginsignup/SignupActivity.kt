package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.EditText
import android.widget.Toast

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_signup)

    }

    fun OpenSignIn(view: View) {
        val editText = findViewById(R.id.etEmail) as EditText
        val editTextPass = findViewById(R.id.etPassword) as EditText
        val editTextName = findViewById(R.id.etName) as EditText
        val email = editText.text.toString()
        val pass = editTextPass.text.toString()
        val name = editTextName.text.toString()
        if (email.trim().isNotEmpty() && pass.trim().isNotEmpty() && name.trim().isNotEmpty()) {
            Toast.makeText(this, "Registered Successfully", Toast.LENGTH_SHORT).show()
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
            //val intent = Intent(this , )
        }
        else
        {
            Toast.makeText(this, "Please Fill all the details", Toast.LENGTH_SHORT).show()
        }
    }
}