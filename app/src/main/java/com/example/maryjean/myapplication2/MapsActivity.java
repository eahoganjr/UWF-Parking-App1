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
    LatLng UWF = new LatLng(30.547969, -87.217352);
    LatLng Lot_A = new LatLng(30.544987, -87.219775);
    LatLng Lot_B = new LatLng(30.543522, -87.220311);
    LatLng Lot_C = new LatLng(30.543319, -87.221749);
    LatLng Lot_E = new LatLng(30.544668, -87.223117);
    LatLng Lot_F = new LatLng(30.549048, -87.222581);
    LatLng Lot_G = new LatLng(30.550041, -87.221859);
    LatLng Lot_H = new LatLng(30.549267, -87.219987);
    LatLng Lot_I = new LatLng(30.547984, -87.220890);
    LatLng Lot_J = new LatLng(30.546442, -87.219409);
    LatLng Lot_K = new LatLng(30.547699, -87.218057);
    LatLng Lot_L = new LatLng(30.546147, -87.218561);
    LatLng Lot_M = new LatLng(30.545436, -87.215868);
    LatLng Lot_O = new LatLng(30.547090, -87.215353);
    LatLng Lot_P = new LatLng(30.548116, -87.215031);
    LatLng Lot_Q = new LatLng(30.549964, -87.214462);
    LatLng Lot_R = new LatLng(30.550343, -87.215116);
    LatLng Lot_S = new LatLng(30.551811, -87.214926);
    LatLng Lot_T = new LatLng(30.552176, -87.215511);
    LatLng Lot_U = new LatLng(30.553151, -87.216552);
    LatLng Lot_V = new LatLng(30.553133, -87.217915);
    LatLng Lot_W = new LatLng(30.553877, -87.217196);
    LatLng Lot_X = new LatLng(30.554759, -87.217545);
    LatLng Lot_Y = new LatLng(30.546779, -87.213681);
    LatLng Lot_Z = new LatLng(30.545818, -87.213370);
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

        mMap.addMarker(new MarkerOptions().position(UWF).title("Marker at UWF"));

        mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));

        mMap.addMarker(new MarkerOptions().position(Lot_B).title("Lot B"));

        mMap.addMarker(new MarkerOptions().position(Lot_C).title("Lot C"));

        mMap.addMarker(new MarkerOptions().position(Lot_E).title("Lot E"));

        mMap.addMarker(new MarkerOptions().position(Lot_F).title("Lot F"));

        mMap.addMarker(new MarkerOptions().position(Lot_G).title("Lot G"));

        mMap.addMarker(new MarkerOptions().position(Lot_H).title("Lot H"));

        mMap.addMarker(new MarkerOptions().position(Lot_I).title("Lot I"));

        mMap.addMarker(new MarkerOptions().position(Lot_J).title("Lot J"));

        mMap.addMarker(new MarkerOptions().position(Lot_K).title("Lot K"));

        mMap.addMarker(new MarkerOptions().position(Lot_L).title("Lot L"));

        mMap.addMarker(new MarkerOptions().position(Lot_M).title("Lot M"));

        mMap.addMarker(new MarkerOptions().position(Lot_O).title("Lot O"));

        mMap.addMarker(new MarkerOptions().position(Lot_P).title("Lot P"));

        mMap.addMarker(new MarkerOptions().position(Lot_Q).title("Lot Q"));

        mMap.addMarker(new MarkerOptions().position(Lot_R).title("Lot R"));

        mMap.addMarker(new MarkerOptions().position(Lot_S).title("Lot S"));

        mMap.addMarker(new MarkerOptions().position(Lot_T).title("Lot T"));

        mMap.addMarker(new MarkerOptions().position(Lot_U).title("Lot U"));

        mMap.addMarker(new MarkerOptions().position(Lot_V).title("Lot V"));

        mMap.addMarker(new MarkerOptions().position(Lot_W).title("Lot W"));

        mMap.addMarker(new MarkerOptions().position(Lot_X).title("Lot X"));

        mMap.addMarker(new MarkerOptions().position(Lot_Y).title("Lot Y"));

        mMap.addMarker(new MarkerOptions().position(Lot_Z).title("Lot Z"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(UWF));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(UWF,15));
    }

    public void lotA(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }

    public void lotB(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_B,17));
    }
    public void lotC(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_C,17));
    }
    public void lotE(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_E,17));
    }
    public void lotF(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_F,17));
    }
    public void lotG(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_G,17));
    }
    public void lotH(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_H,17));
    }
    public void lotI(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_I,17));
    }
    public void lotJ(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_J,17));
    }
    public void lotK(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_K,17));
    }
    public void lotL(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_L,17));
    }
    public void lotM(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotO(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotP(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotQ(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotR(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotS(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotT(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotU(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotV(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotW(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotX(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotY(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotZ(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
}
