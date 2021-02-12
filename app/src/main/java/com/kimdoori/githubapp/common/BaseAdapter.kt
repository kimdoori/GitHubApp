package com.kimdoori.githubapp.common

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

open class BaseAdapter<T>(
    @LayoutRes private val layoutResourceId: Int,
    private val bindingVariableId: Int,
) : RecyclerView.Adapter<BaseViewHolder<T>>() {

    private val items = mutableListOf<T>()

    override fun getItemCount(): Int = items.size

    override fun getItemId(position: Int): Long = position.toLong()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<T> = BaseViewHolder(
        layoutResourceId = layoutResourceId,
        parent = parent,
        bindingVariableId = bindingVariableId,
    )

    override fun onBindViewHolder(
        holder: BaseViewHolder<T>,
        position: Int
    ) {
        holder.bind(items[position])
    }

    fun replaceItems(newItems: List<T>) {
        items.run {
            clear()
            addAll(newItems)
        }
        notifyDataSetChanged()
    }
}
