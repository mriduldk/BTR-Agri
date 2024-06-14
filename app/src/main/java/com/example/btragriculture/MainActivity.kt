package com.example.btragriculture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.extendedFloatingActionButton_createPost
import kotlinx.android.synthetic.main.fragment_registration.cirRegisterButton
import kotlinx.android.synthetic.main.layout_post_for_list.postLayout

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        extendedFloatingActionButton_createPost.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }


        postLayout.setOnClickListener {
            startActivity(Intent(this, PostDetailsActivity::class.java))
        }


    }
}