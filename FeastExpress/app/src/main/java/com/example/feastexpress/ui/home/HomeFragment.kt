package com.example.feastexpress.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.feastexpress.R
import com.example.feastexpress.adapters.HomeHorAdapter
import com.example.feastexpress.databinding.FragmentHomeBinding
import com.example.feastexpress.models.HomeHorModel

class HomeFragment : Fragment() {

    private lateinit var homeHorizontalRec: RecyclerView
    private lateinit var homeHorModelList: List<HomeHorModel>
    private lateinit var homeHorAdapter: HomeHorAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec)
        homeHorModelList.add(HomeHorModel(R.drawable.pizza,"Pizza"))
        homeHorModelList.add(HomeHorModel(R.drawable.hamburger, "Hamburger"))
        homeHorModelList.add(HomeHorModel(R.drawable.fried_potatoes, "Fries"))
        homeHorModelList.add(HomeHorModel(R.drawable.ice_cream, "Ice Cream"))
        homeHorModelList.add(HomeHorModel(R.drawable.sandwich, "Sandwich"))

        homeHorAdapter = HomeHorAdapter(requireActivity(), homeHorModelList)
        homeHorizontalRec.adapter = homeHorAdapter
        homeHorizontalRec.layoutManager = LinearLayoutManager(requireActivity(), RecyclerView.HORIZONTAL, false)
        homeHorizontalRec.setHasFixedSize(true)
        homeHorizontalRec.isNestedScrollingEnabled = false

        return root
    }
}
