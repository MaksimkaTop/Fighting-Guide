package com.example.hp.fightingguide.presenter

import android.content.Context
import android.widget.TextView
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.hp.fightingguide.DataRepository
import com.example.hp.fightingguide.R
import com.example.hp.fightingguide.helpers.ReplaceButtons
import com.example.hp.fightingguide.view.ComboView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.*

@InjectViewState

class ComboPresenter: MvpPresenter<ComboView>() {

//    fun getComboData(context: Context, nameHero : String) {
//        DataRepository().getComboData(context, nameHero)
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(Schedulers.io())
//                .subscribe({
//                    viewState.getData(it)
//                }, {
//                    viewState.showError(context.getString(R.string.wrong_message))
//                })
//    }
}
