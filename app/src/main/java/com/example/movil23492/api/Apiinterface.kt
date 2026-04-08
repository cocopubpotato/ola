package com.example.movil23492.api

import retrofit2.Response
import retrofit2.http.GET

interface Apiinterface {
    @GET("breeds/image/random")
    suspend fun  imagenAleatoria(): Response<ImagenRandom>
}