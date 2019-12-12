package com.example.locationnotification


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.locationnotification.databinding.FragmentEventFocusViewBinding

class ViewEventFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentEventFocusViewBinding>(inflater, R.layout.fragment_event_focus_view,container,false)
        return binding.root
    }



}
