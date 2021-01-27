package com.kimdoori.githubapp.viewcommon

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.kimdoori.githubapp.BR

open class BaseViewHolder<ITEM_TYPE : Any>(
    @LayoutRes layoutResourceId: Int,
    parent: ViewGroup,
    private val bindingVariableId: Int = BR.item
) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(layoutResourceId, parent, false)
) {

    private val binding: ViewDataBinding = DataBindingUtil.bind(itemView)!!

    open fun bind(item: ITEM_TYPE) {
        binding.setVariable(bindingVariableId, item)
    }
}
