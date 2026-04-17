package com.example.movil23492.api

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage

//@Preview(showBackground = true)
@Composable
fun DogView(dogViewModel: DogViewModel){
    Column(Modifier.fillMaxSize()){
        Text("El cachorro de hoy es:")
        Button(onClick = {dogViewModel.traerURLImagen()}){
            Text("Mostrear Imagen")
        }
        if (dogViewModel.url.isNotBlank()){
            AsyncImage(
                model = dogViewModel.url,
                contentDescription = null,
            )
        }


    }
}