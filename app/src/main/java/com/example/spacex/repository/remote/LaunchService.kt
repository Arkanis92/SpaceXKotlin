package com.example.spacex.repository.remote

import com.example.spacex.model.LaunchResponse
import retrofit2.http.GET

interface LaunchService {
    @GET("/launches")
    suspend fun fetchAllLaunches(
    ): LaunchResponse
}