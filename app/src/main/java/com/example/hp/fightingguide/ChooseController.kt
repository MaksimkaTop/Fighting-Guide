package com.example.hp.fightingguide

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_choose_controller.*

class ChooseController : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_controller)
        choosed()
    }

    fun choosed() {
        ib_select_control_xbox.setOnClickListener {
            val intent = Intent(this, InjusticeActivity::class.java)
            intent.putExtra("control", "xbox")
            startActivity(intent)
        }
        ib_select_control_ps.setOnClickListener {
            val intent = Intent(this, InjusticeActivity::class.java)
            intent.putExtra("control", "ps")
            startActivity(intent)

        }


    }
}
