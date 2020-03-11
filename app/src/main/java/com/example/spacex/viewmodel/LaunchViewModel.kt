package com.example.spacex.viewmodel

import android.app.Application
import android.app.Service
import androidx.lifecycle.*
import com.example.spacex.model.LaunchResponse
import com.example.spacex.repository.LaunchRepository
import com.example.spacex.repository.remote.LaunchService
import com.example.spacex.repository.remote.ServiceInstance
import com.example.spacex.room.LaunchRoomDatabase
import com.example.spacex.room.dao.LaunchDao
import com.example.spacex.room.entity.LaunchEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LaunchViewModel : ViewModel() {
    private val launchRepository: LaunchRepository = LaunchRepository(ServiceInstance.launchService)

    val launchLiveData = liveData(Dispatchers.IO) {
        val launchData = launchRepository.getAllLaunches()
        emit(launchData)
    }
}