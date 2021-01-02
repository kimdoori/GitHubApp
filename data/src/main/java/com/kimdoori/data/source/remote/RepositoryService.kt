package com.kimdoori.data.source.remote

import com.kimdoori.data.source.entity.RepositoryResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface RepositoryService {

    @GET("users/{user}/repos")
    fun getRepositoryList(
        @Path("user") userName: String
    ): Single<List<RepositoryResponse>>
}
