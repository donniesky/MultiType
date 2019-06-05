package com.drakeet.multitype.sample.databinding

import com.drakeet.multitype.sample.R
import me.donnie.multitype.ItemViewBinding

class ThingItemView : ItemViewBinding<Thing, ItemDataThingBinding>() {
    override fun getLayoutResId(): Int {
        return R.layout.item_data_thing
    }

    override fun convert(binding: ItemDataThingBinding, item: Thing, position: Int) {
        binding.thing = item
    }
}