package com.example.hp.fightingguide.data

import java.io.Serializable

data class CombosData(
        val name : String = " ",
        val comboTitle: String = " ",
        val combo : String = " "
) : Serializable