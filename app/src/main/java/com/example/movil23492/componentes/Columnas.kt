package com.example.movil23492.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Preview (showBackground = true)
@Composable
fun Columnas (){

    Column(
        verticalArrangement = Arrangement.Center,

        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
            .padding(end = 50.dp) ,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        Text("hola")
        Spacer(modifier = Modifier.height(30.dp))
        Text("adios")
        Spacer(modifier = Modifier.height(30.dp))
        Text("aiuda")

    }}
@Preview (showBackground = true)
@Composable
fun Separadores(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .border(2.dp,Color.Yellow)
            .background(Color.Red)

    ){
        Text("este es un mensaje",modifier= Modifier.fillMaxSize().weight(weight = .2f))
        Text("de emergencia",modifier= Modifier.fillMaxSize().weight(weight = .4f))
        HorizontalDivider(thickness = 20.dp, color = Color.Yellow)
        //VerticalDivider(thickness = 20.dp, color = Color.Black)
        Text("requerimos de tu ayuda para",modifier= Modifier.fillMaxSize().weight(weight = .2f))
        Text("reslipushnsdls..........................",modifier= Modifier.fillMaxSize().weight(weight = 1f))
        Text(text = "Holaaa    BuuuuEEEEnooooooss DIAS",
            modifier = Modifier
                .padding(all = 7.dp)
                .padding(vertical = 14.dp)
                .blur(0.8.dp)
                .shadow(elevation = 20.dp)
                .border(5.dp,Color.Blue)
                .background(Color.Yellow),
            color=Color.Black,
            fontSize = 25.sp
        )
    }
}