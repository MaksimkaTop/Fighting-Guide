package com.example.hp.fightingguide

import android.content.Context
import com.example.hp.fightingguide.data.Stories
import io.reactivex.Single

class DataRepository {
    fun getStoriesData(context: Context): Single<ArrayList<Stories?>> {

        return Single.create {
            val repo = RequestToBD()
            val stories = Stories(
                    name = repo.getDataName(context, "name", "Injustice2").toString(),
                    icon = repo.getDataName(context, "icon", "Injustice2").toString(),
                    story = repo.getDataName(context, "story", "Injustice2").toString()
            )
            it.onSuccess(arrayListOf(stories))
        }
    }
}