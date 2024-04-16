package com.mygomii.hilt.example.domain.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: Int,
    val name: String,
    @SerialName("username")
    val userName: String,
    val email: String,
    val address: Address,
    val phone: String,
    val website: String,
    val company: Company,
)