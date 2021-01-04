package com.kimdoori.data.source.entity

import com.fasterxml.jackson.annotation.JsonProperty

data class RepositoryResponse(
    @JsonProperty("id") val id: Int,
    @JsonProperty("name") val name: String,
    @JsonProperty("full_name") val fullName: String,
    @JsonProperty("description") val description: String,
    @JsonProperty("url") val url: String
)
