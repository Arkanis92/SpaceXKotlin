package com.example.spacex.ui.adapter

import android.content.Context
import android.service.autofill.TextValueSanitizer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.spacex.R
import com.example.spacex.model.LaunchResponse
import com.example.spacex.ui.MainActivity
import com.facebook.shimmer.ShimmerFrameLayout
import com.google.android.material.textview.MaterialTextView
import kotlinx.android.synthetic.main.launch_item.view.*
import java.util.*
import kotlin.collections.ArrayList

class LaunchAdapter : RecyclerView.Adapter<LaunchAdapter.LaunchViewHolder>() {

    private var launchResponse: List<LaunchResponse>
//    private lateinit var shimmerFrameLayout: ShimmerFrameLayout

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaunchViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.launch_item, parent,false)
//        shimmerFrameLayout = view.findViewById(R.id.shimmerContainer)
//        shimmerFrameLayout.startShimmer()
        return LaunchViewHolder(view)
    }

    override fun getItemCount(): Int {
        return launchResponse.size
    }

    override fun onBindViewHolder(holder: LaunchViewHolder, position: Int) {
        val currentLaunch = launchResponse[position]

        holder.loadLaunchData(currentLaunch)
        holder.layoutLaunchItem.setOnClickListener {
            it.findNavController().navigate(R.id.action_launchFragment_to_detailsFragment)
        }
    }

    internal fun setLaunchData(launch: List<LaunchResponse>) {
        this.launchResponse = launch
        notifyDataSetChanged()
    }

    inner class LaunchViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val layoutLaunchItem: ConstraintLayout = itemView.findViewById(R.id.layoutLaunchItem)

        fun loadLaunchData(launchResponse: LaunchResponse) {
            itemView.apply {
                tvMissionName.text = launchResponse.missionName
                tvRocketName.text = launchResponse.rocket?.rocketName
                tvLaunchSiteName.text = launchResponse.launchSite?.siteName
                tvLaunchDate.text = launchResponse.launchDateLocal
                Glide.with(ivLaunchImage.context)
                    .load(launchResponse.links?.missionPatch)
                    .into(ivLaunchImage)
            }
        }
    }

    init {
        launchResponse = ArrayList()
    }
}