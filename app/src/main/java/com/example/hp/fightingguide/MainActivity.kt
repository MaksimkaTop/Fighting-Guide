package com.example.hp.fightingguide

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        glideGifAdd()
        btn_main_injustice.setOnClickListener {
            val intent = Intent(this, InjusticeActivity::class.java)
            startActivity(intent)
        }
    }

    fun glideGifAdd(){
        imageView2
Glide
                .with(this)
                .load(R.drawable.fire)

                .into(imageView2)

    }
}

