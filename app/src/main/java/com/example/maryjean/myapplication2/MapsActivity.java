package com.example.maryjean.myapplication2;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Button buttonA,buttonB,buttonC,buttonE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    buttonA = (Button) findViewById(R.id.button1);
    buttonB = (Button) findViewById(R.id.button2);
    buttonC = (Button) findViewById(R.id.button3);
    buttonE = (Button) findViewById(R.id.button4);

    buttonA.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                lotA(mMap);
            }
        }
    );
    buttonB.setOnClickListener(new View.OnClickListener()
                                   {
                                       public void onClick(View v)
                                       {
                                           lotB(mMap);
                                       }
                                   }
        );
    buttonC.setOnClickListener(new View.OnClickListener()
                                   {
                                       public void onClick(View v)
                                       {
                                           lotC(mMap);
                                       }
                                   }
        );
    buttonE.setOnClickListener(new View.OnClickListener()
                                   {
                                       public void onClick(View v)
                                       {
                                           lotE(mMap);
                                       }
                                   }
        );
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

        mMap = googleMap;
        LatLng Lot_A = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotB(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_B = new LatLng(30.543522, -87.220311);
        mMap.addMarker(new MarkerOptions().position(Lot_B).title("Lot B"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_B));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_B,17));
    }
    public void lotC(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_C = new LatLng(30.543319, -87.221749);
        mMap.addMarker(new MarkerOptions().position(Lot_C).title("Lot C"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_C));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_C,17));
    }
    public void lotE(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_E = new LatLng(30.544668, -87.223117);
        mMap.addMarker(new MarkerOptions().position(Lot_E).title("Lot E"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_E));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_E,17));
    }
    public void lotF(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_F = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_F).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_F));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_F,17));
    }
    public void lotG(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_G = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_G).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_G));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_G,17));
    }
    public void lotH(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_H = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_H).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_H));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_H,17));
    }
    public void lotI(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_I = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_I).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_I));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_I,17));
    }
    public void lotJ(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_J = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_J).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_J));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_J,17));
    }
    public void lotK(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_K = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_K).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_K));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_K,17));
    }
    public void lotL(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_L = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_L).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_L));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_L,17));
    }
    public void lotM(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_A = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotO(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_A = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotP(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_A = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotQ(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_A = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotR(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_A = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotS(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_A = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotT(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_A = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotU(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_A = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotV(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_A = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotW(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_A = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotX(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_A = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotY(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_A = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotZ(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng Lot_A = new LatLng(30.544987, -87.219775);
        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot_A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
}
