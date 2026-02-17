package com.example.movil23492.lists

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movil23492.R

@Preview(showBackground = true)
@Composable

fun ProductPreview(){
    ProductView(imagen=R.drawable.sanic, nombreProducto = "Sonic", calificacion = 0.5f, precio = 15022, entrega = "domingo")
}

@Composable
fun ProductView(
    imagen: Int,nombreProducto: String,calificacion: Float,precio:Int,entrega: String
){
    //var imagen : Int= R.drawable.sanic
    //var nombreProducto: String="sonic"
    //var calificacion: Float=0.5f
    //var precio: Int= 14500
    //var entrega: String="sabado"

    Card(modifier = Modifier.fillMaxWidth().padding(10.dp), colors = CardDefaults.cardColors(containerColor = Color.White)) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(imagen),
                    contentDescription = "imagen de producto",
                    modifier = Modifier.size(120.dp).align(Alignment.CenterVertically)
                )
                Column(modifier = Modifier.padding(5.dp)) {
                    Spacer(modifier = Modifier.size(10.dp))
                    Text(nombreProducto, fontSize = 20.sp)
                    Text(text="$calificacion estrellas", fontSize = 17.sp)
                    Text(text="$ $precio", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                    Text("Llega el $entrega")
                    Spacer(modifier = Modifier.size(10.dp))
                    Button(onClick = {}, colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Yellow,
                        contentColor = Color.Black)) {Text("Agregar al carrito")
                    }
                    Spacer(modifier = Modifier.size(10.dp))

                }
            }
        }
    }

}