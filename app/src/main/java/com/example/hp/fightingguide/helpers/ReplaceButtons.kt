package com.example.hp.fightingguide.helpers

import android.content.Context
import android.text.SpannableStringBuilder
import android.text.style.ImageSpan
import android.widget.TextView
import com.example.hp.fightingguide.R

class ReplaceButtons {

    fun replaceSymbolsPS(text: String, view: TextView, context: Context) {

        val ssb = SpannableStringBuilder(text)

        val icon = context.resources.getDrawable(R.drawable.h)
        val icon1 = context.resources.getDrawable(R.drawable.h)
        val icon2 = context.resources.getDrawable(R.drawable.h)
        val icon3 = context.resources.getDrawable(R.drawable.h)

        icon.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
        icon1.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
        icon2.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
        icon3.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)

        var myIndex = 0
        var myIndex1 = 0
        var myIndex2 = 0
        var myIndex3 = 0
        var checker = 0
        while (checker <= ssb.length) {
            myIndex = ssb.indexOf("$", startIndex = myIndex)
            myIndex1 = ssb.indexOf("%", startIndex = myIndex1)
            myIndex2 = ssb.indexOf("@", startIndex = myIndex2)
            myIndex3 = ssb.indexOf("#", startIndex = myIndex3)

            val span = ImageSpan(icon, ImageSpan.ALIGN_BASELINE)
            val span1 = ImageSpan(icon1, ImageSpan.ALIGN_BASELINE)
            val span2 = ImageSpan(icon2, ImageSpan.ALIGN_BASELINE)
            val span3 = ImageSpan(icon3, ImageSpan.ALIGN_BASELINE)

            if (myIndex >= 0) ssb.setSpan(span, myIndex, myIndex + 1, 0)
            if (myIndex1 >= 0) ssb.setSpan(span1, myIndex1, myIndex1 + 1, 0)
            if (myIndex2 >= 0) ssb.setSpan(span2, myIndex2, myIndex2 + 1, 0)
            if (myIndex3 >= 0) ssb.setSpan(span3, myIndex3, myIndex3 + 1, 0)

            view.text = ssb
            checker++
            myIndex++
            myIndex1++
            myIndex2++
            myIndex3++
        }
    }

    fun replaceSymbolsXBX(text: String, view: TextView, context: Context) {

        val ssb = SpannableStringBuilder(text)

        val icon = context.resources.getDrawable(R.drawable.h)
        val icon1 = context.resources.getDrawable(R.drawable.h)
        val icon2 = context.resources.getDrawable(R.drawable.h)
        val icon3 = context.resources.getDrawable(R.drawable.h)

        icon.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
        icon1.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
        icon2.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
        icon3.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)

        var myIndex = 0
        var myIndex1 = 0
        var myIndex2 = 0
        var myIndex3 = 0
        var checker = 0
        while (checker <= ssb.length) {
            myIndex = ssb.indexOf("$", startIndex = myIndex)
            myIndex1 = ssb.indexOf("%", startIndex = myIndex1)
            myIndex2 = ssb.indexOf("@", startIndex = myIndex2)
            myIndex3 = ssb.indexOf("#", startIndex = myIndex3)

            val span = ImageSpan(icon, ImageSpan.ALIGN_BASELINE)
            val span1 = ImageSpan(icon1, ImageSpan.ALIGN_BASELINE)
            val span2 = ImageSpan(icon2, ImageSpan.ALIGN_BASELINE)
            val span3 = ImageSpan(icon3, ImageSpan.ALIGN_BASELINE)

            if (myIndex >= 0) ssb.setSpan(span, myIndex, myIndex + 1, 0)
            if (myIndex1 >= 0) ssb.setSpan(span1, myIndex1, myIndex1 + 1, 0)
            if (myIndex2 >= 0) ssb.setSpan(span2, myIndex2, myIndex2 + 1, 0)
            if (myIndex3 >= 0) ssb.setSpan(span3, myIndex3, myIndex3 + 1, 0)

            view.text = ssb
            checker++
            myIndex++
            myIndex1++
            myIndex2++
            myIndex3++
        }
    }
}