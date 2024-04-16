package com.mygomii.hilt.example.data.services.user

import com.mygomii.hilt.example.domain.models.User
import kotlinx.coroutines.flow.Flow

interface UserService {
    suspend fun getUsers(): Flow<List<User>>
}