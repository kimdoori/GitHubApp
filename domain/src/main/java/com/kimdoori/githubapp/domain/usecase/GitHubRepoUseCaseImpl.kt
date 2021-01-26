package com.kimdoori.githubapp.domain.usecase

import com.kimdoori.githubapp.data.GitHubRepoRepository
import io.reactivex.rxjava3.core.Single
import com.kimdoori.githubapp.domain.model.GitHubRepoModel
import javax.inject.Inject

class GitHubRepoUseCaseImpl @Inject constructor(
    private val gitHubRepoRepository: GitHubRepoRepository
) : GitHubRepoUseCase {

    override fun fetchGitHubRepoList(userName: String): Single<List<GitHubRepoModel>> =
        gitHubRepoRepository
            .fetchGitHubRepoList(userName = userName)
            .map { entity ->
                entity.map(GitHubRepoModel::mapFromEntity)
            }
}
