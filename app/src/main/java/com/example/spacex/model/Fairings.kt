package com.example.spacex.model


import com.squareup.moshi.Json


data class Fairings(

	@field:Json(name="recovered")
	val recovered: Boolean? = null,

	@field:Json(name="recovery_attempt")
	val recoveryAttempt: Boolean? = null,

	@field:Json(name="ship")
	val ship: Any? = null,

	@field:Json(name="reused")
	val reused: Boolean? = null
)