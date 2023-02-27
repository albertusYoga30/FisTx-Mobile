package com.fistxindonesia.ui.home.bottomsheet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fistxindonesia.R
import com.fistxindonesia.databinding.FragmentChartListDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class ChartListDialogFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentChartListDialogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChartListDialogBinding.inflate(inflater, container, false)
        binding.closeBtn.setOnClickListener { dismiss() }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}