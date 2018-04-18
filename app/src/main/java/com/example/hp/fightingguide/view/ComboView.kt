package com.example.hp.fightingguide.view

import com.arellomobile.mvp.MvpView
import com.example.hp.fightingguide.data.CombosData
import com.example.hp.fightingguide.data.StoriesData

interface ComboView : MvpView {
    fun showError(error: String)
  //  fun getData(data: ArrayList<CombosData>)
}