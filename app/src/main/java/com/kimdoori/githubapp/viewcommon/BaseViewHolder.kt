package com.kimdoori.githubapp.viewcommon

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class BaseViewHolder<T>(
    @LayoutRes layoutResourceId: Int,
    parent: ViewGroup,
    private val bindingVariableId: Int,
) : RecyclerView.ViewHolder(
    LayoutInflater
        .from(parent.context)
        .inflate(layoutResourceId, parent, false)
) {

    private val binding: ViewDataBinding = DataBindingUtil.bind(itemView)!!

    fun bind(item: T) {
        binding.setVariable(bindingVariableId, item)
    }
}
