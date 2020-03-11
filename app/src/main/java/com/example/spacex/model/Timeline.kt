package com.example.spacex.model


import com.squareup.moshi.Json


data class Timeline(

	@field:Json(name="webcast_liftoff")
	val webcastLiftoff: Int? = null
)