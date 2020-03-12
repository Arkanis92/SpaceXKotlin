package com.example.spacex.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.spacex.R
import com.example.spacex.model.LaunchResponse
import com.example.spacex.ui.adapter.LaunchAdapter
import com.example.spacex.viewmodel.LaunchViewModel
import com.facebook.shimmer.ShimmerFrameLayout
import kotlinx.android.synthetic.main.fragment_launch.*
import okhttp3.internal.notify

/**
 * A simple [Fragment] subclass.
 */
class LaunchFragment : Fragment() {

    private val launchViewModel: LaunchViewModel by viewModels()
    private var launchAdapter: LaunchAdapter? = null
    private lateinit var shimmerFrameLayout: ShimmerFrameLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_launch, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        shimmerFrameLayout = view.findViewById(R.id.shimmerContainer)
        setupRecyclerView()
        setupObservers()
    }

    private fun setupRecyclerView() {
        launchAdapter?.apply { notifyDataSetChanged() } ?: run {
            launchAdapter = LaunchAdapter()
            with(rvLaunch) {
                layoutManager = LinearLayoutManager(context)
                adapter = launchAdapter
                itemAnimator = DefaultItemAnimator()
            }
        }
    }

    private fun setupObservers() {
        launchViewModel.launchLiveData.observe(viewLifecycleOwner) {
            launchAdapter?.setLaunchData(it)
            shimmerFrameLayout.stopShimmer()
            shimmerFrameLayout.visibility = View.GONE

//            shimmerFrameLayout.postDelayed( Runnable {
//                run {
//                    launchAdapter?.setLaunchData(it)
//                    shimmerFrameLayout.stopShimmer()
//                    shimmerFrameLayout.visibility = View.GONE
//                }
//            }, 2000)
        }
    }

    override fun onResume() {
        super.onResume()
        shimmerFrameLayout.startShimmer()
    }

    override fun onPause() {
        shimmerFrameLayout.stopShimmer()
        super.onPause()
    }
}
