package com.kimdoori.githubapp.domain.usecase

import io.reactivex.rxjava3.core.Single
import com.kimdoori.githubapp.domain.model.GitHubRepoModel

interface GitHubRepoUseCase {

    fun fetchGitHubRepoList(userName: String): Single<List<GitHubRepoModel>>
}
