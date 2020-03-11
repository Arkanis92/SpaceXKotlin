package com.example.spacex.model


import com.squareup.moshi.Json


data class LaunchFailureDetails(

	@field:Json(name="altitude")
	val altitude: Any? = null,

	@field:Json(name="reason")
	val reason: String? = null,

	@field:Json(name="time")
	val time: Int? = null
)