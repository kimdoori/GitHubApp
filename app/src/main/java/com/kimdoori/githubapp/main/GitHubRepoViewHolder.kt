package com.kimdoori.githubapp.main

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import com.kimdoori.githubapp.common.BaseViewHolder
import com.kimdoori.githubapp.databinding.ItemRepoBinding
import com.kimdoori.githubapp.domain.model.GitHubRepoModel

class GitHubRepoViewHolder(
    @LayoutRes layoutResourceId: Int,
    parent: ViewGroup,
    bindingVariableId: Int,
    private val onClick: (repoName: String) -> Unit,
) : BaseViewHolder<GitHubRepoModel>(
    layoutResourceId = layoutResourceId,
    parent = parent,
    bindingVariableId = bindingVariableId,
) {

    override fun bind(item: GitHubRepoModel) {
        super.bind(item)
        (binding as ItemRepoBinding).itemRepoRootLayout.setOnClickListener { onClick(item.name) }
    }
}
