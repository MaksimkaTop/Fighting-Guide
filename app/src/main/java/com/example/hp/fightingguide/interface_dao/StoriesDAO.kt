package com.example.hp.fightingguide.interface_dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.example.hp.fightingguide.data.Stories

@Dao
interface StoriesDAO {

    @Query("SELECT * FROM stories")
    fun getAllStory(): List<Stories>
}