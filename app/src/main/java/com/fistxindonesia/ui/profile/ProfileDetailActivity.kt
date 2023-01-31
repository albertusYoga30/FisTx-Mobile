package com.fistxindonesia.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.fistxindonesia.R
import com.fistxindonesia.databinding.ActivityProfileDetailBinding

class ProfileDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        window.statusBarColor(ContextCompat.getColor(this, R.color.white))
    }
}