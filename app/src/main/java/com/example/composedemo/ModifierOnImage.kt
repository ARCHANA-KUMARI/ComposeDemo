package com.example.composedemo

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp

@Composable
fun ModifierOnImage() {
    Image(
        painter = androidx.compose.ui.res.painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "Image",
        modifier = androidx.compose.ui.Modifier
            .clickable(onClick = {
                Log.i("Archana", "ModifierOnImage: onClick called")
            })
            .background(androidx.compose.ui.graphics.Color.Yellow)
            .padding(16.dp)
            .size(200.dp)
            .border(1.dp, androidx.compose.ui.graphics.Color.Black)
            .clip(androidx.compose.foundation.shape.CircleShape)
            .background(androidx.compose.ui.graphics.Color.Green)

    )
}

@PreviewLightDark
@Preview(name = "Large font", fontScale = 1.5f, showBackground = true)
@Composable
private fun ModifierOnImagePreview() {
    MaterialTheme {
        Surface {
            ModifierOnImage()
        }
    }
}