package com.kimdoori.githubapp.viewcommon

import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<ITEM_TYPE : Any> : RecyclerView.Adapter<BaseViewHolder<ITEM_TYPE>>() {

    private val items = mutableListOf<ITEM_TYPE>()

    override fun getItemCount(): Int = items.size

    override fun getItemId(position: Int): Long = position.toLong()

    override fun onBindViewHolder(
        holder: BaseViewHolder<ITEM_TYPE>,
        position: Int
    ) {
        holder.bind(items[position])
    }

    open fun replaceItems(items: List<ITEM_TYPE>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }
}
