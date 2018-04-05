package com.example.hp.fightingguide.presenter

import android.app.Application
import android.content.Context
import com.arellomobile.mvp.MvpPresenter
import com.example.hp.fightingguide.AppDatabase
import com.example.hp.fightingguide.data.Stories
import com.example.hp.fightingguide.view.SelectCharacters
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlin.coroutines.experimental.coroutineContext

class StoriesPresenter : MvpPresenter<SelectCharacters>() {

    fun getStoriesData(){
//    viewState.showProgressBar(true)
//    AppDatabase.getAppDatabase().storiesDao().getAllStory()
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribeOn(Schedulers.io())
//            .subscribe({
//                if (it != null) {
//                    viewState.initRecycler(it)
//                }
//                viewState.showProgressBar(false)
//            }, {})
    }
}