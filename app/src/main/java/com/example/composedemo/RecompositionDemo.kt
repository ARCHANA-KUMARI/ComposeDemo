package com.example.composedemo

import android.util.Log
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark

@Composable
fun RecompositionDemo() {
    // This function is intentionally left empty to demonstrate recomposition in Jetpack Compose.
    val state = remember { mutableStateOf(0) }
    Log.d("ARC", "recompositionDemo: initial composition with state value: ${state.value}")

    androidx.compose.material3.Button(onClick = {
        state.value++
        Log.d("ARC", "recompositionDemo: button clicked, state value: ${state.value}")

    }) {
        Text(text = "State: ${state.value}")
    }
}

@PreviewLightDark
@Preview(name = "Large font", fontScale = 1.5f, showBackground = true)
@Composable
private fun RecompositionDemoPreview() {
    MaterialTheme {
        Surface {
            RecompositionDemo()
        }
    }
}