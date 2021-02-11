package com.kimdoori.githubapp.domain.usecase

import io.reactivex.rxjava3.core.Single
import com.kimdoori.githubapp.domain.model.PullRequestModel

interface PullRequestUseCase {

    fun fetchPullRequestList(userName: String, repoName: String): Single<List<PullRequestModel>>
}
