package me.drakeet.multitype.sample.databinding

import me.donnie.multitype.ItemViewBinding
import me.drakeet.multitype.sample.R

class ThingItemView : ItemViewBinding<Thing, ItemDataThingBinding>() {
    override fun getLayoutResId(): Int {
        return R.layout.item_data_thing
    }

    override fun convert(binding: ItemDataThingBinding, item: Thing, position: Int) {
        binding.thing = item
    }
}