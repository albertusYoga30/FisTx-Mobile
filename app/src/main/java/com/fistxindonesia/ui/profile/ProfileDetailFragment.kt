package com.fistxindonesia.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.fistxindonesia.R
import com.fistxindonesia.databinding.FragmentProfileDetailBinding

class ProfileDetailFragment : Fragment() {

    private var _binding: FragmentProfileDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfileDetailBinding.inflate(inflater, container, false)
//        actionBarSetup()

        return binding.root

    }

//    private fun actionBarSetup() {
//        binding.actionBar.label.text = findNavController().currentDestination?.label.toString()
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

