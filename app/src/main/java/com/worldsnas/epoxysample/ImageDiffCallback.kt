package com.worldsnas.epoxysample

import androidx.recyclerview.widget.DiffUtil

class ImageDiffCallback: DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean =
        oldItem == newItem

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean =
        false
}