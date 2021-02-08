package com.kimdoori.githubapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kimdoori.githubapp.domain.model.GitHubRepoModel

abstract class MainViewModel : ViewModel() {

    protected abstract val gitHubRepoList: LiveData<List<GitHubRepoModel>>
    protected abstract val loading: LiveData<Boolean>

    abstract fun fetchGitHubRepoList(userName: String)
}
