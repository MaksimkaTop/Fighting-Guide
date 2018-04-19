package com.example.hp.fightingguide.view

import android.text.SpannableString
import com.arellomobile.mvp.MvpView

interface ComboView : MvpView {
    fun showError(error: String)
    fun getData(data: SpannableString)
    fun showProgressBar(flag: Boolean)
}