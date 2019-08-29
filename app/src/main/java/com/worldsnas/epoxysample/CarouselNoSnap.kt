package com.worldsnas.aio

import android.content.Context
import com.airbnb.epoxy.Carousel
import com.airbnb.epoxy.ModelView

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT, saveViewState = true)
class CarouselNoSnap(
    context : Context
) : Carousel(context) {

    override fun getSnapHelperFactory(): SnapHelperFactory? =
        null
}