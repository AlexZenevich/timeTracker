package com.example.timetrackerfortraining.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.timetrackerfortraining.R
import com.example.timetrackerfortraining.addTimer.AddTimerFragment
import com.example.timetrackerfortraining.data.Timer
import com.example.timetrackerfortraining.data.TimerAdapter
import com.example.timetrackerfortraining.databinding.ActivityMainBinding
import com.example.timetrackerfortraining.report.ReportFragment
import com.example.timetrackerfortraining.settings.SettingsFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = TimerAdapter()
    private var name = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        replaceFragment(MainFragment())
//        init()
        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.homeNavigationButton-> replaceFragment(MainFragment())
                R.id.addNavigationButton-> replaceFragment(AddTimerFragment())
                R.id.reportNavigationButton-> replaceFragment(ReportFragment())
                R.id.settingsNavigationButton-> replaceFragment(SettingsFragment())
                else -> {}
            }
            true
        }
    }
    private fun replaceFragment (fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.frameLayout.id, fragment)
        fragmentTransaction.commit()
    }
//    private fun init(){
//        binding.apply {
//            recyclerViewTimer.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
//            recyclerViewTimer.adapter = adapter
//            button3.setOnClickListener {
//                val timer = Timer("name${name++}", "work", "something")
//                adapter.addTimer(timer)
//                println(adapter.timerList.joinToString())
//            }
//        }
//    }
}