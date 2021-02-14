package com.kimdoori.githubapp.domain.repository

import com.kimdoori.githubapp.data.PullRequestRepository
import com.kimdoori.githubapp.data.entity.PullRequestResponse
import com.kimdoori.githubapp.data.remote.PullRequestRemoteDataSource
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class PullRequestRepositoryImpl @Inject constructor(
    private val pullRequestRemoteDataSource: PullRequestRemoteDataSource
) : PullRequestRepository {

    override fun fetchPullRequestList(
        userName: String,
        repoName: String
    ): Single<List<PullRequestResponse>> =
        pullRequestRemoteDataSource.fetchPullRequestList(userName = userName, repoName = repoName)
}
