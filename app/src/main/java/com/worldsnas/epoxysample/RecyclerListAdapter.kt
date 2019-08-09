package com.worldsnas.epoxysample

import android.util.Patterns
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter

const val VIEW_TYPE_IMAGE = 1
const val VIEW_TYPE_TEXT = 2

class RecyclerListAdapter : ListAdapter<String, BaseViewHolder>(
    ImageDiffCallback()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder =
        when (viewType) {
            VIEW_TYPE_TEXT ->
                TextViewHolder(
                    LayoutInflater
                        .from(parent.context)
                        .inflate(R.layout.item_text, parent, false)
                )
            VIEW_TYPE_IMAGE ->
                ImageViewHolder(
                    LayoutInflater
                        .from(parent.context)
                        .inflate(R.layout.item_image, parent, false)
                )
            else ->
                throw IllegalArgumentException("view type is not supported")
        }


    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        //some times we need to check for view holder type as well!

        holder.bind(getItem(position))
    }

    override fun getItemViewType(position: Int): Int =
        if (Patterns.WEB_URL.matcher(getItem(position)).matches()) {
            VIEW_TYPE_IMAGE
        } else {
            VIEW_TYPE_TEXT
        }
}