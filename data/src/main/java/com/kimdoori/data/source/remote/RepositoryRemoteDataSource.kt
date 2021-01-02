package com.kimdoori.data.source.remote

import com.kimdoori.data.source.entity.RepositoryResponse
import io.reactivex.rxjava3.core.Single

interface RepositoryRemoteDataSource {

    fun getRepositoryList(userName: String): Single<List<RepositoryResponse>>
}
