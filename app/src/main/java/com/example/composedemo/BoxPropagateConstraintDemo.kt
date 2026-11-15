package com.example.composedemo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp

@PreviewLightDark
@Preview(name = "Large font", fontScale = 1.5f, showBackground = true)
@Composable
private fun BoxPropagateConstraintsPreview() {
    MaterialTheme {
        Surface {
            BoxPropagateConstraints()
        }
    }
}

@Composable
fun BoxPropagateConstraints() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.LightGray),
        propagateMinConstraints = true, contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello",
            modifier = Modifier.background(Color.Red)
        )
    }
}