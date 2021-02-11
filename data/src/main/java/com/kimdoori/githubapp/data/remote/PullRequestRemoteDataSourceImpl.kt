package com.kimdoori.githubapp.data.remote

import com.kimdoori.githubapp.data.entity.PullRequestResponse
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class PullRequestRemoteDataSourceImpl @Inject constructor(
    private val pullRequestService: PullRequestService
) : PullRequestRemoteDataSource {

    override fun fetchPullRequestList(
        userName: String,
        repoName: String
    ): Single<List<PullRequestResponse>> =
        pullRequestService.fetchPullRequestList(userName = userName, repoName = repoName)
}
