package com.gcode.databindingsample.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.gcode.databindingsample.BindingAdapterItem
import com.example.databindingsample.R

/**
 * 文本model
 * @property text String
 * @constructor
 */
class Text(val text: String):BaseObservable(), BindingAdapterItem {
    override fun getViewType(): Int {
        return R.layout.text_item
    }

    @JvmName("getText1")
    @Bindable
    fun getText(): String {
        return text
    }
}