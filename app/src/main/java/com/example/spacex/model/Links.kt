package com.example.spacex.model


import com.squareup.moshi.Json


data class Links(

	@field:Json(name="mission_patch_small")
	val missionPatchSmall: String? = null,

	@field:Json(name="mission_patch")
	val missionPatch: String? = null,

	@field:Json(name="video_link")
	val videoLink: String? = null,

	@field:Json(name="flickr_images")
	val flickrImages: List<Any?>? = null,

	@field:Json(name="reddit_recovery")
	val redditRecovery: Any? = null,

	@field:Json(name="reddit_media")
	val redditMedia: Any? = null,

	@field:Json(name="reddit_campaign")
	val redditCampaign: Any? = null,

	@field:Json(name="wikipedia")
	val wikipedia: String? = null,

	@field:Json(name="reddit_launch")
	val redditLaunch: Any? = null,

	@field:Json(name="youtube_id")
	val youtubeId: String? = null,

	@field:Json(name="presskit")
	val presskit: Any? = null,

	@field:Json(name="article_link")
	val articleLink: String? = null
)