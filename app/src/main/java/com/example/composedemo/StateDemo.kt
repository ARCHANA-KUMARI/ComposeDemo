package com.example.composedemo

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun NotificationScreen() {
    var count: MutableState<Int> =
        rememberSaveable { androidx.compose.runtime.mutableStateOf(0) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth(1f)
    ) {
        NotificationCounterScreen(count.value, { count.value++ })
        NotificationCard(
            "Message sent so far",
            onClick = { Log.d("StateDemo", "NotificationScreen: ImageTextCard clicked") }, count.value)

    }
}

@Composable
fun NotificationCounterScreen(value: Int, increament: () -> Int) {
    //  var count : MutableState<Int> = androidx.compose.runtime.remember { androidx.compose.runtime.mutableStateOf(0) }
    /* var count: MutableState<Int> =
         rememberSaveable { androidx.compose.runtime.mutableStateOf(0) }*/ // save data on configuration change also

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Notification Count: $value")
        Button(onClick = {
            increament()
        }) {
            Text(text = "Send Notification")
        }
    }
}

@Composable
fun NotificationCard(
    title: String,
    onClick: () -> Unit,
    count: Int
) {
    ElevatedCard(
        onClick = onClick,
        modifier = Modifier
            .wrapContentSize()
            .padding(8.dp),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 4.dp),
    ) {
        Row(

            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Image(
                painter = painterResource(R.drawable.heart),
                contentDescription = null, // decorative; set a real description if it conveys info
                modifier = Modifier
                    .size(46.dp)
                    .clip(RoundedCornerShape(8.dp)),
            )

            Text(
                text = "$title: $count",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(8.dp),
            )

        }
    }
}
