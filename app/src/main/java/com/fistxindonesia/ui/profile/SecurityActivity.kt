package com.fistxindonesia.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fistxindonesia.R
import com.fistxindonesia.databinding.ActivitySecurityBinding

class SecurityActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySecurityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecurityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}