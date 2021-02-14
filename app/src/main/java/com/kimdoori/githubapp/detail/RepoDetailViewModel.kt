package com.kimdoori.githubapp.detail

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kimdoori.githubapp.domain.model.PullRequestModel
import com.kimdoori.githubapp.domain.usecase.PullRequestUseCase
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers

class RepoDetailViewModel @ViewModelInject constructor(
    private val pullRequestUseCase: PullRequestUseCase,
    private val repoDetailView: RepoDetailView,
) : ViewModel() {

    val pullRequestList: LiveData<List<PullRequestModel>> = repoDetailView.pullRequestList
    val loading: LiveData<Boolean> = repoDetailView.loading

    fun fetchPullRequestList(userName: String, repoName: String) {
        repoDetailView.loading.value = true
        pullRequestUseCase
            .fetchPullRequestList(userName = userName, repoName = repoName)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    repoDetailView.pullRequestList.value = it
                    repoDetailView.loading.value = false
                },
                {
                    repoDetailView.loading.value = false
                }
            )
    }
}
