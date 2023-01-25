package com.fistxindonesia.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fistxindonesia.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        actionBarSetup()

        val textView: TextView = binding.textHome

        return binding.root
    }

    private fun actionBarSetup() {
        binding.actionBar.label.text = findNavController().currentDestination?.label.toString()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}