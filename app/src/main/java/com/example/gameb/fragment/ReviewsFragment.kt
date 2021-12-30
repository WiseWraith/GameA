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
        const val KEY_NAME = "name"
        const val KEY_DATE = "date"
        const val KEY_COMMENT = "comment"
        const val KEY_ICON_RES_ID = "iconResId"

        fun newInstance (argName : String?, argDate : String?, argComment : String?, argIcon : Int?) : ReviewsFragment {
            val args = bundleOf(
                KEY_NAME to argName,
                KEY_DATE to argDate,
                KEY_COMMENT to argComment,
                KEY_ICON_RES_ID to argIcon
            )
            val fragment = ReviewsFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentReviewsBinding.bind(view)
        val name = arguments?.getString(ReviewsFragment.KEY_NAME)
        val date = arguments?.getString(ReviewsFragment.KEY_DATE)
        val comment = arguments?.getString(ReviewsFragment.KEY_COMMENT)
        val iconResId = arguments?.getInt(ReviewsFragment.KEY_ICON_RES_ID)

        binding.rvReview.layoutManager = LinearLayoutManager(requireContext())
        binding.rvReview.adapter = ReviewAdapter(DataSource.reviews) {
            (activity as MainActivity).navigateToFragment(
                ReviewsFragment.newInstance(name, date, comment, iconResId)
            )
        }
    }
}