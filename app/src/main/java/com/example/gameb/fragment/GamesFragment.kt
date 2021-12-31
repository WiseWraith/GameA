package com.example.gameb.fragment


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gameb.R
import com.example.gameb.activity.MainActivity
import com.example.gameb.adapter.GameAdapter
import com.example.gameb.data.DataSource
import com.example.gameb.databinding.FragmentGamesBinding

class GamesFragment : Fragment(R.layout.fragment_games) {
    companion object {
        fun NewInstance() = GamesFragment() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentGamesBinding.bind(view)


        binding.rvGames.layoutManager = LinearLayoutManager(requireContext())
        binding.rvGames.adapter = GameAdapter(DataSource.Game) {
            (activity as MainActivity).navigateToFragment(ProductFragment.NewInstance())
        }
        binding.imageProfile.setOnClickListener {
            (activity as MainActivity).navigateToFragment(ProfileFragment.newInstance())
        }
    }
}