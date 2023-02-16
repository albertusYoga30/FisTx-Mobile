package com.fistxindonesia.ui.pond

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fistxindonesia.databinding.FragmentPondBinding


class PondProfileFragment : Fragment() {

    private var _binding: FragmentPondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPondBinding.inflate(inflater, container, false)

        binding.buttonAdd.setOnClickListener {
            findNavController().navigate(PondFragmentDirections.actionPondFragmentToAddPondFragment())
        }


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}