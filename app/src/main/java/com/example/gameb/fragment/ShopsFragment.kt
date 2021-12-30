package com.example.gameb.fragment

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gameb.R
import com.example.gameb.activity.MainActivity
import com.example.gameb.adapter.ShopAdapter
import com.example.gameb.data.DataSource
import com.example.gameb.databinding.FragmentShopsBinding

class ShopsFragment : Fragment(R.layout.fragment_shops) {
    companion object {
       fun NewInstance() = ShopsFragment
        /*const val KEY_SHOP_ID = "shopID"
        const val KEY_SHOP_NAME = "shopName"
        const val KEY_PRICE = "price"
        const val KEY_AVAILABLE = "available"
        const val KEY_DISCOUNT= "discount"


        fun newInstance (argShopID : Int?, argShopName : String?, argPrice : Int?, argAvailable : String?, argDiscount : String?) : ShopsFragment {
            val args = bundleOf(
                KEY_SHOP_ID to argShopID,
                KEY_SHOP_NAME to argShopName,
                KEY_PRICE to argPrice,
                KEY_AVAILABLE to argAvailable,
                KEY_DISCOUNT to argDiscount
            )
            val fragment = ShopsFragment()
            fragment.arguments = args
            return fragment*/
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentShopsBinding.bind(view)
        /*val shopID = arguments?.getInt(ShopsFragment.KEY_SHOP_ID)
        val shopName = arguments?.getString(ShopsFragment.KEY_SHOP_NAME)
        val price = arguments?.getInt(ShopsFragment.KEY_PRICE)
        val available = arguments?.getString(ShopsFragment.KEY_AVAILABLE)
        val discount = arguments?.getString(ShopsFragment.KEY_DISCOUNT)*/


        binding.rvShops.layoutManager = LinearLayoutManager(requireContext())
        binding.rvShops.adapter = ShopAdapter(DataSource.Shops) {}
    }
}
