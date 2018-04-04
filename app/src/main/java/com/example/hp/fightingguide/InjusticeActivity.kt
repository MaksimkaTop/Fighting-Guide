package com.example.hp.fightingguide

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.hp.fightingguide.helpers.ReplaceButtons
import kotlinx.android.synthetic.main.item_card_hero_list.*


class InjusticeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_card_hero_list)
        Log.wtf("qwe", "what?!")
        val sdf = "$ qwe qwe $ qwe $ @ qwe @ $ $ % % % # # "
        ReplaceButtons().replaceSymbolsPS(sdf,textView4,this)
// EEEEE change symbol!
//  val text1 = SpannableString(textView4.text)
//// textView4.text = text1
// val myIndex = text1.indexOf("$")
// val icon = resources.getDrawable(R.drawable.h)
// icon.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
// val span = ImageSpan(icon, ImageSpan.ALIGN_BASELINE)
// text1.setSpan(span, myIndex, myIndex + 1, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
//        textView4.text = text1
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
//
//
//        button.setOnClickListener {
//
//            var product = ""
//
//            val cursor: Cursor = mDb.rawQuery("SELECT  Name  FROM Injustice2 ", null)
//            cursor.moveToFirst()
//            while (!cursor.isAfterLast) {
//                product += cursor.getString(0) + " | "
//                cursor.moveToNext()
//
//                Log.wtf("qwe", product)
//
//            }
//            cursor.close()
//            textView4.text = product
//
//
//        }

    }
}
