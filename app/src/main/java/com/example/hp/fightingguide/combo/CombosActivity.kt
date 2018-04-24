package com.example.hp.fightingguide.combo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.text.SpannableString
import android.util.Base64
import android.view.View
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.hp.fightingguide.R
import com.example.hp.fightingguide.data.StoriesData
import com.example.hp.fightingguide.helpers.MessageShow
import com.example.hp.fightingguide.presenter.ComboPresenter
import com.example.hp.fightingguide.view.ComboView
import kotlinx.android.synthetic.main.activity_stories.*
import kotlinx.android.synthetic.main.combos.*


class CombosActivity : MvpAppCompatActivity(), ComboView {

    @InjectPresenter
    lateinit var mComboData: ComboPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.combos)
        val nameHero = intent.getStringExtra(getString(R.string.name))
        val iconHero = intent.getStringExtra(getString(R.string.icon))
        val combo = intent.getStringExtra("combo")
        val special = intent.getStringExtra("special")
        tv_combo_name_hero.text = nameHero
        tv_special_usage.text = special
        mComboData.getComboData(this, combo)
        val imageByteArray = Base64.decode(iconHero, Base64.DEFAULT)
        Glide
                .with(iv_combo_icon_hero)
                .load(imageByteArray)
                .apply(RequestOptions.circleCropTransform())
                .into(iv_combo_icon_hero)

    }

    override fun showError(error: String) {
        MessageShow().showSnackbar(iv_combo_icon_hero,error)
    }

    override fun getData(data: SpannableString) {
        tv_combo_usage.text = data
    }

    override fun showProgressBar(flag: Boolean) {
        tv_special_usage.visibility = if (flag) View.INVISIBLE else View.VISIBLE
        tv_combo_combo.visibility = if (flag) View.INVISIBLE else View.VISIBLE
        tv_combo_special.visibility = if (flag) View.INVISIBLE else View.VISIBLE
        pb_combo.visibility = if (flag) View.VISIBLE else View.INVISIBLE
    }
}