package com.example.hp.fightingguide

import android.content.Context
import com.example.hp.fightingguide.data.CombosData
import com.example.hp.fightingguide.data.StoriesData
import io.reactivex.Single

class DataRepository {
    private val repo = RequestToDB()

    fun getStoriesData(context: Context, game:String): Single<ArrayList<StoriesData>> {
        return Single.create {
            val storiesDa = repo.getDataFromBD(context, game)
            it.onSuccess(storiesDa)
        }
    }

//    fun getComboData(context: Context, nameHero: String): Single<ArrayList<CombosData>> {
//        return Single.create {
//            val combosDa = repo.getDataFromBDCombo(context, context.getString(R.string.Injustice2db), nameHero)
//            it.onSuccess(combosDa)
//        }
//    }

}