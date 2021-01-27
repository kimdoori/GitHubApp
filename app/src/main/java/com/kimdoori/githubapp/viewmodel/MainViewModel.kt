package com.kimdoori.githubapp.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.kimdoori.githubapp.domain.usecase.GitHubRepoUseCase

class MainViewModel @ViewModelInject constructor(
    private val gitHubRepoUseCase: GitHubRepoUseCase
) : ViewModel()
