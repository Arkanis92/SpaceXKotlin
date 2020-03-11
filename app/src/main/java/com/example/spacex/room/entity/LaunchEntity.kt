package com.example.spacex.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "launch_table")
data class LaunchEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    @ColumnInfo(name = "mission_name")
    val missionName: String? = null,
    @ColumnInfo(name = "rocket_name")
    val rocketName: String? = null,
    @ColumnInfo(name = "launch_site_name")
    val launchSiteName: String? = null,
    @ColumnInfo(name = "launch_date")
    val launchDate: String? = null,
    @ColumnInfo(name = "launch_image")
    val launchImage: String? = null
)



