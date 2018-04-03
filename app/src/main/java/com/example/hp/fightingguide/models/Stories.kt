package com.example.hp.fightingguide.models

import java.io.Serializable

data class Stories(
        val name: String = " ",
        val story: String = " ",
        val photo: String?
) : Serializable
