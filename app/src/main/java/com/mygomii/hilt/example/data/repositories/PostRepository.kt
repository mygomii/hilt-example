package com.mygomii.hilt.example.data.repositories

import com.mygomii.hilt.example.domain.models.Post
import kotlinx.coroutines.flow.Flow

interface PostRepository {
    suspend fun getPosts(): Flow<List<Post>>
}