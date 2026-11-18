package com.example.composedemo

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyLazyColumn() {

    LazyColumn {
        items(100) { index ->
            Text(
                text = "Item $index",
                modifier = Modifier.padding(16.dp),
                fontSize = 20.sp
            )
        }
        item {
            Text(text = "First item")
        }

        items(5) { index ->
            Text(text = "Item: $index")
        }

    }
}

@PreviewLightDark
@Preview(name = "Large font", fontScale = 1.5f, showBackground = true)
@Composable
private fun MyLazyColumnPreview() {
    MaterialTheme {
        Surface {
            MyLazyColumn()
        }
    }
}