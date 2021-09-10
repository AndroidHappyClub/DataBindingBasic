package com.gcode.databindingsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.databindingsample.BR


class BindingUtilAdapter(var items: MutableList<BindingAdapterItem>) : RecyclerView.Adapter<BindingUtilAdapter.BindingHolder>() {

    /**
     * @return 返回的是adapter的view
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingHolder {
        val binding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context),
            viewType,
            parent,
            false
        )
        return BindingHolder(binding)
    }

    /*
    * 数据绑定
    * */
    override fun onBindViewHolder(holder: BindingHolder, position: Int) {
        holder.bindData(items[position])
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int) = items[position].getViewType()

    class BindingHolder(var binding: ViewDataBinding) : ViewHolder(binding.root) {
        fun bindData(item: BindingAdapterItem?) {
            binding.setVariable(BR.item, item)
        }
    }
}
