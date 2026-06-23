package com.example.internetapp.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.internetapp.R

@BindingAdapter("marsImageUrl")
fun bindMarsImage(view: ImageView, imageUrl: String?) {
    Glide.with(view.context)
        .load(imageUrl)
        .placeholder(R.drawable.ic_placeholder)
        .error(R.drawable.ic_error)
        .into(view)
}
