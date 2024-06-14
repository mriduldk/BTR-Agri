package com.example.btragriculture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_registration.cirRegisterButton
import kotlinx.android.synthetic.main.fragment_registration.tvLogin

class RegistrationActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_registration)

        tvLogin.setOnClickListener {

            startActivity(Intent(this, LoginActivity::class.java))
        }

        cirRegisterButton.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}