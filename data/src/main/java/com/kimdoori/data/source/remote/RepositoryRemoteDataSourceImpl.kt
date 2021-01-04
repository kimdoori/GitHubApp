package com.kimdoori.data.source.remote

import com.kimdoori.data.source.entity.RepositoryResponse
import io.reactivex.rxjava3.core.Single

class RepositoryRemoteDataSourceImpl(
    private val repositoryService: RepositoryService
) : RepositoryRemoteDataSource {

    override fun getRepositoryList(userName: String): Single<List<RepositoryResponse>> =
        repositoryService.getRepositoryList(userName)
}
