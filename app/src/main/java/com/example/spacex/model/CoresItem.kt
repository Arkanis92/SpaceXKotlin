package com.example.spacex.model


import com.squareup.moshi.Json


data class CoresItem(

	@field:Json(name="flight")
	val flight: Int? = null,

	@field:Json(name="landing_type")
	val landingType: Any? = null,

	@field:Json(name="gridfins")
	val gridfins: Boolean? = null,

	@field:Json(name="landing_intent")
	val landingIntent: Boolean? = null,

	@field:Json(name="legs")
	val legs: Boolean? = null,

	@field:Json(name="land_success")
	val landSuccess: Any? = null,

	@field:Json(name="landing_vehicle")
	val landingVehicle: Any? = null,

	@field:Json(name="block")
	val block: Any? = null,

	@field:Json(name="reused")
	val reused: Boolean? = null,

	@field:Json(name="core_serial")
	val coreSerial: String? = null
)