package com.mygomii.hilt.example.data.repositories

import com.mygomii.hilt.example.data.services.PostService
import com.mygomii.hilt.example.domain.models.Post
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(private val apiService: PostService) : PostRepository {
    override suspend fun getPosts(): List<Post> {
        return apiService.getPosts()
    }
}