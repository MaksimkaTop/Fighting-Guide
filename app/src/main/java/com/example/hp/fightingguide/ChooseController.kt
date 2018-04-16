package com.example.hp.fightingguide

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.hp.fightingguide.stories.StoriesActivity
import kotlinx.android.synthetic.main.activity_choose_console.*

class ChooseController : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_console)
        val choosedGame = intent.getStringExtra(getString(R.string.game))
        chooseConsole(choosedGame)

    }

    private fun chooseConsole(gameName: String) {
        ib_select_control_xbox.setOnClickListener {
            val intent = Intent(this, StoriesActivity::class.java)
            intent.putExtra(getString(R.string.control_type), getString(R.string.xbox))
            intent.putExtra(getString(R.string.game), gameName)
            startActivity(intent)
        }
        ib_select_control_ps.setOnClickListener {
            val intent = Intent(this, StoriesActivity::class.java)
            intent.putExtra(getString(R.string.control_type), getString(R.string.ps))
            intent.putExtra(getString(R.string.game), gameName)

            startActivity(intent)

        }
    }
}
