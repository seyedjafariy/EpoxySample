package com.worldsnas.epoxysample

import android.view.View
import android.widget.TextView

class TextViewHolder(
    view: View
) : BaseViewHolder(view) {

    private val title: TextView = view.findViewById(R.id.title)

    override fun bind(item: String) {
        title.text = item
    }
}