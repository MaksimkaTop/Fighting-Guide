package com.example.hp.fightingguide.view

import com.arellomobile.mvp.MvpView
import com.example.hp.fightingguide.data.StoriesData

interface StoriesView : MvpView {
    fun showError(error: String)
    fun getData(data: ArrayList<StoriesData>)
    fun showProgressBar(flag: Boolean)


}