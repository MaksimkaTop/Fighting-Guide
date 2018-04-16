package com.example.hp.fightingguide.stories

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.stories_card_item.view.*

class StoriesHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val icon: ImageView = itemView.iv_stories_person_icon
    val name: TextView = itemView.tv_stories_person_name
    val story: TextView = itemView.tv_stories_story
    val cardV: CardView = itemView.cv_stories
}