package com.mygomii.hilt.example.domain.usecases.posts

import com.mygomii.hilt.example.data.repositories.post.PostRepository
import com.mygomii.hilt.example.domain.models.Comment
import com.mygomii.hilt.example.domain.models.Post
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PostUseCase @Inject constructor(
    private val postRepository: PostRepository
) {
    suspend fun getPosts(): Flow<List<Post>> {
        return postRepository.getPosts()
    }

    suspend fun getComment(postId: Int): Flow<List<Comment>> {
        return postRepository.getComments(postId)
    }
}