package com.example.hp.fightingguide

import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.example.hp.fightingguide.stories.StoriesRecyclerAdapter
import com.example.hp.fightingguide.view.SelectCharacters
import kotlinx.android.synthetic.main.activity_injustice.*
import java.io.IOException


class InjusticeActivity : AppCompatActivity(), SelectCharacters {
    override fun showError(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initRecycler() {
        rv_injustice.layoutManager = LinearLayoutManager(this)
        rv_injustice.adapter = StoriesRecyclerAdapter()
    }

    override fun showProgressBar(flag: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_card_hero_list)
        AppDatabase.getAppDatabase(this)
       // val sdf = "$ qwe qwe $ qwe $ @ qwe @ $ $ % % % # # "
        // ReplaceButtons().replaceSymbolsPS(sdf,textView4,this)
//        val mDb: SQLiteDatabase
//        val mDBHelper = DatabaseHelper(this)
//        try {
//            mDBHelper.updateDataBase()
//        } catch (mIOException: IOException) {
//            throw Error("UnableToUpdateDatabase")
//        }
//        try {
//            mDb = mDBHelper.writableDatabase
//        } catch (mSQLException: SQLException) {
//            throw mSQLException
//        }
//        var product = ""
//        val cursor: Cursor = mDb.rawQuery("SELECT  icon  FROM Injustice2 ", null)
//        cursor.moveToFirst()
////          while (!cursor.isAfterLast) {
//        product += cursor.getString(0) + " | "
//        cursor.moveToNext()
//
//        Log.wtf("qwe", product)
////          }
//        cursor.close()


    }
}
