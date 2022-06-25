package ui.window.stopwatch

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StopWatchScreen(modifier: Modifier = Modifier) {
    val stopwatch = remember { StopWatch() }
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
    ) {
        StopWatchDisplay(
            formattedTime = stopwatch.formattedTime,
            onStartClick = stopwatch::start,
            onPauseClick = stopwatch::pause,
            onResetClick = stopwatch::reset
        )
    }
}

@Composable
private fun StopWatchDisplay(
    formattedTime: String,
    onStartClick: () -> Unit,
    onPauseClick: () -> Unit,
    onResetClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = formattedTime,
            style = MaterialTheme.typography.h2
        )
        Spacer(Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(onStartClick) {
                Text("Start")
            }
            Spacer(Modifier.width(16.dp))
            Button(onPauseClick) {
                Text("Pause")
            }
            Spacer(Modifier.width(16.dp))
            Button(onResetClick) {
                Text("Reset")
            }
        }
    }
}