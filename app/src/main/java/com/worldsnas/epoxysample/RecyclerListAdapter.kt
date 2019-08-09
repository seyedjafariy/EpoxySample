package com.worldsnas.epoxysample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter

class RecyclerListAdapter : ListAdapter<String, ImageViewHolder>(
    ImageDiffCallback()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_image, parent, false)
        )

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}