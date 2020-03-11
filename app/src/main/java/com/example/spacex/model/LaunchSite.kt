package com.example.spacex.model


import com.squareup.moshi.Json


data class LaunchSite(

	@field:Json(name="site_name")
	val siteName: String? = null,

	@field:Json(name="site_id")
	val siteId: String? = null,

	@field:Json(name="site_name_long")
	val siteNameLong: String? = null
)