package com.mygomii.hilt.example.data.services.user

import com.mygomii.hilt.example.domain.models.User
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserServiceImpl @Inject constructor(
    private val httpClient: HttpClient
) : UserService {
    override suspend fun getUsers(): Flow<List<User>> {
        return flow {
            emit(httpClient.get("/users").body())
        }
    }
}