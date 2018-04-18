package com.example.hp.fightingguide

import android.content.Context
import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.util.Log
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
        val cursor: Cursor = mDb.rawQuery("SELECT  name,story , icon ,combo, special  FROM $game ", null)
        cursor.moveToFirst()
        while (!cursor.isAfterLast) {
            product += cursor.getString(0) //+ " | "
            listStories.add(StoriesData(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4)))
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
        val cursor: Cursor = mDb.rawQuery("SELECT  combo, special   FROM $game WHERE Name = $nameHero", null)
        cursor.moveToFirst()
        while (!cursor.isAfterLast) {
            product += cursor.getString(0) //+ " | "
            listStories.add(CombosData(cursor.getString(0), cursor.getString(1)))
            cursor.moveToNext()
        }
        Log.wtf("qwe", listStories.toString())
        cursor.close()
        return listStories
    }


}