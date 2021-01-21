package com.kimdoori.githubapp.data

import com.kimdoori.githubapp.data.entity.GitHubRepoResponse
import io.reactivex.rxjava3.core.Single

interface GitHubRepoRepository {

    fun fetchGitHubRepoList(userName: String): Single<List<GitHubRepoResponse>>
}
