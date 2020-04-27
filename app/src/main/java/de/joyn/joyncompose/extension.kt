package de.joyn.joyncompose

import androidx.ui.graphics.Color

fun String.parseColor() =
    Color(android.graphics.Color.parseColor(this))

