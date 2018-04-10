package com.example.hp.fightingguide.view

import com.arellomobile.mvp.MvpView
import com.example.hp.fightingguide.data.Stories

interface SelectCharacters: MvpView {
   // fun showError(error: String)
    //fun initRecycler()
    fun withData(data: ArrayList<Stories?>)
   // fun showProgressBar(flag: Boolean)


}