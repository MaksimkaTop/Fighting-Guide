package com.example.hp.fightingguide

import com.example.hp.fightingguide.data.Stories

class DataRepository {
    fun getStoriesData(): ArrayList<Stories?> {
        var stories: Stories? = null
        stories = Stories(
                name = "qew",
                icon = "asd",
                story = "asd"
        )
        return arrayListOf(stories)
    }
}