package navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import ui.window.MainScreen
import ui.window.SplashScreen

@Composable
fun AppNavigation() {
    val navController by rememberNavController(AppScreens.SplashScreen.route)

    NavigationHost(navController) {
        composable(AppScreens.SplashScreen.route) {
            SplashScreen(navController)
        }

        composable(AppScreens.MainScreen.route) {
            MainScreen(navController)
        }
    }.build()
}