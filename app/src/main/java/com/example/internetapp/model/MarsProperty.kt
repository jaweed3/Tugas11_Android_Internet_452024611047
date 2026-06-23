package com.example.internetapp.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Product(
    val id: Long,
    val title: String,
    val price: Double,
    val description: String,
    val category: String,
    val image: String,
    val rating: Rating
) {
    fun formattedPrice(): String = "$${String.format("%.2f", price)}"
}

@JsonClass(generateAdapter = true)
data class Rating(
    val rate: Double,
    val count: Int
)
