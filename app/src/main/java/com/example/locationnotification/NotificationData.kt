package com.example.locationnotification

import com.google.android.gms.maps.model.LatLng
import java.util.*

data class NotificationData (
    private var location : LatLng,
    private var time : Calendar,
    private var message : String) {

    // location : LatLng(0,0) latitude and longitude from google maps
    // time : uses Calendar API which is basically the same thing as timestamp - i think
    // message : the notification message we will store when user is at specific time and location
}