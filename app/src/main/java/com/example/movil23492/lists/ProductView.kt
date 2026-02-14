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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movil23492.R

@Preview(showBackground = true)
@Composable

fun ProductView(){
    Card(modifier = Modifier.fillMaxWidth().padding()) {
    Column(modifier= Modifier.fillMaxWidth()
    ) {
        Row() {
            Image(painter = painterResource(R.drawable.boy), contentDescription = "imagen producto", modifier = Modifier.size(120.dp))


            Column() {
                Spacer(modifier= Modifier.size(5.dp))
                Text("Worst game you'll play in your life", fontSize = 42.sp)
                Text(".1 estrellas")
                Text("$600")
                Text("Exclusivo en japon", fontSize = 9.sp)
                Spacer(modifier= Modifier.size(5.dp))
                Button(onClick = {}, colors = ButtonDefaults.buttonColors(
                    containerColor= Color.Yellow, contentColor = Color.Black
                ) ){
                    Text("Agregar al carrito")
                }
            }
        }

    }
}
}