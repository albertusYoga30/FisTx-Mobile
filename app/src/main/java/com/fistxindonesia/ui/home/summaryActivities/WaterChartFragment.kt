package com.fistxindonesia.ui.home.summaryActivities

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.fistxindonesia.R
import com.fistxindonesia.databinding.FragmentFeedChartBinding
import com.fistxindonesia.databinding.FragmentWaterChartBinding
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet


class WaterChartFragment : Fragment() {
    private var _binding: FragmentWaterChartBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWaterChartBinding.inflate(inflater, container, false)

        initChart()

        return binding.root
    }


    private fun initChart() {
        val listData1 = ArrayList<Entry>()
        listData1.add(Entry(0f, 4f))
        listData1.add(Entry(1f, 2f))
        listData1.add(Entry(2f, 3f))
        listData1.add(Entry(3f, 4f))
        listData1.add(Entry(4f, 5f))

        val listData2 = ArrayList<Entry>()
        listData2.add(Entry(0f, 4f))
        listData2.add(Entry(1f, 3f))
        listData2.add(Entry(2f, 1f))
        listData2.add(Entry(3f, 3f))
        listData2.add(Entry(4f, 5f))


        val lineData1 = LineDataSet(listData1, "Date")
        lineData1.setCircleColor(ContextCompat.getColor(requireContext(), R.color.primary))
        lineData1.setDrawCircleHole(false)
        lineData1.setDrawValues(false)
        lineData1.color = ContextCompat.getColor(requireContext(), R.color.primary)
        lineData1.mode = LineDataSet.Mode.CUBIC_BEZIER
        lineData1.lineWidth = 2f
        lineData1.circleRadius = 5f

        val lineData2 = LineDataSet(listData2, "Date")
        lineData2.setCircleColor(ContextCompat.getColor(requireContext(), R.color.primary_red))
        lineData2.setDrawCircleHole(false)
        lineData2.setDrawValues(false)
        lineData2.color = ContextCompat.getColor(requireContext(), R.color.primary_red)
        lineData2.mode = LineDataSet.Mode.CUBIC_BEZIER
        lineData2.lineWidth = 2f
        lineData2.circleRadius = 5f



        val chart = binding.chart
        chart.data = LineData(lineData1, lineData2)

        chart.axisRight.isEnabled = false
        chart.description.isEnabled = false
        chart.legend.isEnabled = false


        chart.xAxis.position = XAxis.XAxisPosition.BOTTOM
        chart.xAxis.granularity = 1f
        chart.axisLeft.granularity = 1f
        chart.xAxis.gridColor = ContextCompat.getColor(requireContext(), R.color.soft_primary)
        chart.axisLeft.gridColor = ContextCompat.getColor(requireContext(), R.color.soft_primary)

    }

}