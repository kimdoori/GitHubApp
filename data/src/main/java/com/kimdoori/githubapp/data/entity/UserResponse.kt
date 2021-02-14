package com.kimdoori.githubapp.data.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserResponse(
    @Json(name = "id") val id: Int,
    @Json(name = "login") val login: String,
)
