package de.joyn.joyncompose.theme

import androidx.ui.graphics.Color
import de.joyn.joyncompose.parseColor

enum class Colors() {
    LIGHT_WHITE {
        override fun color() = "#40FFFFFF".parseColor()
    },
    ROSE() {
        override fun color() = "#e1787e".parseColor()
    };

    abstract fun color(): Color
}