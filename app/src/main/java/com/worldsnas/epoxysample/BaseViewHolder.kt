package com.worldsnas.epoxysample

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder(
    view: View
) : RecyclerView.ViewHolder(view) {
    abstract fun bind(item : String) : Unit
}