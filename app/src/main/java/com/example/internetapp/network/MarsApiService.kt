package com.example.internetapp.network

import com.example.internetapp.model.MarsProperty
import retrofit2.http.GET
import retrofit2.http.Query

interface MarsApiService {

    @GET("realestate")
    suspend fun getProperties(
        @Query("filter") filter: String? = null
    ): List<MarsProperty>

    companion object {
        const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com/"
    }
}
