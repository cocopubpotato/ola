package com.example.movil23492.persistencias

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

@Preview(showBackground = true)
@Composable
fun ProfileView(){
    var nombre by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf(0) }
    var haspet by remember { mutableStateOf(false) }

    val context= LocalContext.current
    val preferences= Preferencias(contexto = context)
    val corrutina= rememberCoroutineScope()

    var nombreGuardado=preferences.name.collectAsState("")
    var edadGuardado=preferences.age.collectAsState(0)
    var haspetGuardado=preferences.hasPet.collectAsState(false)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Mi Perfil")
        Text("Datos guardasdos hasta ahora son ${edadGuardado.value} -" +
                "${nombreGuardado.value} y ${haspetGuardado.value}")
        TextField(nombre, onValueChange = {nombre=it})
        TextField(edad.toString(), onValueChange = {
            if(it.isNotBlank()&&it.toIntOrNull() !=null){
            edad= it.toInt()}
        })
        Switch(haspet, onCheckedChange = {haspet=it})
        Button(onClick = {
            corrutina.launch{
            preferences.guardarDatosPersonales(edad=edad,
                nombre=nombre,haspet)
        }}) { Text("Guardar")}

    }
}