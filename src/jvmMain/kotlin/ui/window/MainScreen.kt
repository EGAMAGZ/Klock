package ui.window

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import navigation.NavController
import ui.window.stopwatch.StopWatchScreen

@Composable
fun MainScreen(navController: NavController) {
    StopWatchScreen()
}