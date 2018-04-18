package com.example.hp.fightingguide.stories

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.Base64
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.hp.fightingguide.R
import com.example.hp.fightingguide.combo.CombosActivity
import com.example.hp.fightingguide.data.StoriesData


class StoriesRecyclerAdapter(val data: ArrayList<StoriesData>, context: Context) : RecyclerView.Adapter<StoriesHolder>() {
    private val mInflater: LayoutInflater = LayoutInflater.from(context)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesHolder =
            StoriesHolder(LayoutInflater.from(parent.context).inflate(R.layout.stories_card_item, parent, false))

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: StoriesHolder, position: Int) {
        holder.name.text = data[position].name
        holder.story.text = data[position].story
        val imageByteArray = Base64.decode(data[position].icon, Base64.DEFAULT)
        Glide
                .with(holder.icon.context)
                .load(imageByteArray)
                .apply(RequestOptions.circleCropTransform())
                .into(holder.icon)


        holder.cardV.setOnClickListener {
            val intent = Intent(mInflater.context, CombosActivity::class.java)
            intent.putExtra(holder.icon.context.getString(R.string.name), data[position].name)
            intent.putExtra(holder.icon.context.getString(R.string.icon), data[position].icon)
            intent.putExtra("combo", data[position].combo)
            intent.putExtra("special", data[position].special)
            mInflater.context.startActivity(intent)

        }
    }


}