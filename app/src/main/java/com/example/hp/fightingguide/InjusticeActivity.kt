package com.example.hp.fightingguide

import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ImageSpan
import android.util.Log
import kotlinx.android.synthetic.main.item_card_hero_list.*
import java.io.IOException


class InjusticeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_card_hero_list)
        Log.wtf("qwe", "what?!")
// EEEEE change symbol!
 //        val text1 = SpannableString("qwe qwe $ qwe qwe")
//        textView4.text = text1
//        val myIndex = text1.indexOf("$")
//        val icon = resources.getDrawable(R.drawable.h)
//        icon.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
//        val span = ImageSpan(icon, ImageSpan.ALIGN_BASELINE)
//        text1.setSpan(span, myIndex, myIndex + 1, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)



        button.setOnClickListener {
            val mDb: SQLiteDatabase
            val mDBHelper = DBHelper(this)
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

            val cursor: Cursor = mDb.rawQuery("SELECT *  FROM Injustice2", null)
            cursor.moveToFirst()
            while (!cursor.isAfterLast) {
                product += cursor.getString(1) + " | "
                cursor.moveToNext()

                Log.wtf("qwe", product)

            }
            cursor.close()
            textView4.text = product


        }

    }
}
