package com.example.hp.fightingguide.helpers

import android.content.Context
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ImageSpan
import android.widget.TextView
import com.example.hp.fightingguide.R

class ReplaceButtons {

    fun replacesymbolsPS(text: String, view: TextView, context: Context) {

        val textSpan = SpannableString(text)

//       var myIndex = 1
//               myIndex = textSpan.indexOf("$",startIndex = myIndex  )
        val myIndex1 = textSpan.indexOf("#")
        val myIndex2 = textSpan.indexOf("@")
        val myIndex3 = textSpan.indexOf("%")

        val icon = context.resources.getDrawable(R.drawable.h)
        val icon1 = context.resources.getDrawable(R.drawable.h)
        val icon2 = context.resources.getDrawable(R.drawable.h)
        val icon3 = context.resources.getDrawable(R.drawable.h)

        icon.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
        icon1.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
        icon2.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
        icon3.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)

        val span = ImageSpan(icon, ImageSpan.ALIGN_BASELINE)
        val span1 = ImageSpan(icon1, ImageSpan.ALIGN_BASELINE)
        val span2 = ImageSpan(icon2, ImageSpan.ALIGN_BASELINE)
        val span3 = ImageSpan(icon3, ImageSpan.ALIGN_BASELINE)

        var myIndex = 1
        var qwe = 1
        while (qwe < textSpan.length) {
            myIndex = textSpan.indexOf("$", startIndex = myIndex)
            qwe++



           if (myIndex>1) textSpan.setSpan(span, myIndex, myIndex + 1, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

            //  textSpan.setSpan(span1, myIndex1, myIndex1 + 1, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
            //textSpan.setSpan(span2, myIndex2, myIndex2 + 1, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
            // textSpan.setSpan(span3, myIndex3, myIndex3 + 1, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
            myIndex ++
            view.text = textSpan

        }

    }

    fun replacesymbolsXBX(text: String, view: TextView, context: Context) {

        val textSpan = SpannableString(text)
        val myIndex = textSpan.indexOf("@")
        val myIndex1 = textSpan.indexOf("#")
        val myIndex2 = textSpan.indexOf("$")
        val myIndex3 = textSpan.indexOf("%")

        val icon = context.resources.getDrawable(R.drawable.h)
        val icon1 = context.resources.getDrawable(R.drawable.h)
        val icon2 = context.resources.getDrawable(R.drawable.h)
        val icon3 = context.resources.getDrawable(R.drawable.h)

        icon.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
        icon1.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
        icon2.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
        icon3.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)

        val span = ImageSpan(icon, ImageSpan.ALIGN_BASELINE)
        val span1 = ImageSpan(icon1, ImageSpan.ALIGN_BASELINE)
        val span2 = ImageSpan(icon2, ImageSpan.ALIGN_BASELINE)
        val span3 = ImageSpan(icon3, ImageSpan.ALIGN_BASELINE)

        if (myIndex > 0) textSpan.setSpan(span, myIndex, myIndex + 1, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        if (myIndex1 > 0) textSpan.setSpan(span1, myIndex1, myIndex1 + 1, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        if (myIndex2 > 0) textSpan.setSpan(span2, myIndex2, myIndex2 + 1, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        if (myIndex3 > 0) textSpan.setSpan(span3, myIndex3, myIndex3 + 1, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        view.text = textSpan
    }
}