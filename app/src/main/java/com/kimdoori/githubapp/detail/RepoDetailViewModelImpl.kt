package com.kimdoori.githubapp.detail

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kimdoori.githubapp.domain.model.GitHubRepoModel
import com.kimdoori.githubapp.domain.model.PullRequestModel
import com.kimdoori.githubapp.domain.usecase.GitHubRepoUseCase
import com.kimdoori.githubapp.domain.usecase.PullRequestUseCase
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers

class RepoDetailViewModelImpl @ViewModelInject constructor(
    private val pullRequestUseCase: PullRequestUseCase
) : RepoDetailViewModel() {

    override val pullRequestList = MutableLiveData<List<PullRequestModel>>()
    override val loading = MutableLiveData<Boolean>()

    override fun fetchPullRequestList(userName: String, repoName: String) {
        loading.value = true
        pullRequestUseCase
            .fetchPullRequestList(userName = userName, repoName = repoName)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    pullRequestList.value = it
                    loading.value = false
                },
                {
                    loading.value = false
                }
            )
    }
}
