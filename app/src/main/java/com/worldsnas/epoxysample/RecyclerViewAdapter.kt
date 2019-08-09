package com.worldsnas.epoxysample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<ImageViewHolder>() {

    var list = emptyList<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_image, parent, false)
        )

    override fun getItemCount(): Int =
        list.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(list[position])
    }
}