package com.kimdoori.githubapp.main

import androidx.lifecycle.LiveData
import com.kimdoori.githubapp.domain.model.GitHubRepoModel

interface MainViewModel {

    val gitHubRepoList: LiveData<List<GitHubRepoModel>>
    val loading: LiveData<Boolean>

    fun fetchGitHubRepoList(userName: String)
}
