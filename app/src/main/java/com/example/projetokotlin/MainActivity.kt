package com.example.projetokotlin

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

@SuppressLint("RememberReturnType")
@Composable
fun Greeting() {
//    Text(
//        text = "Hello!",
//    )
//    Column (modifier = Modifier.
//    fillMaxSize(). // identificar o tamanho da tela
//    padding(16.dp), // colocar uma borda
//        verticalArrangement = Arrangement.Center,// alinhar vertical
//        horizontalAlignment = Alignment.CenterHorizontally //alinha horizontal
//    )
//    {
//        Text("Construindo o primeiro app");
//        Text("Esse é meu app!!");
//    }
//    Row {
//        Text("Construindo o primeiro app");
//        Text(" Esse é meu app!!");
//    }

    var contador = remember { mutableStateOf(0) }

    Column (modifier = Modifier.fillMaxSize().padding(16.dp), ){
        Text("contador : ${contador.value}")
        Button(onClick = {contador.value++}){
            Text("+")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjetoKotlinTheme {
        Greeting()
    }
}