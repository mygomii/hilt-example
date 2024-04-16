package com.mygomii.hilt.example.data.repositories.user

import com.mygomii.hilt.example.data.services.user.UserService
import com.mygomii.hilt.example.domain.models.User
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val userService: UserService) : UserRepository {
    override suspend fun getUsers(): Flow<List<User>> {
        return userService.getUsers()
    }
}