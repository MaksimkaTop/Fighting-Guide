package com.example.hp.fightingguide.stories

import android.support.v7.widget.RecyclerView
import android.util.Base64
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.hp.fightingguide.R
import com.example.hp.fightingguide.data.Stories

class StoriesRecyclerAdapter(val data: ArrayList<Stories?>) : RecyclerView.Adapter<StoriesHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesHolder =
            StoriesHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_card_hero_list, parent, false))


    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: StoriesHolder, position: Int) {
        holder.name.text = data[position]?.name
        holder.story.text = data[position]?.story
        val imageByteArray = Base64.decode(data[position]?.icon, Base64.DEFAULT)
        Glide
                .with(holder.icon.context)
                .load(imageByteArray)
                .into(holder.icon)
        Log.wtf("recuycler",data[position]?.name)
        Log.wtf("recuycler",data[position]?.story)
    }

}