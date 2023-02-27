package com.fistxindonesia.adapters.home.bottomsheet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fistxindonesia.data.local.DataDateMonth.month
import com.fistxindonesia.databinding.ItemMonthBinding

class PeriodAdapter : RecyclerView.Adapter<PeriodAdapter.MyViewHolder>() {

    class MyViewHolder(binding: ItemMonthBinding) : RecyclerView.ViewHolder(binding.root) {
        val month = binding.month

        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemMonthBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = month[position]
        holder.month.text = item.name
    }

    override fun getItemCount(): Int {
        return month.size
    }
}