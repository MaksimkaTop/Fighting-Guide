package com.example.hp.fightingguide.stories

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.item_card_hero_list.view.*

class StoriesHolder(itemView: View) {
    val icon : ImageView = itemView.person_photo
    val name : TextView = itemView.person_name
    val story : TextView = itemView.tv_story

}