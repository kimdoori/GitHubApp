package com.kimdoori.githubapp.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

open class BaseViewHolder<T>(
    @LayoutRes layoutResourceId: Int,
    parent: ViewGroup,
    private val bindingVariableId: Int,
) : RecyclerView.ViewHolder(
    LayoutInflater
        .from(parent.context)
        .inflate(layoutResourceId, parent, false)
) {

    val binding: ViewDataBinding = DataBindingUtil.bind(itemView)!!

    open fun bind(item: T) {
        binding.setVariable(bindingVariableId, item)
    }
}
