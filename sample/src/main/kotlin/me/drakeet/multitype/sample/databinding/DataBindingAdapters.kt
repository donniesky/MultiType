package me.drakeet.multitype.sample.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("resId")
fun ImageView.setImgRes(resId: Int) {
    this.setImageResource(resId)
}

