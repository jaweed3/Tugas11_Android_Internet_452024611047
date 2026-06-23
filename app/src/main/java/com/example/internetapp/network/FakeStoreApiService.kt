package com.example.internetapp.network

import com.example.internetapp.model.Product
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

interface FakeStoreApiService {

    @GET("products")
    suspend fun getProducts(): List<Product>

    companion object {
        const val BASE_URL = "https://fakestoreapi.com/"
    }
}

private val moshi = Moshi.Builder()
    .addLast(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(FakeStoreApiService.BASE_URL)
    .build()

object API {
    val retrofitService: FakeStoreApiService by lazy {
        retrofit.create(FakeStoreApiService::class.java)
    }
}
