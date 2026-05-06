package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android Archana",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold, color = Color.Red, fontSize = 36.sp, textAlign = TextAlign.Right
    )
}

@Preview(showBackground = true, name = "Preview  1" )
@Composable
fun GreetingPreview() {
    ComposeDemoTheme {
        Greeting("Android Archana..Preview 1......")
    }
}

@Preview(showBackground = true, name = "Preview 2" , widthDp = 300, heightDp = 500 )
@Composable
fun GreetingPreview2() {
    ComposeDemoTheme {
        Greeting("Android Archana. Preview 2.......")
    }
}


@Preview(showBackground = true, name = "Preview 3" , widthDp = 500, heightDp = 500 )
@Composable
fun GreetingPreview3() {
    Image(painter = painterResource(R.drawable.ic_launcher_background), "preview 3 background image", colorFilter = ColorFilter.tint(Color.Red) )
}

@Preview(showBackground = true, name = "Preview 4", widthDp = 500, heightDp = 500)
@Composable
fun GreetingPreview4() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.CenterStart
    ) {
        Button(onClick = {}) { Text("Button text") }
        Image(
            painter = painterResource(R.drawable.leftarrow),
            contentDescription = "back button",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(24.dp).align(Alignment.CenterEnd),
            )
    }
}