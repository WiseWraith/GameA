package com.example.gameb.fragment

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gameb.R
import com.example.gameb.activity.MainActivity
import com.example.gameb.adapter.ReviewAdapter
import com.example.gameb.data.DataSource
import com.example.gameb.databinding.FragmentReviewsBinding

class ReviewsFragment : Fragment(R.layout.fragment_reviews) {
    companion object {
        fun newInstance() = ReviewsFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentReviewsBinding.bind(view)
        binding.rvReview.layoutManager = LinearLayoutManager(requireContext())
        binding.rvReview.adapter = ReviewAdapter(DataSource.reviews) {}
        binding.imageClose.setOnClickListener{
            (activity as MainActivity).navigateToFragment(ProductFragment.NewInstance())
        }
    }
}