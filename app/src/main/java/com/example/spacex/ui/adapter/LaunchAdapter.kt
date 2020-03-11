package com.example.spacex.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.spacex.R
import com.example.spacex.model.LaunchResponse
import kotlinx.android.synthetic.main.launch_item.view.*

class LaunchAdapter(private var launchResponse: List<LaunchResponse>) : RecyclerView.Adapter<LaunchAdapter.LaunchViewHolder>() {

    private var launch = emptyList<LaunchResponse>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaunchViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.launch_item, parent,false)
        return LaunchViewHolder(view)
    }

    override fun getItemCount(): Int {
        return launchResponse.size
    }

    override fun onBindViewHolder(holder: LaunchViewHolder, position: Int) {
        val currentLaunch = launch[position]

        holder.loadLaunchData(currentLaunch)
    }

    fun setLaunchData(launch: List<LaunchResponse>) {
        this.launch = launch
        notifyDataSetChanged()
    }

    inner class LaunchViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
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
}