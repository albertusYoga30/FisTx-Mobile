package com.fistxindonesia.ui.auth.resetPassword

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.widget.doAfterTextChanged
import androidx.navigation.fragment.findNavController
import com.fistxindonesia.R
import com.fistxindonesia.databinding.FragmentVerificationOtpBinding

class VerificationOtpFragment : Fragment() {
    private var _binding: FragmentVerificationOtpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentVerificationOtpBinding.inflate(layoutInflater, container, false)

        statusBarSetup()
        actionBarSetup()
        inputPinSetup()

        binding.btnVerification.isEnabled = false

        binding.pin1.addTextChangedListener(textWatcher)
        binding.pin2.addTextChangedListener(textWatcher)
        binding.pin3.addTextChangedListener(textWatcher)
        binding.pin4.addTextChangedListener(textWatcher)
        binding.pin5.addTextChangedListener(textWatcher)

        binding.btnVerification.setOnClickListener {
            findNavController().navigate(R.id.action_verificationOtpFragment_to_createNewPasswordFragment)
        }

        binding.btnResendOtp.setOnClickListener {
            binding.btnVerification.isEnabled = true
//            validatePin()
            /*do something*/
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun statusBarSetup() {
        requireActivity().window.statusBarColor =
            ContextCompat.getColor(requireContext(), R.color.white)
    }

    private fun actionBarSetup() {
        binding.actionBar.backBtn.setOnClickListener { findNavController().navigateUp() }
        binding.actionBar.label.text = findNavController().currentDestination?.label.toString()
    }

    private fun inputPinSetup() {
        binding.pin1.doAfterTextChanged { binding.pin2.requestFocus() }
        binding.pin2.doAfterTextChanged { binding.pin3.requestFocus() }
        binding.pin3.doAfterTextChanged { binding.pin4.requestFocus() }
        binding.pin4.doAfterTextChanged { binding.pin5.requestFocus() }
//        binding.pin5.doAfterTextChanged { binding.pin5.clearFocus() }
    }

    private fun validatePin() {

        val pin1 = binding.pin1.text.toString()
        val pin2 = binding.pin2.text.toString()
        val pin3 = binding.pin3.text.toString()
        val pin4 = binding.pin4.text.toString()
        val pin5 = binding.pin5.text.toString()

        val pin = "$pin1$pin2$pin3$pin4$pin5"

        if (pin.length == 5) {
            binding.btnVerification.isEnabled = true
        }

        Log.d("Test Input pin", "${pin.toInt()}")
    }

    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        }

        override fun afterTextChanged(s: Editable?) {
            binding.btnVerification.isEnabled = s!!.isNotEmpty()
        }
    }
}