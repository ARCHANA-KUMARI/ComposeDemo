package com.example.composedemo

import android.util.Log
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark

@Composable
fun MyTextField() {

    val  name = remember {
        mutableStateOf("")
    }

    TextField(
        value = name.value,
        onValueChange = {
            Log.i("MyTextField", "MyTextField: $it")
            name.value = it
        },
        label = {
            Text("Enter your name")
        }
    )
}

@PreviewLightDark
@Preview(name = "Large font", fontScale = 1.5f, showBackground = true)
@Composable
private fun MyTextFieldPreview() {
    MaterialTheme {
        Surface {
            MyTextField()
        }
    }
}