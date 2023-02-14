package com.fistxindonesia.ui.auth.resetPassword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowInsetsController
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.navigation.fragment.findNavController
import com.fistxindonesia.R
import com.fistxindonesia.databinding.FragmentForgotPasswordBinding

class ForgotPasswordFragment : Fragment() {

    private var _binding: FragmentForgotPasswordBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentForgotPasswordBinding.inflate(layoutInflater, container, false)

//        activity?.setActionBar(binding.toolbar)
        statusBarSetup()
        actionBarSetup()

        binding.btnSend.setOnClickListener {
            findNavController().navigate(R.id.action_forgotPasswordFragment_to_verificationOtpFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun statusBarSetup() {
        requireActivity().window.statusBarColor = ContextCompat
            .getColor(requireContext(), R.color.white)

        WindowCompat.getInsetsController(
            requireActivity().window,
            requireActivity().window.decorView
        ).isAppearanceLightStatusBars = true

        requireActivity().window.insetsController?.setSystemBarsAppearance(
            WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
            WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
        )

    }

    private fun actionBarSetup() {
        //(activity as AppCompatActivity).supportActionBar?.show()
        binding.actionBar.backBtn.setOnClickListener { findNavController().navigateUp() }
        binding.actionBar.label.text = findNavController().currentDestination?.label.toString()
    }


}