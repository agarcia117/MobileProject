package com.example.locationnotification

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.text_event_item_view.view.*

class RecyclerAdapter : RecyclerView.Adapter<ViewHolder>(){

    val eventTitles = listOf<String>("Testing", "Pick up", "Run 1 mile", "Run 1 mile", "Run 1 mile", "Run 1 mile", "Run 1 mile", "Run 1 mile", "Run 1 mile", "Run 1 mile", "Run 1 mile", "Run 1 mile", "Run 1 mile", "Run 1 mile", "Run 1 mile", "Testing", "Pick up", "Testing", "Pick up", "Testing", "Pick up", "Testing", "Pick up", "Testing", "Pick up", "Testing", "Pick up")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.text_event_item_view, parent, false)
        return ViewHolder(cellForRow)
    }

    override fun getItemCount(): Int {
        return eventTitles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val eventTitle = eventTitles.get(position)
        holder.itemView.event_title.text = eventTitle
    }


}

class ViewHolder(v: View): RecyclerView.ViewHolder(v){
}