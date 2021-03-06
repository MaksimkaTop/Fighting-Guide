package com.example.hp.fightingguide.data

import java.io.Serializable

data class StoriesData(
        val name: String,
        val story: String,
        val icon: String,
        val combo: String,
        val special: String
) : Serializable
