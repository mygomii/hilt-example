package com.mygomii.hilt.example.data.repositories

import com.mygomii.hilt.example.domain.models.Post

interface PostRepository {
    suspend fun getPosts(): List<Post>
}