package com.gcode.databindingsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databindingsample.R
import com.example.databindingsample.databinding.ActivityMainBinding
import com.gcode.databindingsample.model.Image
import com.gcode.databindingsample.model.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val items: MutableList<BindingAdapterItem> = ArrayList()
        items.apply {
            add(Text("哈哈哈哈"))
            add(Image(resources.getDrawable(R.drawable.download_1,null)))
            add(Text("我又来啦"))
            add(Text("我又来啦"))
            add(Text("我还来"))
            add(Image(resources.getDrawable(R.drawable.download_2,null)))
            add(Text("就是不让你看美女"))
            add(Text("哈哈你当不住我看见啦"))
        }
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )
        val mmBindingAdapter: BindingUtilAdapter = BindingUtilAdapter(items)
        val manager: LinearLayoutManager = LinearLayoutManager(applicationContext)
        binding.recyclerView.layoutManager = manager
        binding.recyclerView.adapter = mmBindingAdapter
        mmBindingAdapter.notifyDataSetChanged()
    }
}