package com.kimdoori.githubapp.domain.di

import com.kimdoori.githubapp.data.GitHubRepoRepository
import com.kimdoori.githubapp.data.remote.GitHubRepoRemoteDataSource
import com.kimdoori.githubapp.domain.repository.GitHubRepoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun providesGitHubRepoRepository(
        gitHubRepoRemoteDataSource: GitHubRepoRemoteDataSource
    ): GitHubRepoRepository =
        GitHubRepoRepositoryImpl(gitHubRepoRemoteDataSource = gitHubRepoRemoteDataSource)
}
