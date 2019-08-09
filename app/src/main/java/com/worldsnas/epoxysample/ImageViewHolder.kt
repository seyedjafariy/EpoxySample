package com.worldsnas.epoxysample

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ImageViewHolder(
    view: View
) : RecyclerView.ViewHolder(view) {

    private val image: ImageView = view.findViewById(R.id.image)

    fun bind(imageURL: String) {
        Glide.with(image)
            .load(imageURL)
            .apply(RequestOptions.overrideOf(1200, 1000))
            .into(image)
    }
}