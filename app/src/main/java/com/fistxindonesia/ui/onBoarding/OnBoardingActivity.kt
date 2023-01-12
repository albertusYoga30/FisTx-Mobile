package com.fistxindonesia.ui.onBoarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fistxindonesia.R
import com.fistxindonesia.databinding.ActivityOnBoardingBinding

private lateinit var binding: ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}