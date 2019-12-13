package com.example.mobileprojectpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.locationnotification.R
import com.example.locationnotification.databinding.FragmentEventCreatorBinding



class EventCreatorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentEventCreatorBinding>(inflater, R.layout.fragment_event_creator,container,false)
        binding.createEventButton.setOnClickListener { view : View -> view.findNavController().navigate(R.id.action_eventCreatorFragment_to_calendarFragment) }
        return binding.root
    }


}
