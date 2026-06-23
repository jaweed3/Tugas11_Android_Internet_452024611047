package com.example.internetapp.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MarsProperty(
    val id: String,
    val type: String,
    val price: Double,
    @Json(name = "img_src") val imgSrcUrl: String
) {
    fun formattedPrice(): String = "Rp ${String.format("%,.0f", price)}"
    fun displayType(): String = if (type == "rent") "For Rent" else "For Sale"
}
