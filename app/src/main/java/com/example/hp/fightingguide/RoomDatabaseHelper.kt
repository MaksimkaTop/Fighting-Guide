package com.example.hp.fightingguide

import android.arch.persistence.db.SupportSQLiteOpenHelper
import android.arch.persistence.room.Database
import android.arch.persistence.room.DatabaseConfiguration
import android.arch.persistence.room.InvalidationTracker
import android.arch.persistence.room.RoomDatabase
import com.example.hp.fightingguide.data.Stories
import com.example.hp.fightingguide.interface_dao.StoriesDAO

@Database(entities = arrayOf(Stories::class), version = 1)

abstract class RoomDatabaseHelper : RoomDatabase() {
    abstract fun storiesDao(): StoriesDAO

    override fun createOpenHelper(config: DatabaseConfiguration?): SupportSQLiteOpenHelper? {
        return null
    }

    override fun createInvalidationTracker(): InvalidationTracker? {
        return null
    }
}