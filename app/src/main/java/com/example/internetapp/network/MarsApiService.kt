package com.example.internetapp.network

import com.example.internetapp.model.Product
import retrofit2.http.GET

interface FakeStoreApiService {

    @GET("products")
    suspend fun getProducts(): List<Product>

    companion object {
        const val BASE_URL = "https://fakestoreapi.com/"
    }
}
