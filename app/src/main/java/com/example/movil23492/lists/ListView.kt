
package com.example.movil23492.lists

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Preview(showBackground = true)
@Composable

fun ListView(){
    val productVM =ProductViewModel ( )
    var estado by remember {
        mutableIntStateOf(0)
    }
    fun cambioColor(): Color{
        return if(estado ==0) Color.Black else Color.Blue
    }

    Column(modifier= Modifier.fillMaxSize()){
        LazyColumn(modifier= Modifier.background(color= cambioColor()).padding(20.dp)

        ) {
            item { Text("hola") }
            items(productVM.getProducts()){ producto ->
                ProductView(
                    producto, selected={
                    Log.d("EVENTO","provando el evento del producto..")
                })
            }
            item { Text("adios") }
        }

    }
}
