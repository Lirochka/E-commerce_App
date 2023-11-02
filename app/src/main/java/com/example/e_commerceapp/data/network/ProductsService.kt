package com.example.e_commerceapp.data.network

import com.example.e_commerceapp.data.model.NetworkProduct
import com.example.e_commerceapp.domain.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface ProductsService{
    @GET("products")
    suspend fun getAllProducts(): Response<List<NetworkProduct>>
}