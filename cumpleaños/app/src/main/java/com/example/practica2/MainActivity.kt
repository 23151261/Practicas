package com.example.practica2

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practica2.ui.theme.Practica2Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica2Theme() {
                BirthdayGreetingWithImage(
                    message = getString(R.string.mensaje),
                    from = "Andrés",
                    image = R.drawable.felicidades
                )
            }
        }
    }
}
@Composable
fun BirthdayGreetingWithImage(message: String,
                              from: String, image: Int) {
    val image = painterResource(id = image)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.FillWidth
        )
        BirthdayGreetingWithText(message, from)
    }
}
@Composable
fun BirthdayGreetingWithText(message: String,from:String){
    Surface(color = Color. Magenta) {
        Column {
            Text(text = message,
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(10.dp)
            )
            Text(text = from,
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(10.dp)
            )
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practica2Theme() {
        Greeting("Android")
    }
}