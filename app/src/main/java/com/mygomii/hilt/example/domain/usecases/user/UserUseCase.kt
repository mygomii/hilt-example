package com.mygomii.hilt.example.domain.usecases.user

import com.mygomii.hilt.example.data.repositories.user.UserRepository
import com.mygomii.hilt.example.domain.models.User
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend fun getUsers(): Flow<List<User>> {
        return userRepository.getUsers()
    }
}