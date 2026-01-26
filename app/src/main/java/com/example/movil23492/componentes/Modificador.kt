package com.example.movil23492.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//colores
val bg1= Color(color = 0xFFEC6920)


@Preview(showBackground = true)
@Composable
fun Modificador (){
    Text(text = "Holaaa    BuuuuEEEEnooooooss DIAS",
        modifier = Modifier
            .fillMaxHeight()
            //.background(Color(bg1))
            //.background(Color.Gray)
            .padding(all = 7.dp)
            .padding(vertical = 14.dp)
            //.alpha(alpha = 0.5f)
            //.blur(0.8.dp)
            .shadow(elevation = 20.dp)
            //.rotate(degrees = -30f)
            .border(5.dp,Color.Blue)
            .background(Color.Yellow),
        color=Color.Black,
        fontSize = 25.sp
    )
}