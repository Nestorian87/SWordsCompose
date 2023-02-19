package com.nestor87.swords.presentation.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.nestor87.swords.R

private val calibri = FontFamily(
    Font(R.font.calibri, FontWeight.Normal)
)

private val centuryGothic = FontFamily(
    Font(R.font.century_gothic, FontWeight.Normal)
)

private val segoePrint = FontFamily(
    Font(R.font.segoe_print, FontWeight.Normal)
)

private val tahoma = FontFamily(
    Font(R.font.tahoma, FontWeight.Normal)
)

data class AppTypography(
    val word: TextStyle = TextStyle(
        fontFamily = centuryGothic,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    )
)

internal val LocalTypography = staticCompositionLocalOf { AppTypography() }