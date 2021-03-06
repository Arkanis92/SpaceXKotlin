package com.example.spacex.model


import com.squareup.moshi.Json


data class SecondStage(

	@field:Json(name="payloads")
	val payloads: List<PayloadsItem?>? = null,

	@field:Json(name="block")
	val block: Int? = null
)