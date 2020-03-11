package com.example.spacex.model


import com.squareup.moshi.Json


data class Rocket(

	@field:Json(name="second_stage")
	val secondStage: SecondStage? = null,

	@field:Json(name="rocket_id")
	val rocketId: String? = null,

	@field:Json(name="first_stage")
	val firstStage: FirstStage? = null,

	@field:Json(name="rocket_type")
	val rocketType: String? = null,

	@field:Json(name="rocket_name")
	val rocketName: String? = null,

	@field:Json(name="fairings")
	val fairings: Fairings? = null
)