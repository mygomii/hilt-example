package com.mygomii.hilt.example.di

import com.mygomii.hilt.example.data.repositories.PostRepository
import com.mygomii.hilt.example.data.repositories.PostRepositoryImpl
import com.mygomii.hilt.example.data.services.PostService
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

}
