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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projetokotlin.ui.theme.ProjetoKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjetoKotlinTheme {
                //Greeting()
                App()
            }
        }
    }
}

@Composable
fun App(){
    var peso by remember { mutableStateOf(TextFieldValue("")) }
    var altura by remember { mutableStateOf(TextFieldValue("")) }
    var resultado by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Calcula o seu IMC", style = MaterialTheme.typography.headlineMedium)
        //input do peso
        OutlinedTextField(
            value = peso,
            onValueChange = {peso = it},
            label =  { Text("Digite o seu peso em kg") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

        )
        //input da altura
        OutlinedTextField(
            value = altura,
            onValueChange = {altura = it},
            label =  { Text("Digite a sua altura em cm") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjetoKotlinTheme {
        App()
    }
}

//@SuppressLint("RememberReturnType")
//@Composable
//fun Greeting() {
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
//    var contador by remember { mutableStateOf(0) }
//
//    Column (modifier = Modifier.fillMaxSize().padding(16.dp), ){
//        Text("contador : ${contador}")
//        Button(onClick = {contador++}){
//            Text("+")
//        }
//    }
//}
