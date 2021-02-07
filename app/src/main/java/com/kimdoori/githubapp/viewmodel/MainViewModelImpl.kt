package com.kimdoori.githubapp.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import com.kimdoori.githubapp.domain.model.GitHubRepoModel
import com.kimdoori.githubapp.domain.usecase.GitHubRepoUseCase
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers

class MainViewModelImpl @ViewModelInject constructor(
    private val gitHubRepoUseCase: GitHubRepoUseCase
) : MainViewModel() {

    override val gitHubRepoList = MutableLiveData<List<GitHubRepoModel>>()

    override fun fetchGitHubRepoList(userName: String) {
        gitHubRepoUseCase
            .fetchGitHubRepoList(userName = userName)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    gitHubRepoList.value = it
                },
                { }
            )
    }
}
