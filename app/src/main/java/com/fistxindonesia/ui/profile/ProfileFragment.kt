package com.fistxindonesia.ui.profile

import android.os.Bundle
import android.view.ContextMenu
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fistxindonesia.R
import com.fistxindonesia.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        binding.personalInformation.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_profile_to_profileDetailFragment)
//            val directions = ProfileFragmentDirections.actionNavigationProfileToProfileDetailActivity()
//            findNavController().navigate(directions)
        }

        binding.security.setOnClickListener {
            val directions = ProfileFragmentDirections.actionNavigationProfileToSecurityActivity()
            findNavController().navigate(directions)
        }
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