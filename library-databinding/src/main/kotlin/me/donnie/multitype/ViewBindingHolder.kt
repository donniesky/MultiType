package me.donnie.multitype

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class ViewBindingHolder<B : ViewDataBinding> constructor(
        var binding: B
) : RecyclerView.ViewHolder(binding.root)