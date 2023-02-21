package com.fistxindonesia.ui.shrimpPrice.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fistxindonesia.databinding.FragmentFilterBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class FilterBottomSheetFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentFilterBottomSheetBinding? = null
    private  val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFilterBottomSheetBinding.inflate(inflater, container, false)

        binding.closeBtn.setOnClickListener {
            val action = FilterBottomSheetFragmentDirections.actionFilterBottomSheetFragmentToShrimpPriceFragment()
            findNavController().navigate(action)
        }

        binding.applyBtn.setOnClickListener {
            val action = FilterBottomSheetFragmentDirections.actionFilterBottomSheetFragmentToShrimpPriceFragment()
            findNavController().navigate(action)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}