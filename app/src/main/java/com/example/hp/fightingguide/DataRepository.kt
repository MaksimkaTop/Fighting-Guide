package com.example.hp.fightingguide

import android.content.Context
import com.example.hp.fightingguide.data.Stories
import io.reactivex.Single

class DataRepository {
    fun getStoriesData(context: Context): Single<ArrayList<Stories?>> {

        return Single.create {
            val repo = RequestToBD()
            val stories = Stories(
                    name = repo.getData(context, "name").toString(),
                    icon = repo.getData(context, "icon").toString(),
                    story = repo.getData(context, "story").toString()
            )
            it.onSuccess(arrayListOf(stories))
        }
    }
}