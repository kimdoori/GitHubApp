package com.kimdoori.data.source.remote

import com.kimdoori.data.source.entity.GitHubRepoResponse
import io.reactivex.rxjava3.core.Single

class GitHubRepoRemoteDataSourceImpl(
    private val gitHubRepoService: GitHubRepoService
) : GitHubRepoRemoteDataSource {

    override fun getGitHubRepoList(userName: String): Single<List<GitHubRepoResponse>> =
        gitHubRepoService.getGitHubRepoList(userName)
}
