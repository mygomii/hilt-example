package com.mygomii.hilt.example.domain.usecases.base

import com.mygomii.hilt.example.domain.models.ApiError

interface UseCaseResponse<Type> {

    fun onSuccess(result: Type)

    fun onError(apiError: ApiError?)
}

