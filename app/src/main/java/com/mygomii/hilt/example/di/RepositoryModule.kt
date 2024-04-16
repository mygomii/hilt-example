package com.mygomii.hilt.example.di

import com.mygomii.hilt.example.data.repositories.post.PostRepository
import com.mygomii.hilt.example.data.repositories.post.PostRepositoryImpl
import com.mygomii.hilt.example.data.repositories.user.UserRepository
import com.mygomii.hilt.example.data.repositories.user.UserRepositoryImpl
import com.mygomii.hilt.example.data.services.post.PostService
import com.mygomii.hilt.example.data.services.user.UserService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun providePostRepository(postService: PostService): PostRepository {
        return PostRepositoryImpl(postService)
    }

    @Provides
    @Singleton
    fun provideUserRepository(userService: UserService): UserRepository {
        return UserRepositoryImpl(userService)
    }

}
