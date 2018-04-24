package com.example.hp.fightingguide.data

import java.io.Serializable

data class StoriesData(
        val name: String? = "No Name" ,
        val story: String? = "No Story",
        val icon: String? = "",
        val combo: String? = "No Combo",
        val special: String? = "No Special"
) : Serializable
