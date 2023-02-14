package com.fistxindonesia.adapters.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fistxindonesia.data.local.DataNews.news
import com.fistxindonesia.databinding.ItemNewsBinding

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {

    class MyViewHolder(binding: ItemNewsBinding) : RecyclerView.ViewHolder(binding.root) {
        val image = binding.image
        val title = binding.title
        val date = binding.date

        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemNewsBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = news[position]
        holder.image.setImageResource(item.image)
        holder.title.text = item.title
        holder.date.text = item.date
    }

    override fun getItemCount(): Int {
        return  news.size
    }
}