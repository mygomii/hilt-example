package com.mygomii.hilt.example.presentaion.main

import com.mygomii.hilt.example.domain.models.Post
import com.mygomii.hilt.example.domain.usecases.posts.PostUseCase
import com.mygomii.hilt.example.presentaion.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject internal constructor(
    private val postUseCase: PostUseCase,
) : BaseViewModel() {
    private val viewModelScope = CoroutineScope(Dispatchers.Main)

    private val _postList: MutableStateFlow<List<Post>> = MutableStateFlow(emptyList())
    val postList: StateFlow<List<Post>> = _postList.asStateFlow()

    init {
        getPosts()
    }

    private fun getPosts() {
        viewModelScope.launch {
            postUseCase.getPosts().collect {
                _postList.value = it
            }
        }
    }
}