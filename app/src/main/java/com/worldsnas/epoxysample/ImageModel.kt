package com.worldsnas.epoxysample

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

data class ImageModel(
    val imageURL: String
) : KotlinModel(
    R.layout.item_image
) {

    private val image by bind<ImageView>(R.id.image)

    override fun bind() {
        Glide.with(image)
            .load(imageURL)
            .apply(RequestOptions.overrideOf(1200, 1000))
            .into(image)
    }
}