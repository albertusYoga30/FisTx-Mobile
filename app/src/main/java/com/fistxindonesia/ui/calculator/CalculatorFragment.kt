package com.fistxindonesia.ui.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fistxindonesia.R
import com.fistxindonesia.adapters.home.CalculatorAdapter
import com.fistxindonesia.databinding.FragmentCalculatorBinding
import com.fistxindonesia.ui.calculator.calculatorViewPage.AlkalinityFragment
import com.fistxindonesia.ui.calculator.calculatorViewPage.AmmoniaFragment
import com.fistxindonesia.ui.calculator.calculatorViewPage.CarbonFragment
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class CalculatorFragment : Fragment() {


    private var _binding: FragmentCalculatorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCalculatorBinding.inflate(inflater, container, false)

        calculatorTabLayout()

        return binding.root
    }

    private fun calculatorTabLayout(){
        val fragments = ArrayList<Fragment>()
        fragments.add(AlkalinityFragment())
        fragments.add(AmmoniaFragment())
        fragments.add(CarbonFragment())

        val titles = ArrayList<String>()
        titles.add("Alkalinitas")
        titles.add("Ammonia")
        titles.add("Karbon")

        val pagerAdapter = CalculatorAdapter(fragments, requireActivity())

        binding.viewPager2.isUserInputEnabled = false
        binding.viewPager2.adapter = pagerAdapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager2){
            tab, position -> tab.text = titles[position]
        }.attach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}