package com.kimdoori.domain.repository

import com.kimdoori.data.source.GitHubRepoRepository
import com.kimdoori.data.source.entity.GitHubRepoResponse
import com.kimdoori.data.source.remote.GitHubRepoRemoteDataSource
import io.reactivex.rxjava3.core.Single

class GitHubRepoRepositoryImpl(
    private val gitHubRepoRemoteDataSource: GitHubRepoRemoteDataSource
) : GitHubRepoRepository {

    override fun fetchGitHubRepoList(userName: String): Single<List<GitHubRepoResponse>> =
        gitHubRepoRemoteDataSource.fetchGitHubRepoList(userName)
}
