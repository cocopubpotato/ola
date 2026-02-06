package com.example.movil23492.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Preview(showBackground = true)
@Composable

fun Botones(){
    var activo by remember{
        mutableStateOf(false)
    }

    var texto by remember {
        mutableStateOf("peek")
    }

    fun cambiartexto(){
        if (activo){
            texto= "adios"
        }else{
            texto= "ola"
        }
        activo= !activo
    }

    Column(modifier=Modifier.fillMaxSize()){
        Text(text=texto)
        Button(onClick = {cambiartexto()}
            , colors = ButtonDefaults.buttonColors(contentColor = Color(0xFF5582EA), containerColor = Color(0xFF8132C2)))
        {
            Text("click me")
    }
    }
}