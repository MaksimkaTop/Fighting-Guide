package com.example.hp.fightingguide.data

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.io.Serializable
@Entity
data class Stories(
        @PrimaryKey val name: String = " ",
        val story: String = " ",
        val icon: String?
) : Serializable
