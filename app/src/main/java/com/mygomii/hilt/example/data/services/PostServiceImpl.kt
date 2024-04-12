package com.mygomii.hilt.example.data.services

import com.mygomii.hilt.example.domain.models.Post
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PostServiceImpl @Inject constructor(
    private val httpClient: HttpClient
) : PostService {
    override suspend fun getPosts(): Flow<List<Post>> {
        return flow {
            emit(httpClient.get("/posts").body())
        }
    }
}