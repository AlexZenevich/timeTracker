package com.example.timetrackerfortraining.addTimer

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.timetrackerfortraining.R
import com.example.timetrackerfortraining.databinding.FragmentAddTimerBinding

class AddTimerFragment : Fragment() {
    private lateinit var binding: FragmentAddTimerBinding

    private lateinit var viewModel: AddTimerViewModel
    val firstCategoryList = listOf("Work","Personal","Other")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddTimerBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ArrayAdapter(requireContext(), R.layout.list_item, firstCategoryList)
        binding.firstCategoryInput.setAdapter(adapter)
    }

}