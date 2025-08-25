package com.example.projetokotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.projetokotlin.ui.theme.ProjetoKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjetoKotlinTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
//    Text(
//        text = "Hello!",
//    )
//    Column {
//        Text("Construindo o primeiro app");
//        Text("Esse é meu app!!");
//    }
    Row {
        Text("Construindo o primeiro app");
        Text("Esse é meu app!!");
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjetoKotlinTheme {
        Greeting()
    }
}