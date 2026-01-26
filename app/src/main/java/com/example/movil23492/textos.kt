package com.example.moviles

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun MyTextView(){
    val myFontColor=Color.Gray
    val fonts=50.sp
    Text(text = "Hola",
        color = myFontColor,
        fontSize = fonts,
        fontStyle = FontStyle.Italic,
        fontFamily = FontFamily.Cursive,
        letterSpacing = 20.sp,
        lineHeight = 77.sp,
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.Justify,
        maxLines = 6

    )
}