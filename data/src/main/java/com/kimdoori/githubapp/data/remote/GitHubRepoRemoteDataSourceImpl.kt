package com.kimdoori.githubapp.data.remote

import com.kimdoori.githubapp.data.entity.GitHubRepoResponse
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class GitHubRepoRemoteDataSourceImpl @Inject constructor(
    private val gitHubRepoService: GitHubRepoService
) : GitHubRepoRemoteDataSource {

    override fun fetchGitHubRepoList(userName: String): Single<List<GitHubRepoResponse>> =
        gitHubRepoService.fetchGitHubRepoList(userName)
}
