package com.kimdoori.githubapp.data.remote

import com.kimdoori.githubapp.data.entity.PullRequestResponse
import io.reactivex.rxjava3.core.Single

interface PullRequestRemoteDataSource {

    fun fetchPullRequestList(userName: String, repoName: String): Single<List<PullRequestResponse>>
}
