package com.fistxindonesia.ui.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fistxindonesia.databinding.FragmentActivityBinding

class ActivityFragment : Fragment() {

    private var _binding: FragmentActivityBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentActivityBinding.inflate(inflater, container, false)
        actionBarSetup()

        return binding.root
    }

    private fun actionBarSetup() {
//        binding.actionBar.label.text = findNavController().currentDestination?.label.toString()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}