package com.example.spacex.model


import com.squareup.moshi.Json


data class OrbitParams(

	@field:Json(name="periapsis_km")
	val periapsisKm: Double? = null,

	@field:Json(name="mean_anomaly")
	val meanAnomaly: Any? = null,

	@field:Json(name="inclination_deg")
	val inclinationDeg: Double? = null,

	@field:Json(name="regime")
	val regime: String? = null,

	@field:Json(name="arg_of_pericenter")
	val argOfPericenter: Any? = null,

	@field:Json(name="eccentricity")
	val eccentricity: Any? = null,

	@field:Json(name="apoapsis_km")
	val apoapsisKm: Double? = null,

	@field:Json(name="semi_major_axis_km")
	val semiMajorAxisKm: Any? = null,

	@field:Json(name="raan")
	val raan: Any? = null,

	@field:Json(name="epoch")
	val epoch: Any? = null,

	@field:Json(name="lifespan_years")
	val lifespanYears: Any? = null,

	@field:Json(name="reference_system")
	val referenceSystem: String? = null,

	@field:Json(name="period_min")
	val periodMin: Any? = null,

	@field:Json(name="mean_motion")
	val meanMotion: Any? = null,

	@field:Json(name="longitude")
	val longitude: Any? = null
)