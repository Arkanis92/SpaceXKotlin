package com.example.spacex.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.spacex.repository.LaunchRepository
import com.example.spacex.room.LaunchRoomDatabase
import com.example.spacex.room.entity.LaunchEntity
import kotlinx.coroutines.launch

class LaunchViewModel(application: Application) : AndroidViewModel(application) {
    private val launchRepository: LaunchRepository

    val allLaunches: LiveData<List<LaunchEntity>>

    init {
        val launchDao = LaunchRoomDatabase.getDatabase(application, viewModelScope).launchDao()
        launchRepository = LaunchRepository(launchDao)
        allLaunches = launchRepository.allLaunches
    }

    fun insertLaunchData(launches: LaunchEntity) = viewModelScope.launch {
        launchRepository.insertAllLaunches(launches)
    }
}