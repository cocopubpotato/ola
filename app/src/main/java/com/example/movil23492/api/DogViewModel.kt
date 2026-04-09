package com.example.movil23492.api

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DogViewModel: ViewModel() {
    var url by mutableStateOf("")
        private set

    fun traerURLImagen(){
        val api = API()
        viewModelScope.launch{
            withContext(Dispatchers.IO){
                url = api.getImagenAleatoria()
            }
        }
    }
}