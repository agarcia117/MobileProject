package com.example.locationnotification


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.locationnotification.databinding.FragmentEventListBinding


class EventListFragment : Fragment() {
    val eventTitles = mutableListOf<CalEvent>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentEventListBinding>(inflater, R.layout.fragment_event_list,container,false)
        binding.createEventButton.setOnClickListener {createEvent(binding)}
        binding.eventList.layoutManager = LinearLayoutManager(context)
        binding.eventList.adapter = RecyclerAdapter(binding)
        return binding.root
    }
    @SuppressLint("NewApi")
    fun createEvent(binding: FragmentEventListBinding) {
        eventTitles.add(CalEvent(binding.editTextTitle.toString(), binding.editTextDate.toString(), binding.timeChooser.hour.toString() + ":" + binding.timeChooser.minute.toString(), "Somewhre"))
    }

}
