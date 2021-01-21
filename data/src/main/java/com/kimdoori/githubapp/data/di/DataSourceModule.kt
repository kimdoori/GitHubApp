package com.kimdoori.githubapp.data.di

import com.kimdoori.githubapp.data.remote.GitHubRepoRemoteDataSource
import com.kimdoori.githubapp.data.remote.GitHubRepoRemoteDataSourceImpl
import com.kimdoori.githubapp.data.remote.GitHubRepoService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class DataSourceModule {

    @Provides
    @Singleton
    fun providesGitHubRepoRemoteDataSource(
        gitHubRepoService: GitHubRepoService
    ): GitHubRepoRemoteDataSource =
        GitHubRepoRemoteDataSourceImpl(gitHubRepoService = gitHubRepoService)
}
