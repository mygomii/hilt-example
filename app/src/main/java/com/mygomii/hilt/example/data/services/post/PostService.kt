package com.mygomii.hilt.example.data.services.post

import com.mygomii.hilt.example.domain.models.Comment
import com.mygomii.hilt.example.domain.models.Post
import kotlinx.coroutines.flow.Flow

interface PostService {
    suspend fun getPosts(): Flow<List<Post>>
    suspend fun getComments(postId: Int): Flow<List<Comment>>
}