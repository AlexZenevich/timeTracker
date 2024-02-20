package com.example.timetrackerfortraining.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.timetrackerfortraining.R
import com.example.timetrackerfortraining.data.Timer
import com.example.timetrackerfortraining.data.TimerAdapter
import com.example.timetrackerfortraining.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private val adapter = TimerAdapter()
    private var name = 0
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }
    private fun init(){
        binding.apply {
            recyclerViewTimer.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            recyclerViewTimer.adapter = adapter
            button3.setOnClickListener {
                val timer = Timer("name${name++}", "work", "something")
                adapter.addTimer(timer)
                println(adapter.timerList.joinToString())
            }
        }
    }
}