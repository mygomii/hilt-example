package com.mygomii.hilt.example.di

import com.mygomii.hilt.example.data.repositories.PostRepository
import com.mygomii.hilt.example.domain.usecases.posts.PostUseCase
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

}