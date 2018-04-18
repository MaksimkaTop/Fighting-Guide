package com.example.hp.fightingguide.combo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.util.Base64
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.hp.fightingguide.R
import com.example.hp.fightingguide.helpers.ReplaceButtons
import com.example.hp.fightingguide.presenter.ComboPresenter
import com.example.hp.fightingguide.view.ComboView
import com.livinglifetechway.k4kotlin.hide
import kotlinx.android.synthetic.main.combos.*

class CombosActivity : MvpAppCompatActivity(), ComboView {
    @InjectPresenter
    lateinit var mComboData: ComboPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.combos)
        pb_combo.hide()
        val nameHero = intent.getStringExtra(getString(R.string.name))
        val iconHero = intent.getStringExtra(getString(R.string.icon))
        val combo = intent.getStringExtra("combo").replace("/n", " ")
        val special = intent.getStringExtra("special").replace("/n", " ")
        tv_combo_name_hero.text = nameHero
        tv_special_usage.text = special
        val imageByteArray = Base64.decode(iconHero, Base64.DEFAULT)

        Glide
                .with(iv_combo_icon_hero)
                .load(imageByteArray)
                .apply(RequestOptions.circleCropTransform())
                .into(iv_combo_icon_hero)

        ReplaceButtons().replaceSymbolsPS(combo, tv_combo_usage, this)
    }

    override fun showError(error: String) {
        Snackbar.make(iv_combo_icon_hero, error, Snackbar.LENGTH_LONG).show()
    }
}