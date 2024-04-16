package com.mygomii.hilt.example.di

import com.mygomii.hilt.example.data.repositories.post.PostRepository
import com.mygomii.hilt.example.data.repositories.user.UserRepository
import com.mygomii.hilt.example.domain.usecases.posts.PostUseCase
import com.mygomii.hilt.example.domain.usecases.user.UserUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    @Singleton
    fun providePostUseCase(postRepository: PostRepository): PostUseCase {
        return PostUseCase(postRepository)
    }

    @Provides
    @Singleton
    fun provideUserUseCase(userRepository: UserRepository): UserUseCase {
        return UserUseCase(userRepository)
    }
}