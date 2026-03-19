package com.example.movil23492.corrutinas

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@SuppressLint("ViewModelConstructorInComposable")
@Preview(showBackground = true)
@Composable
fun WinnerPreview(){
    Winnerview(StudentsViewModel())
}

@Composable
fun Winnerview(studentsVM: StudentsViewModel){

    var nombre by remember{ mutableStateOf("") }
    Column(modifier= Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Sorteo Alumnos")
        TextField(value = nombre, onValueChange = { nombre = it })
        Button(onClick = { studentsVM.getWinner() }) {
            Text("Comenzar")
        }
        CircularProgressIndicator(modifier = Modifier.size(64.dp))
        if (studentsVM.isLoading) {
            Text("Cargando porfavor espere ...")
        } else {
            Text("El ganador es ...${studentsVM.winner}")
        }
    }
}