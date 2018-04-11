package com.example.hp.fightingguide.presenter

import android.content.Context
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.hp.fightingguide.DataRepository
import com.example.hp.fightingguide.R
import com.example.hp.fightingguide.view.SelectCharacters
import com.livinglifetechway.k4kotlin.logWtf
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers;
@InjectViewState
class StoriesPresenter : MvpPresenter<SelectCharacters>() {

    fun getStoriesData(context: Context) {
        viewState.showProgressBar(true)
        DataRepository().getStoriesData(context)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    it.first()?.logWtf("tadaaaaa")
                    viewState.getData(it)
                    viewState.showProgressBar(false)
                }, {
                    viewState.showError(context.getString(R.string.wrong_message))
                })
    }
}