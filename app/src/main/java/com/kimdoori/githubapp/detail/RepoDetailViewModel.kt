package com.kimdoori.githubapp.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kimdoori.githubapp.domain.model.PullRequestModel

abstract class RepoDetailViewModel : ViewModel() {

    abstract val pullRequestList: LiveData<List<PullRequestModel>>
    abstract val loading: LiveData<Boolean>

    abstract fun fetchPullRequestList(userName: String, repoName: String)
}
