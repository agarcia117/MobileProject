package com.example.locationnotification

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.text_event_item_view.view.*

class RecyclerAdapter : RecyclerView.Adapter<ViewHolder>(){

    val eventTitles = listOf<String>("Testing", "Run 1 mile", "Run 1 mile", "Run 1 mile", "Run 1 mile", "Run 1 mile")
    val eventDates = listOf<String>("11/12/20", "11/20/20", "11/31/20", "12/1/20", "12/12/20", "12/16/20")
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
        val eventDate = eventDates.get(position)
        holder.itemView.event_title.text = eventTitle
        holder.itemView.date.text = eventDate
        holder.itemView.setOnClickListener {view : View -> view.findNavController().navigate(R.id.action_eventListFragment_to_viewEventFragment)}
    }

}

class ViewHolder(v: View): RecyclerView.ViewHolder(v){
}