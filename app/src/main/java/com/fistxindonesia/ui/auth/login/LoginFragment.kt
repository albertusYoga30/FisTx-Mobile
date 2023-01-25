package com.fistxindonesia.ui.auth.login

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.navigation.fragment.findNavController
import com.fistxindonesia.R
import com.fistxindonesia.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)


        statusBarSetup()

        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_MainActivity)
            activity?.finish()
        }
        binding.forgotPassword.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
        }
        binding.linkRegister.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun statusBarSetup() {
        (activity as AppCompatActivity).supportActionBar?.hide()

        requireActivity().window.statusBarColor =
            ContextCompat.getColor(requireContext(), R.color.primary)

        WindowCompat.getInsetsController(
            requireActivity().window,
            requireActivity().window.decorView
        ).isAppearanceLightStatusBars = false
    }
}