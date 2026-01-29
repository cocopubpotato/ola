package com.example.movil23492.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable

fun Cajas(){
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
    Box(Modifier.size(300.dp)){
        Text("A",
            Modifier.background(color=Color.Blue).align(Alignment.TopStart),color=Color.White,fontSize = 45.sp)
        Text("B",
            Modifier.background(color=Color.Red).align(Alignment.TopCenter),fontSize = 45.sp,color=Color.White)
        Text("C",
            Modifier.background(color=Color.Yellow).align(Alignment.TopEnd),fontSize = 45.sp,color=Color.White)
        Text("D",
            Modifier.background(color=Color.Green).align(Alignment.CenterStart),fontSize = 45.sp,color=Color.White)
        Text("E",
            Modifier.background(color=Color.Gray).align(Alignment.Center),fontSize = 45.sp,color=Color.White)
        Text("F",
            Modifier.background(color=Color.DarkGray).align(Alignment.CenterEnd),fontSize = 45.sp,color=Color.White)
        Text("G",
            Modifier.background(color=Color.Cyan).align(Alignment.BottomStart),fontSize = 45.sp,color=Color.White)
        Text("H",
            Modifier.background(color=Color.LightGray).align(Alignment.BottomCenter),fontSize = 45.sp,color=Color.White)
        Text("I",
            Modifier.background(color=Color.Magenta).align(Alignment.BottomEnd),fontSize = 45.sp,color=Color.White)
    }
}
}
/*

fun caja2(){
    Box(Modifier.fillMaxSize()){
        Cajadentro(alineacion = Alignment.TopStart)
        Cajadentro(alineacion = Alignment.BottomEnd)
    }
}
@Composable
fun Cajadentro(alineacion= Alignment){
    Box(modifier= Modifier.fillMaxSize(), contentAlignment = alineacion){
        Box(modifier = Modifier.size(300.dp)){

        }
    }
}*/