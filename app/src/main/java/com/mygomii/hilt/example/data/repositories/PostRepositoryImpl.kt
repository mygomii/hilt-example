package com.mygomii.hilt.example.data.repositories

import com.mygomii.hilt.example.data.services.PostService
import com.mygomii.hilt.example.domain.models.Post
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(private val apiService: PostService) : PostRepository {
    override suspend fun getPosts(): Flow<List<Post>> {
        return apiService.getPosts()
    }
}