package com.kimdoori.githubapp.data.remote

import com.kimdoori.githubapp.data.entity.GitHubRepoResponse
import io.reactivex.rxjava3.core.Single

class GitHubRepoRemoteDataSourceImpl(
    private val gitHubRepoService: GitHubRepoService
) : GitHubRepoRemoteDataSource {

    override fun fetchGitHubRepoList(userName: String): Single<List<GitHubRepoResponse>> =
        gitHubRepoService.fetchGitHubRepoList(userName)
}
