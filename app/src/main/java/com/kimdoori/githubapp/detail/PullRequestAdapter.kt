package com.kimdoori.githubapp.detail

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import com.kimdoori.githubapp.common.BaseAdapter
import com.kimdoori.githubapp.common.BaseViewHolder
import com.kimdoori.githubapp.domain.model.PullRequestModel

class PullRequestAdapter(
    @LayoutRes private val layoutResourceId: Int,
    private val bindingVariableId: Int,
    private val onClick: (repoName: String) -> Unit,
) : BaseAdapter<PullRequestModel>(
    layoutResourceId = layoutResourceId,
    bindingVariableId = bindingVariableId,
) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<PullRequestModel> = PullRequestViewHolder(
        layoutResourceId = layoutResourceId,
        parent = parent,
        bindingVariableId = bindingVariableId,
        onClick = onClick,
    )
}
