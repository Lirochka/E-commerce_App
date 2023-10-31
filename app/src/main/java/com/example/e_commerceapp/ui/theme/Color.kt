package com.example.e_commerceapp.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val Card300 = Color(0xFFa16296)
val Card500 = Color(0xFF831f76)
val Card900 = Color(0xFF430355)

val Colors.backgroundColor
    get() = if (isLight) Card900 else Color.Black

val Colors.text
    get() = if (isLight) Card500 else Color.Black

val Colors.textName
    get() = if (isLight) Card900 else Color.Black