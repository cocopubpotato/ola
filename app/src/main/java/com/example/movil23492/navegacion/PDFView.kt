package com.example.movil23492.navegacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun PDFView(generarReporte: ReportModel= ReportModel(NumdeSeccion = 1, NombreSec = "pan", NombreEncargado = "panchito juanito")){
    Column(modifier= Modifier.fillMaxSize()) {
        Text("Modelo Recibido: ")
        Text("Nombre de Seccion: ${generarReporte.NombreSec}")
        Text("Numero de Seccion: ${generarReporte.NumdeSeccion}")
        Text("Nombre del Encargado: ${generarReporte.NombreEncargado}")
    }
}


//@Preview(showBackground = true)
@Composable
fun PDFPreview(){
    val reporte= ReportModel(NumdeSeccion = 1, NombreSec = "pan", NombreEncargado = "panchito juanito")
    PDFView(generarReporte = reporte)
}