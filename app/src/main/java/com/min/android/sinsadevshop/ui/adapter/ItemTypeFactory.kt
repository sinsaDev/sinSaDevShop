package com.min.android.sinsadevshop.ui.adapter

import android.view.View

abstract class ItemTypeFactory {
    abstract fun onCreateViewHolder(
        containerView : View,
        viewType : Int

        )
}