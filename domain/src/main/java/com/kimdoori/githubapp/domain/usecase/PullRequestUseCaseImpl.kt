package com.kimdoori.githubapp.domain.usecase

import com.kimdoori.githubapp.data.PullRequestRepository
import io.reactivex.rxjava3.core.Single
import com.kimdoori.githubapp.domain.model.PullRequestModel
import javax.inject.Inject

class PullRequestUseCaseImpl @Inject constructor(
    private val pullRequestRepository: PullRequestRepository
) : PullRequestUseCase {

    override fun fetchPullRequestList(
        userName: String,
        repoName: String
    ): Single<List<PullRequestModel>> =
        pullRequestRepository
            .fetchPullRequestList(userName = userName, repoName = repoName)
            .map { entity ->
                entity.map(PullRequestModel::mapFromEntity)
            }
}
