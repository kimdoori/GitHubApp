package com.kimdoori.githubapp.data

import com.kimdoori.githubapp.data.entity.PullRequestResponse
import io.reactivex.rxjava3.core.Single

interface PullRequestRepository {

    fun fetchPullRequestList(userName: String, repoName: String): Single<List<PullRequestResponse>>
}
