package com.kimdoori.githubapp.data.di

import com.kimdoori.githubapp.data.remote.GitHubRepoService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class ServiceModule {

    @Provides
    @Singleton
    fun providesGitHubRepoService(retrofit: Retrofit): GitHubRepoService =
        retrofit.create(GitHubRepoService::class.java)
}
