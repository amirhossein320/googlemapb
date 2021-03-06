package com.example.bayanae.googlemapsb;

import com.google.android.gms.maps.model.MarkerOptions;


class Aks {

    private MarkerOptions markerOptions;
    private int id_pic;
    private String info;
    private String title;


    public Aks(MarkerOptions markerOptions, String title, int id_pic, String info) {
        this.markerOptions = markerOptions;
        this.title = title;
        this.id_pic = id_pic;
        this.info = info;
    }


    public MarkerOptions getMarkerOptions() {
        return markerOptions;
    }

    public void setMarkerOptions(MarkerOptions markerOptions) {
        this.markerOptions = markerOptions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId_pic() {
        return id_pic;
    }

    public void setId_pic(int id_pic) {
        this.id_pic = id_pic;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
