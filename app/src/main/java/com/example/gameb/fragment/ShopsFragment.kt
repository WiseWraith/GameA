package com.example.gameb.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gameb.R
import com.example.gameb.activity.MainActivity
import com.example.gameb.adapter.ShopAdapter
import com.example.gameb.data.DataSource
import com.example.gameb.databinding.FragmentShopsBinding

class ShopsFragment : Fragment(R.layout.fragment_shops) {
    companion object {
        fun NewInstance() = ShopsFragment() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentShopsBinding.bind(view)
        binding.rvShops.layoutManager = LinearLayoutManager(requireContext())
        binding.rvShops.adapter = ShopAdapter(DataSource.Shops) {}
        binding.imageClose.setOnClickListener {
            (activity as MainActivity).navigateToFragment(ProductFragment.NewInstance())
        }
    }

}
