package com.example.hp.fightingguide.presenter

import android.content.Context
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.hp.fightingguide.R
import com.example.hp.fightingguide.helpers.ReplaceButtons
import com.example.hp.fightingguide.view.ComboView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@InjectViewState

class ComboPresenter : MvpPresenter<ComboView>() {

    fun getComboData(console: String, context: Context, text: String) {
        viewState.showProgressBar(true)
        if (console == context.getString(R.string.ps))ReplaceButtons().replaceSymbolsPS(text, context)
        else ReplaceButtons().replaceSymbolsXBX(text, context)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    viewState.getData(it)
                     viewState.showProgressBar(false)
                }, {
                    viewState.showError(context.getString(R.string.wrong_message))
                })
    }
}
