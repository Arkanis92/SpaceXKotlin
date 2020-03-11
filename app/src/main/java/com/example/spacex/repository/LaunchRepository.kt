package com.example.spacex.repository

import androidx.lifecycle.LiveData
import com.example.spacex.repository.remote.LaunchService
import com.example.spacex.room.dao.LaunchDao
import com.example.spacex.room.entity.LaunchEntity

class LaunchRepository(private val launchService: LaunchService, private val launchDao: LaunchDao) {
    val allLaunches: LiveData<List<LaunchEntity>> = launchDao.getLaunchData()

    suspend fun getAllLaunches() = launchService.fetchAllLaunches()

    suspend fun insertAllLaunches(launches: LaunchEntity) {
        launchDao.insertLaunchData(launches)
    }
}