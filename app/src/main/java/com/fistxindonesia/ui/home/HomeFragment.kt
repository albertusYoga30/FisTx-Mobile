package com.fistxindonesia.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fistxindonesia.adapters.home.BannerAdapter
import com.fistxindonesia.adapters.home.article.ArticleAdapter
import com.fistxindonesia.adapters.home.SummaryActivitiesAdapter
import com.fistxindonesia.databinding.FragmentHomeBinding
import com.fistxindonesia.ui.home.summaryActivities.FeedChartFragment
import com.fistxindonesia.ui.home.summaryActivities.SamplingChartFragment
import com.fistxindonesia.ui.home.summaryActivities.WaterChartFragment
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

//    private val homeViewModel by viewModels<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        summaryActivitiesLayout()

        binding.recyclerviewBanner.adapter = BannerAdapter()
        binding.recyclerviewArticles.adapter = ArticleAdapter()

        binding.pondProfile.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionNavigationHomeToPondFragment())
        }

        binding.device.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionNavigationHomeToDeviceFragment())
        }

        binding.calculator.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionNavigationHomeToCalculatorFragment())
        }

        binding.allArticle.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionNavigationHomeToArticlesFragment())
        }


        return binding.root
    }

//    private fun actionBarSetup() {
//        binding.actionBar.label.text = findNavController().currentDestination?.label.toString()
//    }

    private fun summaryActivitiesLayout(){
        val fragments = ArrayList<Fragment>()
        fragments.add(FeedChartFragment())
        fragments.add(WaterChartFragment())
        fragments.add(SamplingChartFragment())

        val titles = ArrayList<String>()
        titles.add("Pakan")
        titles.add("Kualitas Air")
        titles.add("Sampling")

        val pagerAdapter = SummaryActivitiesAdapter(fragments, requireActivity())

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