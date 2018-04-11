package com.example.hp.fightingguide

import android.content.Context
import com.example.hp.fightingguide.data.StoriesData
import io.reactivex.Single

class DataRepository {
    fun getStoriesData(context: Context): Single<ArrayList<StoriesData?>> {

        return Single.create {
            val repo = RequestToDB()
            val stories = StoriesData(
                    name = repo.getDataFromBD(context, context.getString(R.string.name), context.getString(R.string.Injustice2)),
                    icon = repo.getDataFromBD(context, context.getString(R.string.icon), context.getString(R.string.Injustice2)),
                    story = repo.getDataFromBD(context, context.getString(R.string.story), context.getString(R.string.Injustice2))
            )
            it.onSuccess(arrayListOf(stories))
        }
    }
}