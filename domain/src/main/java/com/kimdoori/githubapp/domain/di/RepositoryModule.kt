package com.kimdoori.githubapp.domain.di

import com.kimdoori.githubapp.data.GitHubRepoRepository
import com.kimdoori.githubapp.data.PullRequestRepository
import com.kimdoori.githubapp.data.remote.GitHubRepoRemoteDataSource
import com.kimdoori.githubapp.data.remote.PullRequestRemoteDataSource
import com.kimdoori.githubapp.domain.repository.GitHubRepoRepositoryImpl
import com.kimdoori.githubapp.domain.repository.PullRequestRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun providesGitHubRepoRepository(
        gitHubRepoRemoteDataSource: GitHubRepoRemoteDataSource
    ): GitHubRepoRepository =
        GitHubRepoRepositoryImpl(gitHubRepoRemoteDataSource = gitHubRepoRemoteDataSource)

    @Provides
    @Singleton
    fun providesPullRequestRepository(
        pullRequestRemoteDataSource: PullRequestRemoteDataSource
    ): PullRequestRepository =
        PullRequestRepositoryImpl(pullRequestRemoteDataSource = pullRequestRemoteDataSource)
}
