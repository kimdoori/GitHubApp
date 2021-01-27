package com.kimdoori.githubapp.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kimdoori.githubapp.domain.model.GitHubRepoModel
import com.kimdoori.githubapp.domain.usecase.GitHubRepoUseCase
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers

class MainViewModel @ViewModelInject constructor(
    private val gitHubRepoUseCase: GitHubRepoUseCase
) : ViewModel() {

    private val _gitHubRepoList = MutableLiveData<List<GitHubRepoModel>>()
    val gitHubRepoList: LiveData<List<GitHubRepoModel>> = _gitHubRepoList

    fun fetchGitHubRepoList(userName: String) {
        gitHubRepoUseCase
            .fetchGitHubRepoList(userName = userName)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { _gitHubRepoList.value = it },
                { }
            )
    }
}
