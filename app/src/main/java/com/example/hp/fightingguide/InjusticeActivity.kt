package com.example.hp.fightingguide

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ImageSpan
import kotlinx.android.synthetic.main.item_card_hero_list.*


class InjusticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_card_hero_list)

        val text1 = SpannableString("qwe qwe $ qwe qwe")
        textView4.text = text1
        val myIndex = text1.indexOf("$")
        val icon = resources.getDrawable(R.drawable.h)
        icon.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
        val span = ImageSpan(icon, ImageSpan.ALIGN_BASELINE)
        text1.setSpan(span, myIndex, myIndex + 1, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        button.setOnClickListener {

            textView4.text = text1
        }
    }
}
