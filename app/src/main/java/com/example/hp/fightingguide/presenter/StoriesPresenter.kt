package com.example.hp.fightingguide.presenter

import com.arellomobile.mvp.MvpPresenter
import com.example.hp.fightingguide.view.SelectCharacters

class StoriesPresenter : MvpPresenter<SelectCharacters>() {
fun addDatePresenter(){
    viewState.showProgressBar(true)

}
}