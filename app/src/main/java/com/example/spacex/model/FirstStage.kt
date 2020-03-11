package com.example.spacex.model


import com.squareup.moshi.Json


data class FirstStage(

	@field:Json(name="cores")
	val cores: List<CoresItem?>? = null
)