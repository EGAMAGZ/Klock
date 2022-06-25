package ui.window

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import navigation.AppNavigation
import ui.theme.KlockTheme

@Composable
fun KlockApp() {
    KlockTheme {
        Surface {
            AppNavigation()
        }
    }
}