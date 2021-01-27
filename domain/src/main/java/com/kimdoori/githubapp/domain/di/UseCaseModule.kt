package com.kimdoori.githubapp.domain.di

import com.kimdoori.githubapp.data.GitHubRepoRepository
import com.kimdoori.githubapp.domain.usecase.GitHubRepoUseCase
import com.kimdoori.githubapp.domain.usecase.GitHubRepoUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun providesGitHubRepoUseCase(gitHubRepoRepository: GitHubRepoRepository): GitHubRepoUseCase =
        GitHubRepoUseCaseImpl(gitHubRepoRepository = gitHubRepoRepository)
}
