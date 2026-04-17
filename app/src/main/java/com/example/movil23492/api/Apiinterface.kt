package com.example.movil23492.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface Apiinterface {
    @GET("breeds/image/random")
    suspend fun  imagenAleatoria(): Response<ImagenRandom>
    @GET("")
    suspend fun  listaImagenesDePerrosPorRaza(
        @Path("raza") raza: String):
            Response<ImagenesRaza>

}