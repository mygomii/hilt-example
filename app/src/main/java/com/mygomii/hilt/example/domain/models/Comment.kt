package com.mygomii.hilt.example.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class Comment(
    val postId: Int,
    val id: Int,
    val name: String,
    val email: String,
    val body: String
)