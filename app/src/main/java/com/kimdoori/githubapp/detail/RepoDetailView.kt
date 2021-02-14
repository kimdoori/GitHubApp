package com.kimdoori.githubapp.detail

import androidx.lifecycle.MutableLiveData
import com.kimdoori.githubapp.domain.model.PullRequestModel
import javax.inject.Inject

class RepoDetailView @Inject constructor() {

    val pullRequestList = MutableLiveData<List<PullRequestModel>>()
    val loading = MutableLiveData<Boolean>()
}
