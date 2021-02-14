package com.kimdoori.githubapp.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kimdoori.githubapp.domain.model.GitHubRepoModel
import com.kimdoori.githubapp.domain.usecase.GitHubRepoUseCase
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers

class MainViewModel @ViewModelInject constructor(
    private val gitHubRepoUseCase: GitHubRepoUseCase,
    private val mainView: MainView,
) : ViewModel() {

    val gitHubRepoList: LiveData<List<GitHubRepoModel>> = mainView.gitHubRepoList
    val loading: LiveData<Boolean> = mainView.loading

    fun fetchGitHubRepoList(userName: String) {
        mainView.loading.value = true
        gitHubRepoUseCase
            .fetchGitHubRepoList(userName = userName)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    mainView.gitHubRepoList.value = it
                    mainView.loading.value = false
                },
                {
                    mainView.loading.value = false
                }
            )
    }
}
