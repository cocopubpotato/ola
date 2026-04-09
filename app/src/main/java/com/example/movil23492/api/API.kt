package com.example.movil23492.api

import android.util.Log

class API {
    private val service=
        RetrofitHelper.getRetrofitService()

    suspend fun getImagenAleatoria(): String {
        val response =
            service.imagenAleatoria()
        response.body()?.status
        val msg: String

        if (response.body()?.status.equals("success")) {
            msg = response.body()?.message ?: " "
        } else {
            msg = "fail"
        }
        Log.d("API_PRUEBA","status es"+response.body()?.status)
        Log.d("API_PRUEBA","message es"+response.body()?.message)
        return msg
    }
}