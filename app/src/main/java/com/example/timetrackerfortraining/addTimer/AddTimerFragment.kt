package com.example.timetrackerfortraining.addTimer

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.timetrackerfortraining.R

class AddTimerFragment : Fragment() {

    companion object {
        fun newInstance() = AddTimerFragment()
    }

    private lateinit var viewModel: AddTimerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_timer, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddTimerViewModel::class.java)
        // TODO: Use the ViewModel
    }

}