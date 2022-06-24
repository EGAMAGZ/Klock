package ui.window

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import navigation.AppScreens
import navigation.NavController

@Composable
fun SplashScreen(navController: NavController) {
    var startAnimation by remember { mutableStateOf(false) }
    val alphaAnimation = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 1000,
        )
    )

    LaunchedEffect(key1 = true){
        startAnimation = true
        delay(2000)
        navController.navigate(AppScreens.MainScreen.route)
    }

    SplashContent(alpha = alphaAnimation.value)
}

@Composable
fun SplashContent(alpha: Float) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier.size(120.dp)
                .alpha(alpha),
            imageVector = Icons.Filled.Alarm,
            contentDescription = "Splash screen Icon"
        )
    }
}

@Composable
@Preview
fun SplashPreview() {
    SplashContent(alpha = 1f)
}