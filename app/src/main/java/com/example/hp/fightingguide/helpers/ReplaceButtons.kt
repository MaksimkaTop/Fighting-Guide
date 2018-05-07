package com.example.hp.fightingguide.helpers

import android.content.Context
import android.text.SpannableString
import android.text.style.ImageSpan
import com.example.hp.fightingguide.R
import io.reactivex.Single

class ReplaceButtons() {
    fun replaceSymbolsPS( text: String, context: Context): Single<SpannableString> {
        return Single.create {

            val icon = context.resources.getDrawable(R.drawable.ps_1)
            val icon1 = context.resources.getDrawable(R.drawable.ps_2)
            val icon2 = context.resources.getDrawable(R.drawable.ps_3)
            val icon3 = context.resources.getDrawable(R.drawable.ps_4)
            val icon4 = context.resources.getDrawable(R.drawable.ps3_r2)

            icon.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
            icon1.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
            icon2.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
            icon3.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
            icon4.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)

            var myIndex = 1
            var myIndex1 = 1
            var myIndex2 = 1
            var myIndex3 = 1
            var myIndex4 = 1

            val spanString = SpannableString(text.replace("/n", " "))
            spanString.forEach {
                myIndex = spanString.indexOf("@", startIndex = myIndex)
                myIndex1 = spanString.indexOf("#", startIndex = myIndex1)
                myIndex2 = spanString.indexOf("$", startIndex = myIndex2)
                myIndex3 = spanString.indexOf("%", startIndex = myIndex3)
                myIndex4 = spanString.indexOf("^", startIndex = myIndex4)

                val span = ImageSpan(icon, ImageSpan.ALIGN_BASELINE)

                val span1 = ImageSpan(icon1, ImageSpan.ALIGN_BASELINE)
                val span2 = ImageSpan(icon2, ImageSpan.ALIGN_BASELINE)
                val span3 = ImageSpan(icon3, ImageSpan.ALIGN_BASELINE)
                val span4 = ImageSpan(icon4, ImageSpan.ALIGN_BASELINE)

                if (myIndex > 0 && myIndex1 > 0 && myIndex2 > 0 && myIndex3 > 0 && myIndex4 > 0) {
                    spanString.setSpan(span, myIndex, myIndex + 1, 0)
                    spanString.setSpan(span1, myIndex1, myIndex1 + 1, 0)
                    spanString.setSpan(span2, myIndex2, myIndex2 + 1, 0)
                    spanString.setSpan(span3, myIndex3, myIndex3 + 1, 0)
                    spanString.setSpan(span4, myIndex4, myIndex4 + 1, 0)
                }
                myIndex++
                myIndex1++
                myIndex2++
                myIndex3++
                myIndex4++
            }
            it.onSuccess(spanString)
        }
    }


    fun replaceSymbolsXBX(text: String, context: Context): Single<SpannableString> {
        return Single.create {

            val icon = context.resources.getDrawable(R.drawable.xbox_1)
            val icon1 = context.resources.getDrawable(R.drawable.xbox_2)
            val icon2 = context.resources.getDrawable(R.drawable.xbox_3)
            val icon3 = context.resources.getDrawable(R.drawable.xbox_4)
            val icon4 = context.resources.getDrawable(R.drawable.xbox_rt)

            icon.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
            icon1.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
            icon2.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
            icon3.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)
            icon4.setBounds(0, 0, icon.intrinsicHeight, icon.intrinsicWidth)

            var myIndex = 1
            var myIndex1 = 1
            var myIndex2 = 1
            var myIndex3 = 1
            var myIndex4 = 1

            val spanString = SpannableString(text.replace("/n", " "))
            spanString.forEach {
                myIndex = spanString.indexOf("@", startIndex = myIndex)
                myIndex1 = spanString.indexOf("#", startIndex = myIndex1)
                myIndex2 = spanString.indexOf("$", startIndex = myIndex2)
                myIndex3 = spanString.indexOf("%", startIndex = myIndex3)
                myIndex4 = spanString.indexOf("^", startIndex = myIndex4)


                val span = ImageSpan(icon, ImageSpan.ALIGN_BASELINE)
                val span1 = ImageSpan(icon1, ImageSpan.ALIGN_BASELINE)
                val span2 = ImageSpan(icon2, ImageSpan.ALIGN_BASELINE)
                val span3 = ImageSpan(icon3, ImageSpan.ALIGN_BASELINE)
                val span4 = ImageSpan(icon4, ImageSpan.ALIGN_BASELINE)

                if (myIndex > 0 && myIndex1 > 0 && myIndex2 > 0 && myIndex3 > 0 && myIndex4 > 0) {
                    spanString.setSpan(span, myIndex, myIndex + 1, 0)
                    spanString.setSpan(span1, myIndex1, myIndex1 + 1, 0)
                    spanString.setSpan(span2, myIndex2, myIndex2 + 1, 0)
                    spanString.setSpan(span3, myIndex3, myIndex3 + 1, 0)
                    spanString.setSpan(span4, myIndex4, myIndex4 + 1, 0)
                }

                myIndex++
                myIndex1++
                myIndex2++
                myIndex3++
                myIndex4++
            }
            it.onSuccess(spanString)
        }
    }
}