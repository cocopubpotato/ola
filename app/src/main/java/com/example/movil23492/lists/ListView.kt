package com.example.movil23492.lists

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.movil23492.R

@Preview(showBackground = true)
@Composable

fun ListView(){
    Column(modifier= Modifier.fillMaxSize().verticalScroll(state = rememberScrollState())){
        ProductView(imagen=R.drawable.sanic, nombreProducto = "Sonic", calificacion = 8.5f, precio = 22, entrega = "Martes")
        ProductView(imagen=R.drawable.boy, nombreProducto = "FE", calificacion = 0.5f, precio = 1, entrega = "domingo")
        ProductView(imagen=R.drawable.jazzzzz, nombreProducto = "figura convertible", calificacion = 9.5f, precio = 150, entrega = "Lunes")
        ProductView(imagen=R.drawable.sanic, nombreProducto = "Sonic", calificacion = 0.5f, precio = 15022, entrega = "domingo")
        ProductView(imagen=R.drawable.sanic, nombreProducto = "Sonic", calificacion = 8.5f, precio = 22, entrega = "Martes")
        ProductView(imagen=R.drawable.boy, nombreProducto = "FE", calificacion = 0.5f, precio = 1, entrega = "domingo")
        ProductView(imagen=R.drawable.jazzzzz, nombreProducto = "figura convertible", calificacion = 9.5f, precio = 150, entrega = "Lunes")
        ProductView(imagen=R.drawable.sanic, nombreProducto = "Sonic", calificacion = 0.5f, precio = 15022, entrega = "domingo")


    }
}
