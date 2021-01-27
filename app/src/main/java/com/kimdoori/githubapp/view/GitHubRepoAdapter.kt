package com.kimdoori.githubapp.view

import android.view.ViewGroup
import com.kimdoori.githubapp.R
import com.kimdoori.githubapp.domain.model.GitHubRepoModel
import com.kimdoori.githubapp.viewcommon.BaseAdapter
import com.kimdoori.githubapp.viewcommon.BaseViewHolder

class GitHubRepoAdapter : BaseAdapter<GitHubRepoModel>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<GitHubRepoModel> = BaseViewHolder(
        layoutResourceId = R.layout.item_repo,
        parent = parent
    )
}
