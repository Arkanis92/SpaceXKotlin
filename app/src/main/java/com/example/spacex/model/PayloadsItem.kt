package com.example.spacex.model


import com.squareup.moshi.Json


data class PayloadsItem(

	@field:Json(name="payload_type")
	val payloadType: String? = null,

	@field:Json(name="payload_mass_kg")
	val payloadMassKg: Int? = null,

	@field:Json(name="payload_id")
	val payloadId: String? = null,

	@field:Json(name="nationality")
	val nationality: String? = null,

	@field:Json(name="norad_id")
	val noradId: List<Any?>? = null,

	@field:Json(name="customers")
	val customers: List<String?>? = null,

	@field:Json(name="orbit")
	val orbit: String? = null,

	@field:Json(name="orbit_params")
	val orbitParams: OrbitParams? = null,

	@field:Json(name="payload_mass_lbs")
	val payloadMassLbs: Int? = null,

	@field:Json(name="reused")
	val reused: Boolean? = null,

	@field:Json(name="manufacturer")
	val manufacturer: String? = null
)