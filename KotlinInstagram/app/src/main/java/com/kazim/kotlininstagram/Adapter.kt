package com.kazim.kotlininstagram

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kazim.kotlininstagram.databinding.RecyclerRowBinding
import com.squareup.picasso.Picasso

class Adapter(private val list:ArrayList<Post>):RecyclerView.Adapter<Adapter.Holder>() {
    class Holder(val binding: RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding =RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position:Int) {
        holder.binding.Emailtext.text =list.get(position).email
        holder.binding.informationView.text=list.get(position).comment
        Picasso.get().load(list.get(position).downloadUrl).into(holder.binding.imageView)

    }

    override fun getItemCount(): Int {
        return list.size

    }
}