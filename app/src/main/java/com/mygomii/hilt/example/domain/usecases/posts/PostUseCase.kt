package com.mygomii.hilt.example.domain.usecases.posts

import com.mygomii.hilt.example.data.repositories.PostRepository
import com.mygomii.hilt.example.domain.models.Post
import com.mygomii.hilt.example.domain.usecases.base.BaseUseCase
import javax.inject.Inject

class PostUseCase @Inject constructor(
    private val postsRepository: PostRepository
) : BaseUseCase<List<Post>, Any?>() {

    override suspend fun run(params: Any?): List<Post> {
        return postsRepository.getPosts()
    }

}