package com.example.a30daysofdailyquotes.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    background = Color(0xFFFDFDFD),
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.Black,
    onSurface = Color.Black,
)

@Composable
fun DailyQuotesTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
      //  typography = Typography,
        shapes = Shapes,
        content = content
    )
}
