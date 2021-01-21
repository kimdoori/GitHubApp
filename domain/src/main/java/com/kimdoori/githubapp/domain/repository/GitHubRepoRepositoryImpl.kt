package com.kimdoori.githubapp.domain.repository

import com.kimdoori.githubapp.data.GitHubRepoRepository
import com.kimdoori.githubapp.data.entity.GitHubRepoResponse
import com.kimdoori.githubapp.data.remote.GitHubRepoRemoteDataSource
import io.reactivex.rxjava3.core.Single

class GitHubRepoRepositoryImpl(
    private val gitHubRepoRemoteDataSource: GitHubRepoRemoteDataSource
) : GitHubRepoRepository {

    override fun fetchGitHubRepoList(userName: String): Single<List<GitHubRepoResponse>> =
        gitHubRepoRemoteDataSource.fetchGitHubRepoList(userName)
}
