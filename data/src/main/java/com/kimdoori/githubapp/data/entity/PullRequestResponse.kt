package com.kimdoori.githubapp.data.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PullRequestResponse(
	@Json(name = "id") val id: Int,
	@Json(name = "title") val title: String,
	@Json(name = "body") val body: String,
	@Json(name = "state") val state: String,
	@Json(name = "url") val url: String,
	@Json(name = "html_url") val htmlUrl: String,
	@Json(name = "assignee") val assignee: UserResponse? = null,
	@Json(name = "requested_reviewers") val requestedReviewers: List<UserResponse?>? = null,
	@Json(name = "issue_url") val issueUrl: String? = null,
)
