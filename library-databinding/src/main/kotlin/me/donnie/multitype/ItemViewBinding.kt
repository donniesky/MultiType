package me.donnie.multitype

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import me.drakeet.multitype.ItemViewBinder

abstract class ItemViewBinding<T, B : ViewDataBinding> : ItemViewBinder<T, ViewBindingHolder<B>>() {

    @LayoutRes
    abstract fun getLayoutResId(): Int

    abstract fun convert(binding: B, item: T, position: Int)

    override fun onCreateViewHolder(inflater: LayoutInflater, parent: ViewGroup): ViewBindingHolder<B> {
        return ViewBindingHolder(DataBindingUtil.inflate(inflater, getLayoutResId(), parent, false))
    }

    override fun onBindViewHolder(holder: ViewBindingHolder<B>, item: T) {
        val binding = holder.binding
        convert(binding, item, holder.adapterPosition)
        binding.executePendingBindings()
    }

}