package com.typ.todo

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val lightRedColor = Color(color = 0xFFF57D88)
val darkRedColor = Color(color = 0xFF77000B)

internal val LightColorScheme = lightColorScheme(
    primary = lightRedColor,
    onPrimary = darkRedColor,
    primaryContainer = lightRedColor,
    onPrimaryContainer = darkRedColor
)
internal val DarkColorScheme = darkColorScheme(
    primary = lightRedColor,
    onPrimary = darkRedColor,
    primaryContainer = lightRedColor,
    onPrimaryContainer = darkRedColor
)
@Composable
fun Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (!darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colors,
        content = content,
    )
}