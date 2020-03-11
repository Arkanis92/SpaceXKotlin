package com.example.spacex.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "launch_table")
data class LaunchEntity (
    @PrimaryKey
    @ColumnInfo(name = "launches")
    val missionName: String,
    val rocketName: String,
    val launchSiteName: String,
    val launchDate: String,
    val launchImage: String
)



