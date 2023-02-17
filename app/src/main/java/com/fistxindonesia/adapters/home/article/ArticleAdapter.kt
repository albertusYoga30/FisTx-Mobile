package com.fistxindonesia.adapters.home.article

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fistxindonesia.data.local.DataArticle.articles
import com.fistxindonesia.databinding.ItemArticleBinding

class ArticleAdapter : RecyclerView.Adapter<ArticleAdapter.MyViewHolder>() {

    class MyViewHolder(binding: ItemArticleBinding) : RecyclerView.ViewHolder(binding.root) {
        val image = binding.image
        val title = binding.title
        val date = binding.date

        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemArticleBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = articles[position]
        holder.image.setImageResource(item.image)
        holder.title.text = item.title
        holder.date.text = item.date
    }

    override fun getItemCount(): Int {
        return  articles.size
    }
}