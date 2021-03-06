package com.kimdoori.githubapp.data.remote

import com.kimdoori.githubapp.data.entity.GitHubRepoResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubRepoService {

    @GET("users/{user}/repos")
    fun fetchGitHubRepoList(
        @Path("user") userName: String
    ): Single<List<GitHubRepoResponse>>
}
