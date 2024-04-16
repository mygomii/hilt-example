package com.mygomii.hilt.example.di

import com.mygomii.hilt.example.data.services.post.PostService
import com.mygomii.hilt.example.data.services.post.PostServiceImpl
import com.mygomii.hilt.example.data.services.user.UserService
import com.mygomii.hilt.example.data.services.user.UserServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {
    @Singleton
    @Provides
    fun providePostService(httpClient: HttpClient): PostService {
        return PostServiceImpl(httpClient)
    }

    @Singleton
    @Provides
    fun provideUserService(httpClient: HttpClient): UserService {
        return UserServiceImpl(httpClient)
    }
}