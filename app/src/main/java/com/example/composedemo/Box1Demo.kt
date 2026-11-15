package com.example.composedemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SpeedWidget(
    speed: Int
) {

    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.Black),
        contentAlignment = Alignment.Center

    ) {

        Image(
            painter = painterResource(
                R.drawable.speedometer
            ),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )

        Text(
            text = "$speed km/h",
            color = Color.White,
            fontSize = 28.sp,
            modifier = Modifier.align(
                Alignment.Center
            )
        )
    }
}

@PreviewLightDark
@Preview(name = "Large font", fontScale = 1.5f, showBackground = true)
@Composable
private fun SpeedWidgetPreview() {
    MaterialTheme {
        Surface {
            SpeedWidget(10)
        }
    }
}

