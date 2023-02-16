package com.fistxindonesia.ui.pond

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fistxindonesia.R
import com.fistxindonesia.databinding.FragmentAddPondBinding

class CreatePondFragment : Fragment() {

    private var _binding: FragmentAddPondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddPondBinding.inflate(inflater, container, false)
        binding.btnSave.setOnClickListener {
            showDialog()
        }
        return binding.root
    }

    private fun showDialog() {
        val dialogBinding = layoutInflater.inflate(R.layout.dialog_create_land, null)
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