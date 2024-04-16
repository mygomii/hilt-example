package com.mygomii.hilt.example.data.repositories.user

import com.mygomii.hilt.example.domain.models.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun getUsers(): Flow<List<User>>
}