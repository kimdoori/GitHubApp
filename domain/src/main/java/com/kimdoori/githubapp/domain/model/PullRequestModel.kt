package com.kimdoori.githubapp.domain.model

import com.kimdoori.githubapp.data.entity.PullRequestResponse

data class PullRequestModel(
    val id: Int,
    val title: String,
    val body: String,
    val state: String,
    val url: String,
    val htmlUrl: String,
    val assignee: UserModel? = null,
    val requestedReviewers: List<UserModel?>? = null,
    val issueUrl: String? = null,
) {
    companion object {
        fun mapFromEntity(pullRequestResponse: PullRequestResponse) = PullRequestModel(
            id = pullRequestResponse.id,
            title = pullRequestResponse.title,
            body = pullRequestResponse.body,
            state = pullRequestResponse.state,
            url = pullRequestResponse.url,
            htmlUrl = pullRequestResponse.htmlUrl,
            assignee = pullRequestResponse.assignee?.let(UserModel::mapFromEntity),
            requestedReviewers = pullRequestResponse.requestedReviewers
                ?.filterNotNull()
                ?.map(UserModel::mapFromEntity),
            issueUrl = pullRequestResponse.issueUrl,
        )
    }
}
