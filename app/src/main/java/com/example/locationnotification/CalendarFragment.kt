package com.example.mobileprojectpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.locationnotification.R
import com.example.locationnotification.databinding.FragmentCalendarBinding


class CalendarFragment : Fragment() {
    private lateinit var binding: FragmentCalendarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentCalendarBinding>(inflater, R.layout.fragment_calendar,container,false)
        val calendar: CalendarView = binding.calendarViewMain
        val dateButton: Button = binding.buttonTest
        val textTest: TextView = binding.eventReminderHeader
        binding.buttonTest.setOnClickListener { view : View -> view.findNavController().navigate(R.id.action_calendarFragment_to_eventCreatorFragment) }
        binding.viewEventsButton.setOnClickListener { view : View -> view.findNavController().navigate(R.id.action_calendarFragment_to_eventListFragment) }


        calendar.setOnDateChangeListener { view, year, month, dayOfMonth ->
            val Date = (month + 1).toString() + "-" + dayOfMonth + "-" + year
            textTest.text = Date
        }
        return binding.root
    }
    fun createEvent(){
        val calender: CalendarView = binding.calendarViewMain
    }
}
