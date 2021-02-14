package com.kimdoori.githubapp.main

import androidx.lifecycle.MutableLiveData
import com.kimdoori.githubapp.domain.model.GitHubRepoModel
import javax.inject.Inject

class MainView @Inject constructor() {

    val gitHubRepoList = MutableLiveData<List<GitHubRepoModel>>()
    val loading = MutableLiveData<Boolean>()
}
