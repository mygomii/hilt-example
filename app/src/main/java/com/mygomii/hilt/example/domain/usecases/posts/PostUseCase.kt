package com.mygomii.hilt.example.domain.usecases.posts

import com.mygomii.hilt.example.data.repositories.PostRepository
import com.mygomii.hilt.example.domain.models.Post
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PostUseCase @Inject constructor(
    private val postsRepository: PostRepository
) {
    suspend fun getPosts(): Flow<List<Post>> {
        return postsRepository.getPosts()
    }
}