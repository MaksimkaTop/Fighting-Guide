package com.example.hp.fightingguide.view

import com.arellomobile.mvp.MvpView

interface SelectCharacters: MvpView {
    fun showError(error: String)
    fun initRecycler()
    fun showProgressBar(flag: Boolean)


}