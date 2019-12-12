package com.example.locationnotification

import android.graphics.Point

import android.location.LocationListener
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatDialogFragment
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.Button
import com.google.android.gms.maps.model.Marker

class EventsOnMapActivity : AppCompatActivity()/*GoogleMap.OnMapClickListener*/{



    lateinit var mapFragment: SupportMapFragment
    lateinit var googleMap: GoogleMap
    lateinit var locationManager: LocationManager



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.events_on_map)

        mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(OnMapReadyCallback {
            googleMap =it
            googleMap.isMyLocationEnabled = true
            val location1 = LatLng(34.0654221,-118.1684427)
            val location2 = LatLng(34.0640945,-118.1700356)
            val location3 = LatLng(34.0664556,-118.1661484)
            //googleMap.addMarker(MarkerOptions().position(location1).title("My Location").snippet("My House").draggable(true))
            val marker1 : Marker = googleMap.addMarker(MarkerOptions().position(location1).title("android final").snippet("12/13 2:30pm").draggable(true))
            val marker2 : Marker = googleMap.addMarker(MarkerOptions().position(location2).title("Math final").snippet("12/12 3:30pm").draggable(true))
            val marker3 : Marker = googleMap.addMarker(MarkerOptions().position(location3).title("Database final").snippet("12/11 12:30pm").draggable(true))
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location1,16f))
        })


    }

}
