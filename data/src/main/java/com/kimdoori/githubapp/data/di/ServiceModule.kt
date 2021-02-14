package com.kimdoori.githubapp.data.di

import com.kimdoori.githubapp.data.remote.GitHubRepoService
import com.kimdoori.githubapp.data.remote.PullRequestService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ServiceModule {

    @Provides
    @Singleton
    fun providesGitHubRepoService(retrofit: Retrofit): GitHubRepoService =
        retrofit.create(GitHubRepoService::class.java)

    @Provides
    @Singleton
    fun providesPullRequestService(retrofit: Retrofit): PullRequestService =
        retrofit.create(PullRequestService::class.java)
}
