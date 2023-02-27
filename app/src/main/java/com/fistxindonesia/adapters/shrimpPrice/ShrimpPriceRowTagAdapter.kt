package com.fistxindonesia.adapters.shrimpPrice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fistxindonesia.data.local.DataShrimpPrice.shrimpPrice
import com.fistxindonesia.databinding.ItemShrimpPriceTagBinding

class ShrimpPriceRowTagAdapter : RecyclerView.Adapter<ShrimpPriceRowTagAdapter.MyViewHolder>() {

    class MyViewHolder(binding: ItemShrimpPriceTagBinding): RecyclerView.ViewHolder(binding.root){
        val price = binding.shrimpPrice
        val size = binding.shrimpSize

        companion object{
            fun from(parent: ViewGroup): MyViewHolder{
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemShrimpPriceTagBinding.inflate(layoutInflater, parent, false)
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
        holder.price.text = item.price
        holder.size.text = item.size
    }

    override fun getItemCount(): Int {
        return shrimpPrice.size
    }
}