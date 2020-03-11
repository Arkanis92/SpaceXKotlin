package com.example.spacex.repository

import androidx.lifecycle.LiveData
import com.example.spacex.model.LaunchResponse
import com.example.spacex.repository.remote.LaunchService
import com.example.spacex.room.dao.LaunchDao
import com.example.spacex.room.entity.LaunchEntity

class LaunchRepository(private val launchService: LaunchService) {
    suspend fun getAllLaunches() = launchService.fetchAllLaunches()

}