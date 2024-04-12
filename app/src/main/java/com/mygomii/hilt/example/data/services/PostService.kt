package com.mygomii.hilt.example.data.services

import com.mygomii.hilt.example.domain.models.Post
import kotlinx.coroutines.flow.Flow

interface PostService {
    suspend fun getPosts(): Flow<List<Post>>
}