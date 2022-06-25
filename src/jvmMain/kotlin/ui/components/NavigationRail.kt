package ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.NavigationRail
import androidx.compose.material.NavigationRailItem
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Alarm
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import navigation.AppScreens
import navigation.NavController

enum class TimeOptions(
    val label: String,
    val icon: ImageVector,
    val route: String
) {
    STOP_WATCH(
        label = "Stopwatch",
        icon = Icons.Outlined.Alarm,
        route = AppScreens.StopWatchScreen.route
    )
}

@Composable
fun NavigationRailTimeOptions(
    navController: NavController,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val options = TimeOptions.values()

    Row(modifier = modifier) {
        NavigationRail {
            options.forEach { option ->
                NavigationRailItem(
                    onClick = { navController.navigate(option.route) },
                    selected = true,
                    icon = {
                        Icon(
                            imageVector = option.icon,
                            contentDescription = "${option.label} Icon"
                        )
                    },
                    label = { Text(option.label) }
                )
            }
        }
        content()
    }
}