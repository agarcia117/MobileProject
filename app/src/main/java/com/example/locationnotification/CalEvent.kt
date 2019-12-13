package com.example.locationnotification

class CalEvent(val name: String, val date: String, val time: String, val location: String) {
    val eventname: String
    val eventdate: String
    val eventtime: String
    val eventlocation: String
    init{
        eventname = name
        eventdate = date
        eventtime = time
        eventlocation = location
    }

}