package com.example.bayanae.googlemapsb;

import com.google.android.gms.maps.model.MarkerOptions;


class Aks {

    //عیره ش لازمه چون  دمانهه وی  یک لیستی  شخصی سازی شده اضافه بکه ین

    private MarkerOptions markerOptions;
    private int id_pic;
    private String info;

    public Aks(MarkerOptions markerOptions, int id_pic, String info) {
        this.markerOptions = markerOptions;
        this.id_pic = id_pic;
        this.info = info;
    }


    public MarkerOptions getMarkerOptions() {
        return markerOptions;
    }

    public void setMarkerOptions(MarkerOptions markerOptions) {
        this.markerOptions = markerOptions;
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
