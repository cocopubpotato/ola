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
    suspend fun getListImages(raza: String):List<String>{
        val response= service.listaImagenesDePerrosPorRaza(raza)
        if(response.body()?.status.equals("success")){
        if (response.body()?.message !=null)
            for (url in response.body()?.message!!){
                Log.d("INFORMACION","url actual es $url")
            }
            return response.body()?.message?: emptyList()
        }else{return emptyList()}
    }
}