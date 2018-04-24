package com.example.hp.fightingguide.helpers

import android.support.design.widget.Snackbar
import android.view.View

class MessageShow {
    fun showSnackbar(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()

    }
}