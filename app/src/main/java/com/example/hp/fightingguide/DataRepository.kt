package com.example.hp.fightingguide

import android.content.Context
import com.example.hp.fightingguide.data.StoriesData
import io.reactivex.Single

class DataRepository {


    fun getStoriesData(context: Context): Single<ArrayList<StoriesData>> {
        return Single.create {
            val repo = RequestToDB()
            val storiesDa = repo.getDataFromBD(context, context.getString(R.string.Injustice2))
            it.onSuccess(storiesDa)
        }
    }
}