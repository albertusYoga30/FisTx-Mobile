package com.fistxindonesia.ui.auth.register

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.fistxindonesia.R
import com.fistxindonesia.databinding.FragmentOtpBinding

class OtpFragment : Fragment() {

    private var _binding: FragmentOtpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOtpBinding.inflate(inflater, container, false)

        requireActivity().window.statusBarColor =
            ContextCompat.getColor(requireContext(), R.color.status_bar_color_white)

        binding.verificationButton.setOnClickListener {
            showDialog()
//            findNavController().navigate(R.id.action_otpFragment_to_loginFragment)
        }

        return binding.root
    }

    private fun showDialog() {
        val dialogBinding = layoutInflater.inflate(R.layout.dialog_register, null)
        val myDialog = Dialog(requireContext())
        myDialog.setContentView(dialogBinding)
        myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        myDialog.show()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}