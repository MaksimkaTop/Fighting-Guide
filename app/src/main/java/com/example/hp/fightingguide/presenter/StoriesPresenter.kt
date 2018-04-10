package com.example.hp.fightingguide.presenter

import android.content.Context
import com.arellomobile.mvp.MvpPresenter
import com.example.hp.fightingguide.DataRepository
import com.example.hp.fightingguide.view.SelectCharacters
import com.livinglifetechway.k4kotlin.logD
import com.livinglifetechway.k4kotlin.logWtf
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

class StoriesPresenter : MvpPresenter<SelectCharacters>() {

    fun getStoriesData(context: Context) {
      //  viewState.showProgressBar(true)
        DataRepository().getStoriesData(context)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    it.first()?.logWtf("tadaaaaa")
                    //iewState.initRecycler()
                   // viewState.showProgressBar(false)
                }, {})
    }
}