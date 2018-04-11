package com.example.hp.fightingguide

import android.content.Context
import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import java.io.IOException

class RequestToBD {
    fun getDataName(context: Context, columnName: String, game: String): String {
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
        val cursor: Cursor = mDb.rawQuery("SELECT  $columnName  FROM $game ", null)
        cursor.moveToFirst()
//          while (!cursor.isAfterLast) {
        product += cursor.getString(0) //+ " | "
        cursor.moveToNext()
//          }
        cursor.close()
        return product
    }


}