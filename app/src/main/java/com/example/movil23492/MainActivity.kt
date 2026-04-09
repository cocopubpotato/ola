package com.example.movil23492

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.movil23492.api.DogView
import com.example.movil23492.api.DogViewModel
import com.example.movil23492.corrutinas.StudentsViewModel
import com.example.movil23492.corrutinas.Winnerview
import com.example.movil23492.lists.ListView
import com.example.movil23492.navegacion.NavManager
import com.example.movil23492.ui.theme.Movil23492Theme
import com.example.moviles.MyTextView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Movil23492Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val dogViewModel = DogViewModel()
                    DogView(dogViewModel)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Movil23492Theme {
        Greeting("Android")
    }
}