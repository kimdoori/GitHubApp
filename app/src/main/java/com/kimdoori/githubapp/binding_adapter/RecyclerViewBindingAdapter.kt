package com.kimdoori.githubapp.binding_adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kimdoori.githubapp.viewcommon.BaseAdapter

@BindingAdapter("bind_items")
fun setItems(recyclerView: RecyclerView, items: List<Any>?) {
    if (items == null) return
    @Suppress("UNCHECKED_CAST")
    (recyclerView.adapter as? BaseAdapter<Any>)?.run {
        replaceItems(items)
    }
}
