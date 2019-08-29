package com.worldsnas.epoxysample

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import android.widget.TextView
import com.airbnb.epoxy.*

@ModelView(defaultLayout = R.layout.my_view, saveViewState = true)
class MyView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr, defStyleRes) {

    @ModelProp
    @JvmField
    var nameProp : String = ""

    val title: TextView = findViewById(R.id.tvTitle)

    @TextProp
    fun setTitle(title: CharSequence): Unit {
        this.title.text = title
    }

    @ModelProp
    fun setTitle(title: String) {
        this.title.text = title
    }

    @CallbackProp
    fun setClickListener(listener: (() -> Unit)?) {
        setOnClickListener {
            listener?.invoke()
        }
    }

    @CallbackProp
    fun setClickListener(listener: OnClickListener?) {
        setOnClickListener(listener)
    }

    @OnViewRecycled
    fun cleanUp(){
        //clean up any reference to avoid leaks
    }

}