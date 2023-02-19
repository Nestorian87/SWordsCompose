package com.nestor87.swords.presentation.theme


import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.*

internal val LocalColors = staticCompositionLocalOf { standardTheme() }

class AppColors(
    windowBackgroundColor: Color,
    buttonBackground: Color,
    pressedButtonBackground: Color,
    buttonText: Color,
    buttonBorder: Color,
    wordText: Color,
    secondaryText: Color,
    disabled: Color,
    hint: Color,
    redButton: Color,
    redButtonDisabled: Color,
    blueButton: Color,
    blueButtonDisabled: Color,
    yellowButton: Color,
    yellowButtonDisabled: Color
) {
    var windowBackgroundColor by mutableStateOf(windowBackgroundColor)
        private set
    var buttonBackground by mutableStateOf(buttonBackground)
        private set
    var pressedButtonBackground by mutableStateOf(pressedButtonBackground)
        private set
    var buttonText by mutableStateOf(buttonText)
        private set
    var buttonBorder by mutableStateOf(buttonBorder)
        private set
    var secondaryText by mutableStateOf(secondaryText)
        private set
    var wordText by mutableStateOf(wordText)
        private set
    var disabled by mutableStateOf(disabled)
        private set
    var hint by mutableStateOf(hint)
        private set
    var redButton by mutableStateOf(redButton)
        private set
    var redButtonDisabled by mutableStateOf(redButtonDisabled)
        private set
    var blueButton by mutableStateOf(blueButton)
        private set
    var blueButtonDisabled by mutableStateOf(blueButtonDisabled)
        private set
    var yellowButton by mutableStateOf(yellowButton)
        private set
    var yellowButtonDisabled by mutableStateOf(yellowButtonDisabled)
        private set

    fun copy(
        windowBackgroundColor: Color = this.windowBackgroundColor,
        buttonBackground: Color = this.buttonBackground,
        pressedButtonBackground: Color = this.pressedButtonBackground,
        buttonText: Color = this.buttonText,
        buttonBorder: Color = this.buttonBorder,
        wordText: Color = this.wordText,
        secondaryText: Color = this.secondaryText,
        disabled: Color = this.disabled,
        hint: Color = this.hint,
        redButton: Color = this.redButton,
        redButtonDisabled: Color = this.redButtonDisabled,
        blueButton: Color = this.blueButton,
        blueButtonDisabled: Color = this.blueButtonDisabled,
        yellowButton: Color = this.yellowButton,
        yellowButtonDisabled: Color = this.yellowButtonDisabled
    ): AppColors = AppColors(
        windowBackgroundColor,
        buttonBackground,
        pressedButtonBackground,
        buttonText,
        buttonBorder,
        wordText,
        secondaryText,
        disabled,
        hint,
        redButton,
        redButtonDisabled,
        blueButton,
        blueButtonDisabled,
        yellowButton,
        yellowButtonDisabled
    )

    // will be explained later
    fun updateColorsFrom(other: AppColors) {
        windowBackgroundColor = other.windowBackgroundColor
        buttonBackground = other.buttonBackground
        pressedButtonBackground = other.pressedButtonBackground
        buttonText = other.buttonText
        buttonBorder = other.buttonBorder
        wordText = other.wordText
        secondaryText = other.secondaryText
        disabled = other.disabled
        hint = other.hint
        redButton = other.redButton
        redButtonDisabled = other.redButtonDisabled
        blueButton = other.blueButton
        blueButtonDisabled = other.blueButtonDisabled
        yellowButton = other.yellowButton
        yellowButtonDisabled = other.yellowButtonDisabled
    }
}

fun standardTheme() = AppColors(
    windowBackgroundColor = Color(0xFFEEEEEE),
    buttonBackground = Color(0xEEEEEEEE),
    pressedButtonBackground = Color(0xFF808080),
    buttonText = Color(0xFF040607),
    buttonBorder = Color(0xFF000000),
    wordText = Color(0xFF000000),
    secondaryText = Color(0xFF040607),
    disabled = Color(0xFF808080),
    hint = Color(0xFF47D160),
    redButton = Color(0xFFDB356F),
    redButtonDisabled = Color(0xFF9C4E6C),
    blueButton = Color(0xFF4F6BDB),
    blueButtonDisabled = Color(0xFF444880),
    yellowButton = Color(0xFFD0DB56),
    yellowButtonDisabled = Color(0xFF959953)
)