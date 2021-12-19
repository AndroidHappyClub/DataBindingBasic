package com.gcode.databindingsample.model

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.gcode.databindingsample.BindingAdapterItem
import com.example.databindingsample.R

/**
 *作者:created by HP on 2021/9/10 16:47
 *邮箱:sakurajimamai2020@qq.com
 */
class Image(var drawable: Drawable) : BindingAdapterItem {
    override fun getViewType(): Int {
        return R.layout.image_item
    }
}