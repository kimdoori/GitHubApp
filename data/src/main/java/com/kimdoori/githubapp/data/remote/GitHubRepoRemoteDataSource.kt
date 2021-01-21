package com.kimdoori.githubapp.data.remote

import com.kimdoori.githubapp.data.entity.GitHubRepoResponse
import io.reactivex.rxjava3.core.Single

interface GitHubRepoRemoteDataSource {

    fun fetchGitHubRepoList(userName: String): Single<List<GitHubRepoResponse>>
}
