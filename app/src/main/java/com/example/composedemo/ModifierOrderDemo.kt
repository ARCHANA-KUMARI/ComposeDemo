package com.example.composedemo

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.sp

@Composable
fun ModifierOrderDemo() {
    Text(
        text = "Hello Welcome to Modifier order",
        fontSize = 24.sp,
        color = androidx.compose.ui.graphics.Color.Red,
        textAlign = androidx.compose.ui.text.style.TextAlign.Center,
        modifier = androidx.compose.ui.Modifier
            .background(androidx.compose.ui.graphics.Color.Yellow)
            .padding(26.dp)
            .size(200.dp)
            .border(1.dp, androidx.compose.ui.graphics.Color.Black)
            .clip(RectangleShape)
            .background(androidx.compose.ui.graphics.Color.Green)
            .clickable(onClick = {
                Log.i("Archana", "ModifierOrderDemo: onClick called, ripple effect we can see only on green background, because last modifier is background color is green")
            })
    )
}

@PreviewLightDark
@Preview(name = "Large font", fontScale = 1.5f, showBackground = true)
@Composable
private fun ModifierOrderDemoPreview() {
    MaterialTheme {
        Surface {
            ModifierOrderDemo()
        }
    }
}