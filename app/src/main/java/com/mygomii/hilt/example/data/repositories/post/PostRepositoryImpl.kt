package com.mygomii.hilt.example.data.repositories.post

import com.mygomii.hilt.example.data.services.post.PostService
import com.mygomii.hilt.example.domain.models.Comment
import com.mygomii.hilt.example.domain.models.Post
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(private val postService: PostService) : PostRepository {
    override suspend fun getPosts(): Flow<List<Post>> {
        return postService.getPosts()
    }

    override suspend fun getComments(postId: Int): Flow<List<Comment>> {
        return postService.getComments(postId)
    }
}