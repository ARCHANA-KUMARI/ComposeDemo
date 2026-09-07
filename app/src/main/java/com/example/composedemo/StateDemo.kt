package com.example.composedemo

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun NotificationScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth(1f)
    ) {
        NotificationCounterScreen()

    }
}

@Composable
fun NotificationCounterScreen() {
    var count : MutableState<Int> = androidx.compose.runtime.remember { androidx.compose.runtime.mutableStateOf(0) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Notification Count: ${count.value}")
        Button(onClick = {
            count.value++
           Log.d("StateDemo", "NotificationCounterScreen: $count")
        }) {
            Text(text = "Send Notification")
        }
    }
}