package com.example.movil23492.matematicas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier


@Composable

fun NumberTextFill(modificador: Modifier,fill:(String)-> Unit){
    var number by remember() {
        mutableStateOf("")
    }
    Column(modifier= Modifier.fillMaxWidth()) {
        Text("Ingresa un numero")
        TextField(value= number, onValueChange = { TextoEscrito ->
            if (TextoEscrito.toIntOrNull() != null){
                number = TextoEscrito.toInt().toString()
                fill(number)
            }})
    }
}

@Preview
@Composable
fun NumberTextFillPreview ()
{ var texto by remember { mutableStateOf("") }
    Column() {
        Text(texto)
        NumberTextFill(Modifier.fillMaxWidth()) {
            texto=it
        }
    }
}