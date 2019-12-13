package com.example.locationnotification

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.locationnotification.databinding.FragmentEventListBinding
import kotlinx.android.synthetic.main.text_event_item_view.view.*

class RecyclerAdapter(binding: FragmentEventListBinding) : RecyclerView.Adapter<ViewHolder>(){

    val event1 = CalEvent("my event", "march whatever","10:32:54","ur mums house")
    val event2 = CalEvent("my other event", "november whatever","17:34:01","ur other mums house")
    val eventTitles = mutableListOf<CalEvent>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.text_event_item_view, parent, false)
        return ViewHolder(cellForRow)
    }

    override fun getItemCount(): Int {
        return eventTitles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val eventTitle = eventTitles.get(position)
        holder.itemView.event_title.text = eventTitle.eventname
        holder.itemView.setOnClickListener {view : View -> view.findNavController().navigate(R.id.action_eventListFragment_to_viewEventFragment)}
    }

}

class ViewHolder(v: View): RecyclerView.ViewHolder(v){
}