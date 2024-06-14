package com.example.btragriculture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_login.cirLoginButton
import kotlinx.android.synthetic.main.fragment_login.tvForgotPass
import kotlinx.android.synthetic.main.fragment_login.tvRegistration

class LoginActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login)


        cirLoginButton.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
        }

        tvForgotPass.setOnClickListener {

            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

        tvRegistration.setOnClickListener {

            startActivity(Intent(this, RegistrationActivity::class.java))
        }


    }
}