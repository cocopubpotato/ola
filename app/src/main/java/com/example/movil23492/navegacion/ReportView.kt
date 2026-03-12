package com.example.movil23492.navegacion

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun ReportView(navegante: NavHostController){
    var NombreSec by remember {mutableStateOf("NombreSec") }
    var NumdeSeccion by remember {mutableStateOf("NumdeSeccion") }
    var NombreEncargado by remember {mutableStateOf("NombreEncargado") }

    Column(modifier= Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Reporte de ventas")
        Button(onClick = {
            navegante.popBackStack()
        }) {
            Text("Regresar")
        }
        TextField(value =NombreSec,onValueChange = {NombreSec=it}, label= {Text(text="Nombre de la seccion")})
        TextField(value=NumdeSeccion, onValueChange = {NumdeSeccion=it}, label= {Text(text="Numero de la seccion")})
        TextField(value=NombreEncargado, onValueChange = {NombreEncargado = it}, label= {Text(text="Nombre de encargado")})
        Button(onClick = {
            navegante.navigate(ReportModel(NombreSec = NombreSec, NumdeSeccion = NumdeSeccion.toInt(), NombreEncargado = NombreEncargado))
        }) {Text("Enviar datos") }
    }
}