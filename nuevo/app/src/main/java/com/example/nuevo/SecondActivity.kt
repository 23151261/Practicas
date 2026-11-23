package com.example.nuevo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.nuevo.ui.theme.NuevoTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NuevoTheme {
                SecondScreen()
            }
        }
    }
}

@Composable
fun SecondScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Image(
            painter = painterResource(id = R.drawable.teto),
            contentDescription = "Ilustración de teto",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .height(400.dp)
        )
    }
}