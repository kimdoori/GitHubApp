package com.kimdoori.githubapp.domain.di

import com.kimdoori.githubapp.data.GitHubRepoRepository
import com.kimdoori.githubapp.domain.usecase.GitHubRepoUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun providesGitHubRepoUseCase(gitHubRepoRepository: GitHubRepoRepository) =
        GitHubRepoUseCaseImpl(gitHubRepoRepository = gitHubRepoRepository)
}
