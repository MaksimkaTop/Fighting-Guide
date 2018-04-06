package com.example.hp.fightingguide

import android.app.Application
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.example.hp.fightingguide.data.Stories
import com.example.hp.fightingguide.interface_dao.StoriesDAO

//@Database(entities = arrayOf(Stories::class), version = 1)
abstract class AppDatabase : RoomDatabase() {

//
//    private var instance: AppDatabase? = null
//    private var db: RoomDatabaseHelper? = null
//
//    fun getInstance(): AppDatabase? {
//        return instance
//    }
//
//    override fun onCreate() {
//        super.onCreate()
//        instance = this
//        db = Room.databaseBuilder(applicationContext, RoomDatabaseHelper::class.java, "data-database")
//                .allowMainThreadQueries()
//                .build()
//    }
//
//    fun getDatabaseInstance(): RoomDatabaseHelper? {
//        return db
//    }



    abstract fun storiesDao(): StoriesDAO

    companion object {

        private var INSTANCE: AppDatabase? = null
    }
        fun getAppDatabase(context: Context): AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "games")
                        // allow queries on the main thread.
                        // Don't do this on a real app! See PersistenceBasicSample for an example.
                        .allowMainThreadQueries()
                        .build()
            }
            return INSTANCE as AppDatabase
        }

        fun destroyInstance() {
            INSTANCE = null
        }

}