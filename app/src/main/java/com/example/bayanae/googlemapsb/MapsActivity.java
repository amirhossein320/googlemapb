package com.example.bayanae.googlemapsb;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
     * we just add a marker near Mahabad, Iran.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        // Add a marker in Mahabad and move the camera
        LatLng Mahabad = new LatLng(36.7659726, 45.6948437);
        mMap.addMarker(new MarkerOptions().position(Mahabad).title("Mahabad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mahabad, 11));

        //makan ek restoran
        LatLng speedar = new LatLng(36.7687816,45.7217992);

        //yek class az  modir makan ha misazim
        MarkerOptions markerOptions = new MarkerOptions();

        //ba  metode  zir makan ro  ezafe mikonim
        markerOptions.position(speedar);

        //ba metode zir  ek aks bray icon  an moshakhs  mikonim
        markerOptions.icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher));

        // in  metod ham makan restoran ro  neshon mide
        mMap.addMarker(markerOptions);


    }
}
