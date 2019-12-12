package com.example.locationnotification


import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.locationnotification.databinding.FragmentEventListBinding


class EventListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentEventListBinding>(inflater, R.layout.fragment_event_list,container,false)
        binding.eventList.layoutManager = LinearLayoutManager(context)
        binding.eventList.adapter = RecyclerAdapter()
        return binding.root
    }


}
