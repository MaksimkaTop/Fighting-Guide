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

    var controlType: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_injustice)
        controlType =  intent.getStringExtra(getString(R.string.control_type))
        Log.wtf("qwe", controlType)

        // initRecycler()
       // val test = AppDatabase.get
       // Log.wtf("qwe", test.toString())
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
}
