package com.example.feastexpress.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.feastexpress.R
import com.example.feastexpress.models.HomeHorModel

class HomeHorAdapter(private val context: Context, private val list:HomeHorModel) : RecyclerView.Adapter<HomeHorAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.home_horizontal_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].image)
        holder.name.text = list[position].name
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.hor_img)
        val name: TextView = itemView.findViewById(R.id.hor_text)
    }
}
