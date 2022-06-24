package ui.window

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.*
import ui.theme.KlockTheme

@Composable
@Preview
fun KlockApp() {
    var text by remember { mutableStateOf("Hello, World!") }

    KlockTheme {
        SplashScreen()
    }
}