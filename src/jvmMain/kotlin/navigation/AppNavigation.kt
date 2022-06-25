package navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import ui.components.NavigationRailTimeOptions
import ui.window.MainScreen
import ui.window.SplashScreen
import ui.window.stopwatch.StopWatchScreen

@Composable
fun AppNavigation() {
    val navController by rememberNavController(AppScreens.SplashScreen.route)

    NavigationHost(navController) {
        composable(AppScreens.SplashScreen.route) {
            SplashScreen(navController)
        }

        composable(AppScreens.StopWatchScreen.route) {
            NavigationRailTimeOptions(navController){
                StopWatchScreen()
            }
        }
    }.build()
}