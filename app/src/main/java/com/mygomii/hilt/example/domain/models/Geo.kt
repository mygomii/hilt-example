package com.mygomii.hilt.example.domain.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Geo(
    @SerialName("lat")
    val latitude: String,
    @SerialName("lng")
    val longitude: String
)