package com.mygomii.hilt.example.data.services

import com.mygomii.hilt.example.domain.models.Post
import retrofit2.http.GET

interface PostService {
    @GET("/posts")
    suspend fun getPosts(): List<Post>
}