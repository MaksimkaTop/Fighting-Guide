package com.example.hp.fightingguide

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickGame()
    }
    fun clickGame(){
        iv_tekken7.setOnClickListener {
            val intent = Intent(this, ChooseController::class.java)
            intent.putExtra(getString(R.string.game), getString(R.string.Tekken7))
            startActivity(intent)
        }
        iv_injustice2.setOnClickListener {
            val intent = Intent(this, ChooseController::class.java)
            intent.putExtra(getString(R.string.game), getString(R.string.Injustice2))
            startActivity(intent)
        }
        iv_mkx.setOnClickListener {
            val intent = Intent(this, ChooseController::class.java)
            intent.putExtra(getString(R.string.game), getString(R.string.MKX))
            startActivity(intent)
        }

    }


}

