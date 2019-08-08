package com.worldsnas.epoxysample

import android.widget.ImageView
import com.bumptech.glide.Glide

data class ImageModel(
    val imageURL: String
) : KotlinModel(
    R.layout.item_image
) {

    private val image by bind<ImageView>(R.id.image)

    override fun bind() {
        Glide.with(image)
            .load(imageURL)
            .into(image)
    }
}