package com.mygomii.hilt.example.data.services

import com.mygomii.hilt.example.domain.models.Post

interface PostService {
    //    @GET("/posts")
    suspend fun getPosts(): List<Post>
}