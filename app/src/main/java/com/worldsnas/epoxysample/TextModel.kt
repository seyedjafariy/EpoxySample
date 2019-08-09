package com.worldsnas.epoxysample

import android.widget.TextView

class TextModel (
    private val text : String
): KotlinModel (
    R.layout.item_text
){

    private val title by bind<TextView>(R.id.title)

    override fun bind() {
        title.text = text
    }
}