package com.example.maryjean.myapplication2;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng UWF = new LatLng(30.547969, -87.217352);
        mMap.addMarker(new MarkerOptions().position(UWF).title("Marker at UWF"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UWF));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(UWF,15));
    }

    public void lotA(GoogleMap googleMap) {

        LatLng Lot_A = new LatLng(30.547697, -87.218028);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
}
