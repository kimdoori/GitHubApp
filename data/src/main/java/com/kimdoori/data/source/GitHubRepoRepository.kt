package com.kimdoori.data.source

import com.kimdoori.data.source.entity.GitHubRepoResponse
import io.reactivex.rxjava3.core.Single

interface GitHubRepoRepository {

    fun fetchGitHubRepoList(userName: String): Single<List<GitHubRepoResponse>>
}
