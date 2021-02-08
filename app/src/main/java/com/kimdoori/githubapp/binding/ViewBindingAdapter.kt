package com.kimdoori.githubapp.binding

import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter

@BindingAdapter("bind_visibility")
fun setVisibility(view: View, isVisible: Boolean) {
    view.isVisible = isVisible
}
