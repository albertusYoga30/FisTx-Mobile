package com.fistxindonesia.ui.home.summaryActivities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.fistxindonesia.R
import com.fistxindonesia.databinding.FragmentSamplingChartBinding
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import kotlinx.coroutines.flow.callbackFlow

class SamplingChartFragment : Fragment() {

    private var _binding: FragmentSamplingChartBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSamplingChartBinding.inflate(inflater, container, false)

//        samplingChartView()
        initChart()

        return binding.root
    }

    private fun initChart() {
        val listDate = ArrayList<Entry>()
        listDate.add(Entry(0f, 2f))
        listDate.add(Entry(1f, 1f))
        listDate.add(Entry(2f, 3f))
        listDate.add(Entry(3f, 5f))
        listDate.add(Entry(4f, 4f))
        listDate.add(Entry(5f, 2f))


        val lineData = LineDataSet(listDate, "Date")
        lineData.setCircleColor(ContextCompat.getColor(requireContext(), R.color.primary))
        lineData.color = ContextCompat.getColor(requireContext(), R.color.primary)
        lineData.mode = LineDataSet.Mode.CUBIC_BEZIER
        lineData.lineWidth = 2f
        lineData.circleRadius = 5f


        val chart = binding.chart
        chart.data = LineData(lineData)

        chart.axisRight.isEnabled = false
        chart.description.isEnabled = false
        chart.legend.isEnabled = false


        chart.xAxis.position = XAxis.XAxisPosition.BOTTOM
        chart.xAxis.granularity = 1f
        chart.axisLeft.granularity = 1f
        chart.xAxis.gridColor = ContextCompat.getColor(requireContext(), R.color.soft_primary)
        chart.axisLeft.gridColor = ContextCompat.getColor(requireContext(), R.color.soft_primary)

    }


//    private fun samplingChartView() {
//
//        val xLabels = arrayOf<Number>(2, 2, 3, 4, 5);
//        val seriesNumber = arrayOf<Number>(2, 1, 2, 1, 3);
//
//        val series: XYSeries =
//            SimpleXYSeries(listOf(* seriesNumber), SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "")
//
//
//        /*custom chart line*/
//        val seriesFormat = LineAndPointFormatter(R.color.primary, R.color.primary, null, null)
//
//        /* line format */
//        seriesFormat.linePaint.strokeWidth = 10f
//        seriesFormat.linePaint.color = ContextCompat.getColor(requireContext(), R.color.primary)
//
//        /* dot point format */
//        seriesFormat.vertexPaint.strokeWidth = 30f
//        seriesFormat.vertexPaint.color = ContextCompat.getColor(requireContext(), R.color.primary)
//
//        seriesFormat.interpolationParams = CatmullRomInterpolator.Params(
//            100, CatmullRomInterpolator.Type.Centripetal
//        )
//
//        seriesFormat.isLegendIconEnabled = false
//
//
//        val chart = binding.chart
//        chart.addSeries(series, seriesFormat)
//
//        /* chart layout */
//        chart.graph.gridBackgroundPaint.color = Color.WHITE
//        chart.graph.backgroundPaint.color = Color.WHITE
//        chart.graph.size.height.layoutType = SizeMode.FILL
//        chart.graph.size.width.layoutType = SizeMode.FILL
//        chart.graph.size.height.value = PixelUtils.dpToPix(50f)
//        chart.graph.size.width.value = PixelUtils.dpToPix(50f)
//
//        chart.domainTitle.
//
//        chart.graph.getLineLabelStyle(XYGraphWidget.Edge.BOTTOM).format =
//            object : Format() {
//                override fun format(
//                    obj: Any?,
//                    toAppendTo: StringBuffer?,
//                    pos: FieldPosition?
//                ): StringBuffer {
//                    val i = (obj as Number).toFloat().roundToInt()
//                    return toAppendTo!!.append(xLabels[i])
//                }
//
//                override fun parseObject(source: String?, pos: ParsePosition?): Any? {
//                    return null
//                }
//
//            }
//        PanZoom.attach(binding.chart)
//    }
}