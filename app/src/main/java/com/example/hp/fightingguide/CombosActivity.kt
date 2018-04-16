package com.example.hp.fightingguide

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Base64
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.combos.*

class CombosActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.combos)
        val nameHero = intent.getStringExtra("name")
        val iconHero = intent.getStringExtra("icon")
        tv_combo_name_hero.text = nameHero

        val imageByteArray = Base64.decode(iconHero, Base64.DEFAULT)


        Glide
                .with(iv_combo_icon_hero)
                .load(imageByteArray)
                .apply(RequestOptions.circleCropTransform())
                .into(iv_combo_icon_hero)

    }
}