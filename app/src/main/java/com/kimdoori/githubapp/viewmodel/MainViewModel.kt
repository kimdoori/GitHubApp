package com.kimdoori.githubapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kimdoori.githubapp.domain.model.GitHubRepoModel

abstract class MainViewModel : ViewModel() {

    abstract val gitHubRepoList: LiveData<List<GitHubRepoModel>>

    abstract fun fetchGitHubRepoList(userName: String)
}
