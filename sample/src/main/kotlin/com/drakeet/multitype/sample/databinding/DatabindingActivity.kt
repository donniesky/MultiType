package com.drakeet.multitype.sample.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list.*
import com.drakeet.multitype.MultiTypeAdapter
import com.drakeet.multitype.sample.R

class DatabindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val adapter = MultiTypeAdapter()
        adapter.register(ThingItemView())
        list.adapter = adapter

        val items = mutableListOf<Any>()
        for (i in 0..19) {
            items.add(Thing(i, "This is $i Thing", R.mipmap.ic_launcher))
        }
        adapter.items = items
        adapter.notifyDataSetChanged()
    }
}
