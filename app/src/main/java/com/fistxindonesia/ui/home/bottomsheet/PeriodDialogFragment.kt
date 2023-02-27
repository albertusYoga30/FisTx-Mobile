package com.fistxindonesia.ui.home.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fistxindonesia.adapters.home.bottomsheet.PeriodAdapter
import com.fistxindonesia.databinding.FragmentPeriodBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class PeriodDialogFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentPeriodBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPeriodBinding.inflate(inflater, container, false)

        binding.recyclerviewMonth.adapter = PeriodAdapter()
        binding.closeBtn.setOnClickListener { dismiss() }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}