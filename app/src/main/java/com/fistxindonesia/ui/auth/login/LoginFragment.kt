package com.fistxindonesia.ui.auth.login

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.fistxindonesia.R
import com.fistxindonesia.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private val loginViewModel by viewModels<LoginViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        statusBarSetup()

        binding.inputPhoneNumber.doAfterTextChanged {
            val phoneNumber = it.toString()
            loginViewModel.inputPhoneNumber(phoneNumber)
        }

        binding.inputPassword.doAfterTextChanged {
            val password = it.toString()
            loginViewModel.inputPassword(password)
        }

        loginViewModel.isButtonEnable.observe(viewLifecycleOwner) {
            binding.btnLogin.isEnabled = it
        }

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