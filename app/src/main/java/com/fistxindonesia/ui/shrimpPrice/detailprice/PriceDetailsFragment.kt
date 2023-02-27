package com.fistxindonesia.ui.shrimpPrice.detailprice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fistxindonesia.adapters.shrimpPrice.ShrimpPriceRowTagAdapter
import com.fistxindonesia.databinding.FragmentPriceDetailsBinding

class PriceDetailsFragment : Fragment() {

    private var _binding: FragmentPriceDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPriceDetailsBinding.inflate(inflater, container, false)

        binding.recyclerviewShrimpPriceTag.adapter = ShrimpPriceRowTagAdapter()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}