package com.example.spacex.model


import com.squareup.moshi.Json


data class LaunchResponse(

	@field:Json(name="mission_name")
	val missionName: String? = null,

	@field:Json(name="static_fire_date_utc")
	val staticFireDateUtc: String? = null,

	@field:Json(name="launch_year")
	val launchYear: String? = null,

	@field:Json(name="launch_date_utc")
	val launchDateUtc: String? = null,

	@field:Json(name="launch_failure_details")
	val launchFailureDetails: LaunchFailureDetails? = null,

	@field:Json(name="flight_number")
	val flightNumber: Int? = null,

	@field:Json(name="is_tentative")
	val isTentative: Boolean? = null,

	@field:Json(name="rocket")
	val rocket: Rocket? = null,

	@field:Json(name="mission_id")
	val missionId: List<Any?>? = null,

	@field:Json(name="launch_window")
	val launchWindow: Int? = null,

	@field:Json(name="crew")
	val crew: Any? = null,

	@field:Json(name="launch_date_local")
	val launchDateLocal: String? = null,

	@field:Json(name="tentative_max_precision")
	val tentativeMaxPrecision: String? = null,

	@field:Json(name="ships")
	val ships: List<Any?>? = null,

	@field:Json(name="launch_date_unix")
	val launchDateUnix: Int? = null,

	@field:Json(name="launch_success")
	val launchSuccess: Boolean? = null,

	@field:Json(name="static_fire_date_unix")
	val staticFireDateUnix: Int? = null,

	@field:Json(name="tbd")
	val tbd: Boolean? = null,

	@field:Json(name="timeline")
	val timeline: Timeline? = null,

	@field:Json(name="telemetry")
	val telemetry: Telemetry? = null,

	@field:Json(name="links")
	val links: Links? = null,

	@field:Json(name="details")
	val details: String? = null,

	@field:Json(name="launch_site")
	val launchSite: LaunchSite? = null,

	@field:Json(name="upcoming")
	val upcoming: Boolean? = null
)