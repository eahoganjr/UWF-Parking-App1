package com.example.maryjean.myapplication2;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.maps.android.kml.KmlLayer;

import org.xmlpull.v1.XmlPullParserException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, ActivityCompat.OnRequestPermissionsResultCallback {

    private GoogleMap mMap;
    private final int MIN = 0;
    private final int GREEN = 60;
    private final int YELLOW = 85;
    private final int RED = 100;

    //private ArrayList<Integer> lotStats = new ArrayList<Integer>();

    private int lotastat = 50;
    private int lotbstat = 50;
    private int lotcstat = 50;
    private int lotestat = 50;
    private int lotfstat = 50;
    private int lotgstat = 50;
    private int lothstat = 50;
    private int lotistat = 50;
    private int lotjstat = 50;
    private int lotkstat = 50;
    private int lotlstat = 50;
    private int lotmstat = 50;
    private int lotostat = 50;
    private int lotpstat = 50;
    private int lotqstat = 50;
    private int lotrstat = 50;
    private int lotsstat = 50;
    private int lottstat = 50;
    private int lotustat = 50;
    private int lotvstat = 50;
    private int lotwstat = 50;
    private int lotxstat = 50;
    private int lotystat = 50;
    private int lotzstat = 50;
    public String[] lotnames = {"lota.txt",
            "lotb.txt",
            "lotc.txt",
            "lote.txt",
            "lotf.txt",
            "lotg.txt",
            "loth.txt",
            "loti.txt",
            "lotj.txt",
            "lotk.txt",
            "lotl.txt",
            "lotm.txt",
            "loto.txt",
            "lotp.txt",
            "lotq.txt",
            "lotr.txt",
            "lots.txt",
            "lott.txt",
            "lotu.txt",
            "lotv.txt",
            "lotw.txt",
            "lotx.txt",
            "loty.txt",
            "lotz.txt"
    };

    Button buttonA, buttonB, buttonC, buttonE, buttonF, buttonG,
            buttonH, buttonI, buttonJ, buttonK, buttonL, buttonM,
            buttonO, buttonP, buttonQ, buttonR, buttonS, buttonT,
            buttonU, buttonV, buttonW, buttonX, buttonY, buttonZ;

    Button buttonA2, buttonB2, buttonC2, buttonE2, buttonF2, buttonG2,
            buttonH2, buttonI2, buttonJ2, buttonK2, buttonL2, buttonM2,
            buttonO2, buttonP2, buttonQ2, buttonR2, buttonS2, buttonT2,
            buttonU2, buttonV2, buttonW2, buttonX2, buttonY2, buttonZ2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


/*   buttonA2 = (Button) findViewById(R.id.button25);
    buttonB2 = (Button) findViewById(R.id.button26);
    buttonC2 = (Button) findViewById(R.id.button27);
    buttonE2 = (Button) findViewById(R.id.button28);
    buttonF2 = (Button) findViewById(R.id.button29);
    buttonG2 = (Button) findViewById(R.id.button30);
    buttonH2 = (Button) findViewById(R.id.button31);
    buttonI2 = (Button) findViewById(R.id.button32);
    buttonJ2 = (Button) findViewById(R.id.button33);
    buttonK2 = (Button) findViewById(R.id.button34);
    buttonL2 = (Button) findViewById(R.id.button35);
    buttonM2 = (Button) findViewById(R.id.button36);
    buttonO2 = (Button) findViewById(R.id.button37);
    buttonP2 = (Button) findViewById(R.id.button38);
    buttonQ2 = (Button) findViewById(R.id.button39);
    buttonR2 = (Button) findViewById(R.id.button40);
    buttonS2 = (Button) findViewById(R.id.button41);
    buttonT2 = (Button) findViewById(R.id.button42);
    buttonU2 = (Button) findViewById(R.id.button43);
    buttonV2 = (Button) findViewById(R.id.button44);
    buttonW2 = (Button) findViewById(R.id.button45);
    buttonX2 = (Button) findViewById(R.id.button46);
    buttonY2 = (Button) findViewById(R.id.button47);
    buttonZ2 = (Button) findViewById(R.id.button48);*/

    Button btn = (Button)findViewById(R.id.editbutton);

    btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapsActivity.this, MainActivity.class));
            }
        });
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

        // mMap.addMarker(new MarkerOptions().position(UWF).title("Marker at UWF"));

        try {
            KmlLayer kmlLayer = new KmlLayer(mMap, R.raw.lots, getApplicationContext());
            //KmlLayer kmlLayera = new KmlLayer(mMap, R.raw.lota, getApplicationContext());
            KmlLayer kmlLayerag = new KmlLayer(mMap, R.raw.lotag, getApplicationContext());
            KmlLayer kmlLayeray = new KmlLayer(mMap, R.raw.lotay, getApplicationContext());
            KmlLayer kmlLayerar = new KmlLayer(mMap, R.raw.lotar, getApplicationContext());

            KmlLayer kmlLayerbg = new KmlLayer(mMap, R.raw.lotbg, getApplicationContext());
            KmlLayer kmlLayerby = new KmlLayer(mMap, R.raw.lotby, getApplicationContext());
            KmlLayer kmlLayerbr = new KmlLayer(mMap, R.raw.lotbr, getApplicationContext());

            KmlLayer kmlLayercg = new KmlLayer(mMap, R.raw.lotcg, getApplicationContext());
            KmlLayer kmlLayercy = new KmlLayer(mMap, R.raw.lotcy, getApplicationContext());
            KmlLayer kmlLayercr = new KmlLayer(mMap, R.raw.lotcr, getApplicationContext());

            KmlLayer kmlLayereg = new KmlLayer(mMap, R.raw.loteg, getApplicationContext());
            KmlLayer kmlLayerey = new KmlLayer(mMap, R.raw.lotey, getApplicationContext());
            KmlLayer kmlLayerer = new KmlLayer(mMap, R.raw.loter, getApplicationContext());

            KmlLayer kmlLayerfg = new KmlLayer(mMap, R.raw.lotfg, getApplicationContext());
            KmlLayer kmlLayerfy = new KmlLayer(mMap, R.raw.lotfy, getApplicationContext());
            KmlLayer kmlLayerfr = new KmlLayer(mMap, R.raw.lotfr, getApplicationContext());

            KmlLayer kmlLayergg = new KmlLayer(mMap, R.raw.lotgg, getApplicationContext());
            KmlLayer kmlLayergy = new KmlLayer(mMap, R.raw.lotgy, getApplicationContext());
            KmlLayer kmlLayergr = new KmlLayer(mMap, R.raw.lotgr, getApplicationContext());

            KmlLayer kmlLayerhg = new KmlLayer(mMap, R.raw.lothg, getApplicationContext());
            KmlLayer kmlLayerhy = new KmlLayer(mMap, R.raw.lothy, getApplicationContext());
            KmlLayer kmlLayerhr = new KmlLayer(mMap, R.raw.lothr, getApplicationContext());

            KmlLayer kmlLayerig = new KmlLayer(mMap, R.raw.lotig, getApplicationContext());
            KmlLayer kmlLayeriy = new KmlLayer(mMap, R.raw.lotiy, getApplicationContext());
            KmlLayer kmlLayerir = new KmlLayer(mMap, R.raw.lotir, getApplicationContext());

            KmlLayer kmlLayerjg = new KmlLayer(mMap, R.raw.lotjg, getApplicationContext());
            KmlLayer kmlLayerjy = new KmlLayer(mMap, R.raw.lotjy, getApplicationContext());
            KmlLayer kmlLayerjr = new KmlLayer(mMap, R.raw.lotjr, getApplicationContext());

            KmlLayer kmlLayerkg = new KmlLayer(mMap, R.raw.lotkg, getApplicationContext());
            KmlLayer kmlLayerky = new KmlLayer(mMap, R.raw.lotky, getApplicationContext());
            KmlLayer kmlLayerkr = new KmlLayer(mMap, R.raw.lotkr, getApplicationContext());

            KmlLayer kmlLayerlg = new KmlLayer(mMap, R.raw.lotlg, getApplicationContext());
            KmlLayer kmlLayerly = new KmlLayer(mMap, R.raw.lotly, getApplicationContext());
            KmlLayer kmlLayerlr = new KmlLayer(mMap, R.raw.lotlr, getApplicationContext());

            KmlLayer kmlLayermg = new KmlLayer(mMap, R.raw.lotmg, getApplicationContext());
            KmlLayer kmlLayermy = new KmlLayer(mMap, R.raw.lotmy, getApplicationContext());
            KmlLayer kmlLayermr = new KmlLayer(mMap, R.raw.lotmr, getApplicationContext());

            KmlLayer kmlLayerog = new KmlLayer(mMap, R.raw.lotog, getApplicationContext());
            KmlLayer kmlLayeroy = new KmlLayer(mMap, R.raw.lotoy, getApplicationContext());
            KmlLayer kmlLayeror = new KmlLayer(mMap, R.raw.lotor, getApplicationContext());

            KmlLayer kmlLayerpg = new KmlLayer(mMap, R.raw.lotpg, getApplicationContext());
            KmlLayer kmlLayerpy = new KmlLayer(mMap, R.raw.lotpy, getApplicationContext());
            KmlLayer kmlLayerpr = new KmlLayer(mMap, R.raw.lotpr, getApplicationContext());

            KmlLayer kmlLayerqg = new KmlLayer(mMap, R.raw.lotqg, getApplicationContext());
            KmlLayer kmlLayerqy = new KmlLayer(mMap, R.raw.lotqy, getApplicationContext());
            KmlLayer kmlLayerqr = new KmlLayer(mMap, R.raw.lotqr, getApplicationContext());

            KmlLayer kmlLayerrg = new KmlLayer(mMap, R.raw.lotrg, getApplicationContext());
            KmlLayer kmlLayerry = new KmlLayer(mMap, R.raw.lotry, getApplicationContext());
            KmlLayer kmlLayerrr = new KmlLayer(mMap, R.raw.lotrr, getApplicationContext());

            KmlLayer kmlLayersg = new KmlLayer(mMap, R.raw.lotsg, getApplicationContext());
            KmlLayer kmlLayersy = new KmlLayer(mMap, R.raw.lotsy, getApplicationContext());
            KmlLayer kmlLayersr = new KmlLayer(mMap, R.raw.lotsr, getApplicationContext());

            KmlLayer kmlLayertg = new KmlLayer(mMap, R.raw.lottg, getApplicationContext());
            KmlLayer kmlLayerty = new KmlLayer(mMap, R.raw.lotty, getApplicationContext());
            KmlLayer kmlLayertr = new KmlLayer(mMap, R.raw.lottr, getApplicationContext());

            KmlLayer kmlLayerug = new KmlLayer(mMap, R.raw.lotug, getApplicationContext());
            KmlLayer kmlLayeruy = new KmlLayer(mMap, R.raw.lotuy, getApplicationContext());
            KmlLayer kmlLayerur = new KmlLayer(mMap, R.raw.lotur, getApplicationContext());

            KmlLayer kmlLayervg = new KmlLayer(mMap, R.raw.lotvg, getApplicationContext());
            KmlLayer kmlLayervy = new KmlLayer(mMap, R.raw.lotvy, getApplicationContext());
            KmlLayer kmlLayervr = new KmlLayer(mMap, R.raw.lotvr, getApplicationContext());

            KmlLayer kmlLayerwg = new KmlLayer(mMap, R.raw.lotwg, getApplicationContext());
            KmlLayer kmlLayerwy = new KmlLayer(mMap, R.raw.lotwy, getApplicationContext());
            KmlLayer kmlLayerwr = new KmlLayer(mMap, R.raw.lotwr, getApplicationContext());

            KmlLayer kmlLayerxg = new KmlLayer(mMap, R.raw.lotxg, getApplicationContext());
            KmlLayer kmlLayerxy = new KmlLayer(mMap, R.raw.lotxy, getApplicationContext());
            KmlLayer kmlLayerxr = new KmlLayer(mMap, R.raw.lotxr, getApplicationContext());

            KmlLayer kmlLayeryg = new KmlLayer(mMap, R.raw.lotyg, getApplicationContext());
            KmlLayer kmlLayeryy = new KmlLayer(mMap, R.raw.lotyy, getApplicationContext());
            KmlLayer kmlLayeryr = new KmlLayer(mMap, R.raw.lotyr, getApplicationContext());

            KmlLayer kmlLayerzg = new KmlLayer(mMap, R.raw.lotzg, getApplicationContext());
            KmlLayer kmlLayerzy = new KmlLayer(mMap, R.raw.lotzy, getApplicationContext());
            KmlLayer kmlLayerzr = new KmlLayer(mMap, R.raw.lotzr, getApplicationContext());


            /*KmlLayer kmlLayerb = new KmlLayer(mMap, R.raw.lotb, getApplicationContext());
            KmlLayer kmlLayerc = new KmlLayer(mMap, R.raw.lotc, getApplicationContext());
            KmlLayer kmlLayere = new KmlLayer(mMap, R.raw.lote, getApplicationContext());
            KmlLayer kmlLayerf = new KmlLayer(mMap, R.raw.lotf, getApplicationContext());
            KmlLayer kmlLayerg = new KmlLayer(mMap, R.raw.lotg, getApplicationContext());
            KmlLayer kmlLayerh = new KmlLayer(mMap, R.raw.loth, getApplicationContext());
            KmlLayer kmlLayeri = new KmlLayer(mMap, R.raw.loti, getApplicationContext());
            KmlLayer kmlLayerj = new KmlLayer(mMap, R.raw.lotj, getApplicationContext());
            KmlLayer kmlLayerk = new KmlLayer(mMap, R.raw.lotk, getApplicationContext());
            KmlLayer kmlLayerl = new KmlLayer(mMap, R.raw.lotl, getApplicationContext());
            KmlLayer kmlLayerm = new KmlLayer(mMap, R.raw.lotm, getApplicationContext());
            KmlLayer kmlLayero = new KmlLayer(mMap, R.raw.loto, getApplicationContext());
            KmlLayer kmlLayerp = new KmlLayer(mMap, R.raw.lotp, getApplicationContext());
            KmlLayer kmlLayerq = new KmlLayer(mMap, R.raw.lotq, getApplicationContext());
            KmlLayer kmlLayerr = new KmlLayer(mMap, R.raw.lotr, getApplicationContext());
            KmlLayer kmlLayers = new KmlLayer(mMap, R.raw.lots, getApplicationContext());
            KmlLayer kmlLayert = new KmlLayer(mMap, R.raw.lott, getApplicationContext());
            KmlLayer kmlLayeru = new KmlLayer(mMap, R.raw.lotu, getApplicationContext());
            KmlLayer kmlLayerv = new KmlLayer(mMap, R.raw.lotv, getApplicationContext());
            KmlLayer kmlLayerw = new KmlLayer(mMap, R.raw.lotw, getApplicationContext());
            KmlLayer kmlLayerx = new KmlLayer(mMap, R.raw.lotx, getApplicationContext());
            KmlLayer kmlLayery = new KmlLayer(mMap, R.raw.loty, getApplicationContext());
            KmlLayer kmlLayerz = new KmlLayer(mMap, R.raw.lotz, getApplicationContext()); */

            kmlLayer.addLayerToMap();

            readPercents();

            //kmlLayera.addLayerToMap();
            if(MIN <= lotastat && lotastat < GREEN)
                kmlLayerag.addLayerToMap();
            else if(GREEN <= lotastat && lotastat < YELLOW)
                kmlLayeray.addLayerToMap();
            else if(YELLOW <= lotastat && lotastat <= RED)
                kmlLayerar.addLayerToMap();

            if(MIN <= lotbstat && lotbstat < GREEN)
                kmlLayerbg.addLayerToMap();
            else if(GREEN <= lotbstat && lotbstat < YELLOW)
                kmlLayerby.addLayerToMap();
            else if(YELLOW <= lotbstat && lotbstat <= RED)
                kmlLayerbr.addLayerToMap();

            if(MIN <= lotcstat && lotcstat < GREEN)
                kmlLayercg.addLayerToMap();
            else if(GREEN <= lotcstat && lotcstat < YELLOW)
                kmlLayercy.addLayerToMap();
            else if(YELLOW <= lotcstat && lotcstat <= RED)
                kmlLayercr.addLayerToMap();

            if(MIN <= lotestat && lotestat < GREEN)
                kmlLayereg.addLayerToMap();
            else if(GREEN <= lotestat && lotestat < YELLOW)
                kmlLayerey.addLayerToMap();
            else if(YELLOW <= lotestat && lotestat <= RED)
                kmlLayerer.addLayerToMap();

            if(MIN <= lotfstat && lotfstat < GREEN)
                kmlLayerfg.addLayerToMap();
            else if(GREEN <= lotfstat && lotfstat < YELLOW)
                kmlLayerfy.addLayerToMap();
            else if(YELLOW <= lotfstat && lotfstat <= RED)
                kmlLayerfr.addLayerToMap();

            if(MIN <= lotgstat && lotgstat < GREEN)
                kmlLayergg.addLayerToMap();
            else if(GREEN <= lotgstat && lotgstat < YELLOW)
                kmlLayergy.addLayerToMap();
            else if(YELLOW <= lotgstat && lotgstat <= RED)
                kmlLayergr.addLayerToMap();

            if(MIN <= lothstat && lothstat < GREEN)
                kmlLayerhg.addLayerToMap();
            else if(GREEN <= lothstat && lothstat < YELLOW)
                kmlLayerhy.addLayerToMap();
            else if(YELLOW <= lothstat && lothstat <= RED)
                kmlLayerhr.addLayerToMap();

            if(MIN <= lotistat && lotistat < GREEN)
                kmlLayerig.addLayerToMap();
            else if(GREEN <= lotistat && lotistat < YELLOW)
                kmlLayeriy.addLayerToMap();
            else if(YELLOW <= lotistat && lotistat <= RED)
                kmlLayerir.addLayerToMap();

            if(MIN <= lotjstat && lotjstat < GREEN)
                kmlLayerjg.addLayerToMap();
            else if(GREEN <= lotjstat && lotjstat < YELLOW)
                kmlLayerjy.addLayerToMap();
            else if(YELLOW <= lotjstat && lotjstat <= RED)
                kmlLayerjr.addLayerToMap();

            if(MIN <= lotkstat && lotkstat < GREEN)
                kmlLayerkg.addLayerToMap();
            else if(GREEN <= lotkstat && lotkstat < YELLOW)
                kmlLayerky.addLayerToMap();
            else if(YELLOW <= lotkstat && lotkstat <= RED)
                kmlLayerkr.addLayerToMap();

            if(MIN <= lotlstat && lotlstat < GREEN)
                kmlLayerlg.addLayerToMap();
            else if(GREEN <= lotlstat && lotlstat < YELLOW)
                kmlLayerly.addLayerToMap();
            else if(YELLOW <= lotlstat && lotlstat <= RED)
                kmlLayerlr.addLayerToMap();

            if(MIN <= lotmstat && lotmstat < GREEN)
                kmlLayermg.addLayerToMap();
            else if(GREEN <= lotmstat && lotmstat < YELLOW)
                kmlLayermy.addLayerToMap();
            else if(YELLOW <= lotmstat && lotmstat <= RED)
                kmlLayermr.addLayerToMap();

            if(MIN <= lotostat && lotostat < GREEN)
                kmlLayerog.addLayerToMap();
            else if(GREEN <= lotostat && lotostat < YELLOW)
                kmlLayeroy.addLayerToMap();
            else if(YELLOW <= lotostat && lotostat <= RED)
                kmlLayeror.addLayerToMap();

            if(MIN <= lotpstat && lotpstat < GREEN)
                kmlLayerpg.addLayerToMap();
            else if(GREEN <= lotpstat && lotpstat < YELLOW)
                kmlLayerpy.addLayerToMap();
            else if(YELLOW <= lotpstat && lotpstat <= RED)
                kmlLayerpr.addLayerToMap();

            if(MIN <= lotwstat && lotwstat < GREEN)
                kmlLayerqg.addLayerToMap();
            else if(GREEN <= lotwstat && lotwstat < YELLOW)
                kmlLayerqy.addLayerToMap();
            else if(YELLOW <= lotwstat && lotwstat <= RED)
                kmlLayerqr.addLayerToMap();

            if(MIN <= lotxstat && lotxstat < GREEN)
                kmlLayerrg.addLayerToMap();
            else if(GREEN <= lotxstat && lotxstat < YELLOW)
                kmlLayerry.addLayerToMap();
            else if(YELLOW <= lotxstat && lotxstat <= RED)
                kmlLayerrr.addLayerToMap();

            if(MIN <= lotystat && lotystat < GREEN)
                kmlLayersg.addLayerToMap();
            else if(GREEN <= lotystat && lotystat < YELLOW)
                kmlLayersy.addLayerToMap();
            else if(YELLOW <= lotystat && lotystat <= RED)
                kmlLayersr.addLayerToMap();

            if(MIN <= lotzstat && lotzstat < GREEN)
                kmlLayertg.addLayerToMap();
            else if(GREEN <= lotzstat && lotzstat < YELLOW)
                kmlLayerty.addLayerToMap();
            else if(YELLOW <= lotzstat && lotzstat <= RED)
                kmlLayertr.addLayerToMap();

            if(MIN <= lotastat && lotastat < GREEN)
                kmlLayerug.addLayerToMap();
            else if(GREEN <= lotastat && lotastat < YELLOW)
                kmlLayeruy.addLayerToMap();
            else if(YELLOW <= lotastat && lotastat <= RED)
                kmlLayerur.addLayerToMap();

            if(MIN <= lotastat && lotastat < GREEN)
                kmlLayervg.addLayerToMap();
            else if(GREEN <= lotastat && lotastat < YELLOW)
                kmlLayervy.addLayerToMap();
            else if(YELLOW <= lotastat && lotastat <= RED)
                kmlLayervr.addLayerToMap();

            if(MIN <= lotastat && lotastat < GREEN)
                kmlLayerwg.addLayerToMap();
            else if(GREEN <= lotastat && lotastat < YELLOW)
                kmlLayerwy.addLayerToMap();
            else if(YELLOW <= lotastat && lotastat <= RED)
                kmlLayerwr.addLayerToMap();

            if(MIN <= lotastat && lotastat < GREEN)
                kmlLayerxg.addLayerToMap();
            else if(GREEN <= lotastat && lotastat < YELLOW)
                kmlLayerxy.addLayerToMap();
            else if(YELLOW <= lotastat && lotastat <= RED)
                kmlLayerxr.addLayerToMap();

            if(MIN <= lotastat && lotastat < GREEN)
                kmlLayeryg.addLayerToMap();
            else if(GREEN <= lotastat && lotastat < YELLOW)
                kmlLayeryy.addLayerToMap();
            else if(YELLOW <= lotastat && lotastat <= RED)
                kmlLayeryr.addLayerToMap();

            if(MIN <= lotzstat && lotzstat < GREEN)
                kmlLayerzg.addLayerToMap();
            else if(GREEN <= lotzstat && lotzstat < YELLOW)
                kmlLayerzy.addLayerToMap();
            else if(YELLOW <= lotzstat && lotzstat <= RED)
                kmlLayerzr.addLayerToMap();




            /* kmlLayerb.addLayerToMap();
            kmlLayerc.addLayerToMap();
            kmlLayere.addLayerToMap();
            kmlLayerf.addLayerToMap();
            kmlLayerg.addLayerToMap();
            kmlLayerh.addLayerToMap();
            kmlLayeri.addLayerToMap();
            kmlLayerj.addLayerToMap();
            kmlLayerk.addLayerToMap();
            kmlLayerl.addLayerToMap();
            kmlLayerm.addLayerToMap();
            kmlLayero.addLayerToMap();
            kmlLayerp.addLayerToMap();
            kmlLayerq.addLayerToMap();
            kmlLayerr.addLayerToMap();
            kmlLayers.addLayerToMap();
            kmlLayert.addLayerToMap();
            kmlLayeru.addLayerToMap();
            kmlLayerv.addLayerToMap();
            kmlLayerw.addLayerToMap();
            kmlLayerx.addLayerToMap();
            kmlLayery.addLayerToMap();
            kmlLayerz.addLayerToMap(); */

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }

/*      mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
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
        mMap.addMarker(new MarkerOptions().position(Lot_Z).title("Lot Z"));*/

        mMap.moveCamera(CameraUpdateFactory.newLatLng(UWF));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(UWF, 15));
    }

    public void setLotAStat(int percent) {
        this.lotastat = percent;
    }



    public void readPercents() {
        ArrayList<Integer> lotnameslist = new ArrayList<Integer>();
        for(int i=0; i<lotnames.length; i++) {
            Scanner reader;
            try {
                reader = new Scanner(new FileInputStream(lotnames[i]));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            int j = reader.nextInt();
            reader.close();
            lotnameslist.add(j);

        }
        lotastat = lotnameslist.remove(0);
        lotbstat = lotnameslist.remove(0);
        lotcstat = lotnameslist.remove(0);
        lotestat = lotnameslist.remove(0);
        lotfstat = lotnameslist.remove(0);
        lotgstat = lotnameslist.remove(0);
        lothstat = lotnameslist.remove(0);
        lotistat = lotnameslist.remove(0);
        lotjstat = lotnameslist.remove(0);
        lotkstat = lotnameslist.remove(0);
        lotlstat = lotnameslist.remove(0);
        lotmstat = lotnameslist.remove(0);
        lotostat = lotnameslist.remove(0);
        lotpstat = lotnameslist.remove(0);
        lotqstat = lotnameslist.remove(0);
        lotrstat = lotnameslist.remove(0);
        lotsstat = lotnameslist.remove(0);
        lottstat = lotnameslist.remove(0);
        lotustat = lotnameslist.remove(0);
        lotvstat = lotnameslist.remove(0);
        lotwstat = lotnameslist.remove(0);
        lotxstat = lotnameslist.remove(0);
        lotystat = lotnameslist.remove(0);
        lotzstat = lotnameslist.remove(0);
    }










    public void home() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(UWF, 15));
    }

    public void lotA() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A, 17));
    }

    public void lotB() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_B, 17));
    }

    public void lotC() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_C, 17));
    }

    public void lotE() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_E, 17));
    }

    public void lotF() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_F, 17));
    }

    public void lotG() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_G, 17));
    }

    public void lotH() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_H, 17));
    }

    public void lotI() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_I, 17));
    }

    public void lotJ() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_J, 17));
    }

    public void lotK() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_K, 17));
    }

    public void lotL() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_L, 17));
    }

    public void lotM() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_M, 17));
    }

    public void lotO() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_O, 17));
    }

    public void lotP() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_P, 17));
    }

    public void lotQ() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_Q, 17));
    }

    public void lotR() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_R, 17));
    }

    public void lotS() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_S, 17));
    }

    public void lotT() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_T, 17));
    }

    public void lotU() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_U, 17));
    }

    public void lotV() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_V, 17));
    }

    public void lotW() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_W, 17));
    }

    public void lotX() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_X, 17));
    }

    public void lotY() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_Y, 17));
    }

    public void lotZ() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_Z, 17));
    }

    protected GoogleMap getMap() {
        return mMap;
    }

}
