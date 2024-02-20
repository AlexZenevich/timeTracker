package com.example.timetrackerfortraining.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.timetrackerfortraining.data.Timer
import com.example.timetrackerfortraining.data.TimerAdapter
import com.example.timetrackerfortraining.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = TimerAdapter()
    private var name = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.apply {
            recyclerViewTimer.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            recyclerViewTimer.adapter = adapter
            button3.setOnClickListener {
                val timer = Timer("name${name++}", "work", "something")
                adapter.addTimer(timer)
                println(adapter.timerList.joinToString())
            }
        }
    }
}