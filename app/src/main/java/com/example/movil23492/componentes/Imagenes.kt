package com.example.movil23492.componentes

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.movil23492.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable

fun Imagenes(){
    Column(modifier = Modifier.fillMaxSize()){
        Image(painter= painterResource(R.drawable.sanic),
            contentDescription= "sonic deprimido",
            modifier= Modifier.size(600.dp).clip(CircleShape),
            contentScale = ContentScale.FillHeight
        )
        Icon(painter= painterResource(R.drawable.baseline_bedtime_24),
            contentDescription = null,
            tint= Color(0xFF535356)
        )
        Icon(imageVector = Icons.Filled.Favorite,
            contentDescription = null,
            modifier = Modifier.size(200.dp))
    }
}