package com.example.timetrackerfortraining.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.timetrackerfortraining.R
import com.example.timetrackerfortraining.databinding.ActivityTimerViewBinding

class TimerAdapter: RecyclerView.Adapter<TimerAdapter.TimerHolder>() {
    val timerList = mutableListOf<Timer>()
    class TimerHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = ActivityTimerViewBinding.bind(item)
        fun bind(timer: Timer) = with(binding){
            timerNameTV.text = timer.name
            timerTimeTV.text = timer.timerTime.toString()
            firstCategoryTV.text = timer.firstCategory
            secondCategoryTV.text = timer.secondCategory
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimerHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_timer_view, parent, false)
        return TimerHolder(view)
    }

    override fun getItemCount(): Int {
        return timerList.size
    }

    override fun onBindViewHolder(holder: TimerHolder, position: Int) {
        holder.bind(timerList[position])
    }

    fun addTimer(timer: Timer){
        timerList.add(timer)
        notifyItemChanged(timerList.size-1)
    }
}