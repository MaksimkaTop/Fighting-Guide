package com.example.hp.fightingguide

import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Base64
import android.util.Log
import com.bumptech.glide.Glide
import com.example.hp.fightingguide.helpers.ReplaceButtons
import kotlinx.android.synthetic.main.item_card_hero_list.*
import java.io.IOException


class InjusticeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_card_hero_list)
        val sdf = "$ qwe qwe $ qwe $ @ qwe @ $ $ % % % # # "
       // ReplaceButtons().replaceSymbolsPS(sdf,textView4,this)



      val mDb: SQLiteDatabase
      val mDBHelper = DatabaseHelper(this)
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

          val cursor: Cursor = mDb.rawQuery("SELECT  icon  FROM Injustice2 ", null)
          cursor.moveToFirst()
//          while (!cursor.isAfterLast) {
              product += cursor.getString(0) + " | "
              cursor.moveToNext()

              Log.wtf("qwe", product)

//          }
          cursor.close()
         // textView4.text = product
        val imageByteArray = Base64.decode(product, Base64.DEFAULT)

        Glide
               .with(this)
               .load(imageByteArray)
               .into(person_photo)


    }
}
