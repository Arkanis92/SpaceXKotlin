package com.example.spacex.room.dao

import android.media.Image
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.spacex.model.LaunchResponse
import com.example.spacex.room.entity.LaunchEntity

@Dao
interface LaunchDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLaunchData(
        launches: LaunchEntity
    )

    @Query("SELECT * from launch_table")
    fun getLaunchData(): LiveData<List<LaunchEntity>>

    @Query("DELETE FROM launch_table")
    suspend fun deleteAll()
}