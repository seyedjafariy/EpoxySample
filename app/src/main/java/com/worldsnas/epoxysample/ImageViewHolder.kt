package com.worldsnas.epoxysample

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ImageViewHolder(
    view: View
) : BaseViewHolder(view) {

    private val image: ImageView = view.findViewById(R.id.image)

    override fun bind(item: String) {
        Glide.with(image)
            .load(item)
            .apply(RequestOptions.overrideOf(1200, 1000))
            .into(image)
    }
}