package com.example.meditationapp

import com.example.meditationapp.ui.HomeScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.meditationapp.ui.theme.MeditationAppTheme

class MainActivity: ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationAppTheme {
                HomeScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun show() {
    Column() {
        Text("Teaching Nitin Sharma in Hostel Park")
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Click Me")
        }
        HomeScreen()
    }
}