package com.example.maryjean.myapplication2;

import android.content.Context;
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
import com.google.maps.android.kml.KmlLayer;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap,gMap;

    Button buttonA,buttonB,buttonC,buttonE,buttonF,buttonG,
            buttonH,buttonI,buttonJ,buttonK,buttonL,buttonM,
            buttonO,buttonP,buttonQ,buttonR,buttonS,buttonT,
            buttonU,buttonV,buttonW,buttonX,buttonY,buttonZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        
/*    buttonA = (Button) findViewById(R.id.button1);
    buttonB = (Button) findViewById(R.id.button2);
    buttonC = (Button) findViewById(R.id.button3);
    buttonE = (Button) findViewById(R.id.button4);
    buttonF = (Button) findViewById(R.id.button5);
    buttonG = (Button) findViewById(R.id.button6);
    buttonH = (Button) findViewById(R.id.button7);
    buttonI = (Button) findViewById(R.id.button8);
    buttonJ = (Button) findViewById(R.id.button9);
    buttonK = (Button) findViewById(R.id.button10);
    buttonL = (Button) findViewById(R.id.button11);
    buttonM = (Button) findViewById(R.id.button12);
    buttonO = (Button) findViewById(R.id.button13);
    buttonP = (Button) findViewById(R.id.button14);
    buttonQ = (Button) findViewById(R.id.button15);
    buttonR = (Button) findViewById(R.id.button16);
    buttonS = (Button) findViewById(R.id.button17);
    buttonT = (Button) findViewById(R.id.button18);
    buttonU = (Button) findViewById(R.id.button19);
    buttonV = (Button) findViewById(R.id.button20);
    buttonW = (Button) findViewById(R.id.button21);
    buttonX = (Button) findViewById(R.id.button22);
    buttonY = (Button) findViewById(R.id.button23);
    buttonZ = (Button) findViewById(R.id.button24);

    buttonA.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                lotA();
            }
        }
    );
    buttonB.setOnClickListener(new View.OnClickListener()
                                   {
                                       public void onClick(View v)
                                       {
                                           lotB();
                                       }
                                   }
        );
    buttonC.setOnClickListener(new View.OnClickListener()
                                   {
                                       public void onClick(View v)
                                       {
                                           lotC();
                                       }
                                   }
        );
    buttonE.setOnClickListener(new View.OnClickListener()
                                   {
                                       public void onClick(View v)
                                       {
                                           lotE();
                                       }
                                   }
        );*/
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

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.addMarker(new MarkerOptions().position(UWF).title("Marker at UWF"));

        try {
            KmlLayer kmlLayer = new KmlLayer(getMap(), R.raw.lots, getApplicationContext());
            kmlLayer.addLayerToMap();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }

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

    public void lotA() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A,17));
    }
    public void lotB() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_B,17));
    }
    public void lotC() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_C,17));
    }
    public void lotE() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_E,17));
    }
    public void lotF() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_F,17));
    }
    public void lotG() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_G,17));
    }
    public void lotH() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_H,17));
    }
    public void lotI() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_I,17));
    }
    public void lotJ() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_J,17));
    }
    public void lotK() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_K,17));
    }
    public void lotL() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_L,17));
    }
    public void lotM() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_M,17));
    }
    public void lotO() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_O,17));
    }
    public void lotP() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_P,17));
    }
    public void lotQ() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_Q,17));
    }
    public void lotR() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_R,17));
    }
    public void lotS() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_S,17));
    }
    public void lotT() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_T,17));
    }
    public void lotU() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_U,17));
    }
    public void lotV() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_V,17));
    }
    public void lotW() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_W,17));
    }
    public void lotX() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_X,17));
    }
    public void lotY() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_Y,17));
    }
    public void lotZ() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_Z,17));
    }

    protected GoogleMap getMap() {
        return mMap;
    }
}