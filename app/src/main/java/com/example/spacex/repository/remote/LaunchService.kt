package com.example.spacex.repository.remote

import com.example.spacex.model.LaunchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface LaunchService {
    @GET("launches")
    suspend fun fetchAllLaunches(
    ): List<LaunchResponse>
}