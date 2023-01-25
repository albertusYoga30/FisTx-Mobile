package com.fistxindonesia.ui.auth.resetPassword

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.fistxindonesia.R
import com.fistxindonesia.databinding.FragmentCreateNewPasswordBinding
import com.fistxindonesia.databinding.FragmentLoginBinding

class CreateNewPasswordFragment : Fragment() {
    private var _binding: FragmentCreateNewPasswordBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCreateNewPasswordBinding.inflate(layoutInflater, container, false)

        statusBarSetup()
        actionBarSetup()

        binding.btnSend.setOnClickListener {
            showDialog()
//            findNavController().navigate(R.id.action_createNewPasswordFragment_to_loginFragment)
        }

        return binding.root
    }

    private fun statusBarSetup() {
        requireActivity().window.statusBarColor =
            ContextCompat.getColor(requireContext(), R.color.white)
    }

    private fun actionBarSetup() {
        //(activity as AppCompatActivity).supportActionBar?.show()
        binding.actionBar.backBtn.setOnClickListener { findNavController().navigateUp() }
        binding.actionBar.label.text = findNavController().currentDestination?.label.toString()
    }

    private fun showDialog() {
        val dialogBinding = layoutInflater.inflate(R.layout.dialog_reset_password, null)
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