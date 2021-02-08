package com.kimdoori.githubapp.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kimdoori.githubapp.domain.model.GitHubRepoModel
import com.kimdoori.githubapp.domain.usecase.GitHubRepoUseCase
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers

class MainViewModelImpl @ViewModelInject constructor(
    private val gitHubRepoUseCase: GitHubRepoUseCase
) : MainViewModel, ViewModel() {

    override val gitHubRepoList = MutableLiveData<List<GitHubRepoModel>>()
    override val loading = MutableLiveData<Boolean>()

    override fun fetchGitHubRepoList(userName: String) {
        loading.value = true
        gitHubRepoUseCase
            .fetchGitHubRepoList(userName = userName)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    gitHubRepoList.value = it
                    loading.value = false
                },
                {
                    loading.value = false
                }
            )
    }
}
