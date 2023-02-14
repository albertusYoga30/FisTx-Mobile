package com.fistxindonesia.adapters.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fistxindonesia.data.local.DataBanner.banners
import com.fistxindonesia.databinding.ItemBannerBinding

class BannerAdapter : RecyclerView.Adapter<BannerAdapter.MyViewHolder>() {

    class MyViewHolder(binding: ItemBannerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        val image = binding.bannerImage

        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemBannerBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = banners[position]
        holder.image.setImageResource(item.image)
    }

    override fun getItemCount(): Int {
        return banners.size
    }
}