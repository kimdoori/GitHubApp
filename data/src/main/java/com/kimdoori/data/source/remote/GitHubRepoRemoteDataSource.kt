package com.kimdoori.data.source.remote

import com.kimdoori.data.source.entity.GitHubRepoResponse
import io.reactivex.rxjava3.core.Single

interface GitHubRepoRemoteDataSource {

    fun fetchGitHubRepoList(userName: String): Single<List<GitHubRepoResponse>>
}