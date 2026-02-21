package com.example.movil23492.lists

import com.example.movil23492.R

class ProductViewModel {
    fun getProducts():List<ProductModel>{
            var productList=mutableListOf<ProductModel>()

            productList.add(ProductModel(imagen=R.drawable.sanic, nombre = "Sonic", calif = 0.5f, precio = 15022, entrega = "domingo"))
            productList.add(ProductModel(imagen=R.drawable.jazzzzz, nombre = "Jazz", calif = 5.5f, precio = 152, entrega = "sabado"))
            productList.add(ProductModel(imagen=R.drawable.sanic, nombre = "Sonic", calif = 0.5f, precio = 15022, entrega = "domingo"))
            productList.add(ProductModel(imagen=R.drawable.jazzzzz, nombre = "Jazz", calif = 5.5f, precio = 152, entrega = "sabado"))
        return productList
    }
}