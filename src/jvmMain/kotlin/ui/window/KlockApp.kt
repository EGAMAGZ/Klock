package ui.window

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.*
import navigation.AppNavigation
import ui.theme.KlockTheme

@Composable
fun KlockApp() {
    KlockTheme {
        AppNavigation()
    }
}