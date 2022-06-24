package ui.components

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import ui.theme.KlockTheme

@Composable
fun SimpleCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    ) {
        Column(
            modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Hello Word!")
            Text(
                text = "Simple test of compose",
                style = MaterialTheme.typography.caption.copy(
                    fontWeight = FontWeight.Thin
                )
            )
        }
    }
}

@Composable
@Preview
fun SimpleCardPreview() {
    KlockTheme {
        SimpleCard()
    }
}