package com.kimdoori.data.source.remote

import com.kimdoori.data.source.entity.GitHubRepoResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubRepoService {

    @GET("users/{user}/repos")
    fun getGitHubRepoList(
        @Path("user") userName: String
    ): Single<List<GitHubRepoResponse>>
}
