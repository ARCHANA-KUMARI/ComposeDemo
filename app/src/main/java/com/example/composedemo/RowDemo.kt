package com.example.composedemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.sp

@Composable
fun RowLyt() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
    ) {
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }
}

@PreviewLightDark
@Preview(name = "Large font", fontScale = 1.5f, showBackground = true)
@Composable
private fun RowLytPreview() {
    MaterialTheme {
        Surface {
            RowLyt()
        }
    }
}