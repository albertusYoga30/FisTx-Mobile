package com.fistxindonesia.ui.shrimpPrice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fistxindonesia.adapters.shrimpPrice.ShrimpPriceDetailsAdapter
import com.fistxindonesia.databinding.FragmentDetailShrimpPriceBinding
import com.fistxindonesia.ui.shrimpPrice.detailprice.GeneralInformationFragment
import com.fistxindonesia.ui.shrimpPrice.detailprice.PriceDetailsFragment
import com.google.android.material.tabs.TabLayoutMediator

class DetailShrimpPriceFragment : Fragment() {

    private var _binding: FragmentDetailShrimpPriceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailShrimpPriceBinding.inflate(inflater, container, false)

        tabLayout()

        return binding.root
    }

    private fun tabLayout() {
        val fragments = ArrayList<Fragment>()
        fragments.add(GeneralInformationFragment())
        fragments.add(PriceDetailsFragment())

        val titles = ArrayList<String>()
        titles.add("Informasi Umum")
        titles.add("Detail Harga")

        val pagerAdapter = ShrimpPriceDetailsAdapter(fragments, requireActivity())

        binding.viewPager2.isUserInputEnabled = false
        binding.viewPager2.adapter = pagerAdapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.text = titles[position]
        }.attach()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}