package com.example.hp.fightingguide

import android.content.Context
import com.example.hp.fightingguide.data.Stories
import io.reactivex.Single

class DataRepository {
    fun getStoriesData(context: Context): Single<ArrayList<Stories?>> {

        return Single.create {
            val repo = RequestToBD()
            val stories = Stories(
                    name = repo.getDataFromBD(context, context.getString(R.string.name), context.getString(R.string.Injustice2)),
                    icon = repo.getDataFromBD(context, context.getString(R.string.icon), context.getString(R.string.Injustice2)),
                    story = repo.getDataFromBD(context, context.getString(R.string.story), context.getString(R.string.Injustice2))
            )
            it.onSuccess(arrayListOf(stories))
        }
    }
}