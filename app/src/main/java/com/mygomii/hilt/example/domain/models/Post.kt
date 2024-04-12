package com.mygomii.hilt.example.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class Post(
    var userId: Int,
    var id: Int,
    var title: String,
    var body: String
)