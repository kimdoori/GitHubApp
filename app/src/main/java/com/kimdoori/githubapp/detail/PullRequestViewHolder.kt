package com.kimdoori.githubapp.detail

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import com.kimdoori.githubapp.common.BaseViewHolder
import com.kimdoori.githubapp.databinding.ItemPullRequestBinding
import com.kimdoori.githubapp.domain.model.PullRequestModel

class PullRequestViewHolder(
    @LayoutRes layoutResourceId: Int,
    parent: ViewGroup,
    bindingVariableId: Int,
    private val onClick: (pullRequestUrl: String) -> Unit,
) : BaseViewHolder<PullRequestModel>(
    layoutResourceId = layoutResourceId,
    parent = parent,
    bindingVariableId = bindingVariableId,
) {

    override fun bind(item: PullRequestModel) {
        super.bind(item)
        (binding as ItemPullRequestBinding).itemPullRequestRootLayout.setOnClickListener {
            onClick(item.htmlUrl)
        }
    }
}
