package com.example.spacex.model


import com.squareup.moshi.Json


data class Telemetry(

	@field:Json(name="flight_club")
	val flightClub: Any? = null
)