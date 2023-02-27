package com.fistxindonesia.adapters.shrimpPrice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fistxindonesia.data.local.DataShrimpPrice.shrimpPrice
import com.fistxindonesia.databinding.ItemShrimpPriceBinding

class ShrimpPriceRowAdapter : RecyclerView.Adapter<ShrimpPriceRowAdapter.MyViewHolder>() {

    class MyViewHolder(binding: ItemShrimpPriceBinding) : RecyclerView.ViewHolder(binding.root) {
        val authorPost = binding.authorPostDate
        val price = binding.shrimpPrice
        val location = binding.location
        val shrimpSize = binding.shrimpSize

        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemShrimpPriceBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = shrimpPrice[position]
        val postValue = "${item.date_created}, oleh ${item.author}"
        holder.authorPost.text = postValue
        holder.price.text = item.price
        holder.location.text = item.location
        holder.shrimpSize.text = item.size
    }

    override fun getItemCount(): Int {
        return shrimpPrice.size
    }
}