package com.kimdoori.githubapp.data.remote

import com.kimdoori.githubapp.data.entity.PullRequestResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface PullRequestService {

    @GET("repos/{user}/{repo}/pulls")
    fun fetchPullRequestList(
        @Path("user") userName: String,
        @Path("repo") repoName: String,
    ): Single<List<PullRequestResponse>>
}
