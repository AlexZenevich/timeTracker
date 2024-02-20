package com.example.timetrackerfortraining.allTimers

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.timetrackerfortraining.R

class AllTimersFragment : Fragment() {

    companion object {
        fun newInstance() = AllTimersFragment()
    }

    private lateinit var viewModel: AllTimersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_all_timers, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AllTimersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}