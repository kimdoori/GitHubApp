package com.kimdoori.githubapp.binding_adapter

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("bind_visibility")
fun setVisibility(view: View, isVisible: Boolean) {
    if (isVisible) {
        view.visibility = View.VISIBLE
    } else {
        view.visibility = View.GONE
    }
}
