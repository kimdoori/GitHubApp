package com.kimdoori.githubapp.main

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import com.kimdoori.githubapp.common.BaseAdapter
import com.kimdoori.githubapp.common.BaseViewHolder
import com.kimdoori.githubapp.domain.model.GitHubRepoModel

class GitHubRepoAdapter(
    @LayoutRes private val layoutResourceId: Int,
    private val bindingVariableId: Int,
    private val onClick: (repoName: String) -> Unit,
) : BaseAdapter<GitHubRepoModel>(
    layoutResourceId = layoutResourceId,
    bindingVariableId = bindingVariableId,
) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<GitHubRepoModel> = GitHubRepoViewHolder(
        layoutResourceId = layoutResourceId,
        parent = parent,
        bindingVariableId = bindingVariableId,
        onClick = onClick,
    )
}
