package com.fistxindonesia.ui.shrimpPrice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fistxindonesia.R
import com.fistxindonesia.adapters.shrimpPrice.ShrimpPriceRowAdapter
import com.fistxindonesia.databinding.FragmentShrimpPriceBinding

class ShrimpPriceFragment : Fragment() {

    private var _binding: FragmentShrimpPriceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentShrimpPriceBinding.inflate(inflater, container, false)

        binding.recyclerviewShrimpPrice.adapter = ShrimpPriceRowAdapter()

        binding.filterButton.setOnClickListener {
            findNavController().navigate(R.id.action_shrimpPriceFragment_to_filterBottomSheetFragment)
        }

        binding.contactButton.setOnClickListener {
            findNavController().navigate(R.id.action_shrimpPriceFragment_to_detailShrimpPriceFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}