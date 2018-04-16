package com.example.hp.fightingguide

import android.content.Context
import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import com.example.hp.fightingguide.data.CombosData
import com.example.hp.fightingguide.data.StoriesData
import java.io.IOException

class RequestToDB {
    fun getDataFromBD(context: Context, game: String): ArrayList<StoriesData> {
        val mDb: SQLiteDatabase
        val mDBHelper = DatabaseHelper(context)
        try {
            mDBHelper.updateDataBase()
        } catch (mIOException: IOException) {
            throw Error("UnableToUpdateDatabase")
        }
        try {
            mDb = mDBHelper.writableDatabase
        } catch (mSQLException: SQLException) {
            throw mSQLException
        }
        var product = ""
        val listStories = arrayListOf<StoriesData>()
        val cursor: Cursor = mDb.rawQuery("SELECT  name,story , icon   FROM $game ", null)
        cursor.moveToFirst()
        while (!cursor.isAfterLast) {
            product += cursor.getString(0) //+ " | "
            listStories.add(StoriesData(cursor.getString(0), cursor.getString(1), cursor.getString(2)))
            cursor.moveToNext()
        }
        cursor.close()
        return listStories
    }

    fun getDataFromBDCombo(context: Context, game: String, nameHero: String): ArrayList<CombosData> {
        val mDb: SQLiteDatabase
        val mDBHelper = DatabaseHelper(context)
        try {
            mDBHelper.updateDataBase()
        } catch (mIOException: IOException) {
            throw Error("UnableToUpdateDatabase")
        }
        try {
            mDb = mDBHelper.writableDatabase
        } catch (mSQLException: SQLException) {
            throw mSQLException
        }
        var product = ""
        val listStories = arrayListOf<CombosData>()
        val cursor: Cursor = mDb.rawQuery("SELECT  name, icon, combo, special   FROM $game WHERE name = $nameHero", null)
        cursor.moveToFirst()
        while (!cursor.isAfterLast) {
            product += cursor.getString(0) //+ " | "
            listStories.add(CombosData(cursor.getString(0), cursor.getString(1), cursor.getString(2)))
            cursor.moveToNext()
        }
        cursor.close()
        return listStories
    }


}