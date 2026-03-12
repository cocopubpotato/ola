package com.example.movil23492.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
object Report
@Serializable
data class ReportModel(
    var  NombreSec : String, var NumdeSeccion: Int,var NombreEncargado: String)


@Preview(showBackground = true)
@Composable
fun NavManager(){
    val navController= rememberNavController()
    NavHost(navController, startDestination = Home){
        composable<Home>{
            HomeView(navegante = navController)
        }
        composable<Report>{
            ReportView(navegante = navController)
        }
        composable<ReportModel>{
            val datos: ReportModel = it.toRoute()
            PDFView(generarReporte = datos)
        }
    }
}