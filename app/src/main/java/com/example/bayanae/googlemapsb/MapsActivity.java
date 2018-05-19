package com.example.bayanae.googlemapsb;

import android.app.AlertDialog;
import android.app.Dialog;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,
        GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private Marker marker;
    private Marker marker2;
    private Marker marker3;
    private Marker marker4;
    private Marker marker5;
    private Marker marker6;
    private Marker marker7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //تغییر حالت نقشه
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
           //افزودن دکمه های زووم به صفحه
        mMap.getUiSettings().setZoomControlsEnabled(true);
        // کمینه زووم
        mMap.setMinZoomPreference(13.3f);
        //بیشینه زووم
        mMap.setMaxZoomPreference(18.9f);


        // Add a marker in Mahabad and move the camera
        LatLng Mahabad = new LatLng(36.7681269, 45.7210387);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mahabad, 12.3f));

        //makan ek restoran
        LatLng speedar = new LatLng(36.7687816, 45.7217992);
        LatLng maghbareye_bodagh_soltan = new LatLng(36.748550, 45.719686);
        LatLng estakhre_abshar = new LatLng(36.756433, 45.719029);
        LatLng bakhi_mikaeil = new LatLng(36.7726177, 45.705645);
        LatLng mahabad_tanakvray = new LatLng(36.781127, 45.729961);
        LatLng daneshgahe_payamenoor = new LatLng(36.7774718, 45.7370912);
        LatLng ketabkhane_sheykh_shaltoot = new LatLng(36.7596351, 45.7225171);


        //yek class az  modir makan ha misazim
        MarkerOptions markerOptions = new MarkerOptions();
        // افزودن عنوان
        markerOptions.title("رستوران سپیدار");
        // افزودن توضیحات
        markerOptions.snippet("رستوران سپیدار");
        //ba  metode  zir makan ro  ezafe mikonim
        markerOptions.position(speedar);
        //ba metode zir  ek aks bray icon  an moshakhs  mikonim
        markerOptions.icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher));


        //yek class az  modir makan ha misazim
        MarkerOptions markerOptions2 = new MarkerOptions();
        // افزودن عنوان
        markerOptions2.title("مقبره بداق سلطان");
        // افزودن توضیحات
        markerOptions2.snippet("مقبره بداق سلطان");
        //ba  metode  zir makan ro  ezafe mikonim
        markerOptions2.position(maghbareye_bodagh_soltan);
        //ba metode zir  ek aks bray icon  an moshakhs  mikonim
        markerOptions2.icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher));


        //yek class az  modir makan ha misazim
        MarkerOptions markerOptions3 = new MarkerOptions();
        // افزودن عنوان
        markerOptions3.title("استخر آبشار");
        // افزودن توضیحات
        markerOptions3.snippet("استخر آبشار");
        //ba  metode  zir makan ro  ezafe mikonim
        markerOptions3.position(estakhre_abshar);
        //ba metode zir  ek aks bray icon  an moshakhs  mikonim
        markerOptions3.icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher));


        //yek class az  modir makan ha misazim
        MarkerOptions markerOptions4 = new MarkerOptions();
        // افزودن عنوان
        markerOptions4.title("باغ مکائیل");
        // افزودن توضیحات
        markerOptions4.snippet("باغ مکائیل");
        //ba  metode  zir makan ro  ezafe mikonim
        markerOptions4.position(bakhi_mikaeil);
        //ba metode zir  ek aks bray icon  an moshakhs  mikonim
        markerOptions4.icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher));


        //yek class az  modir makan ha misazim
        MarkerOptions markerOptions5 = new MarkerOptions();
        // افزودن عنوان
        markerOptions5.title("تاناکورا");
        // افزودن توضیحات
        markerOptions5.snippet("تاناکورا");
        //ba  metode  zir makan ro  ezafe mikonim
        markerOptions5.position(mahabad_tanakvray);
        //ba metode zir  ek aks bray icon  an moshakhs  mikonim
        markerOptions5.icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher));


        //yek class az  modir makan ha misazim
        MarkerOptions markerOptions6 = new MarkerOptions();
        // افزودن عنوان
        markerOptions6.title("دانشگاه پیام نور");
        // افزودن توضیحات
        markerOptions6.snippet("دانشگاه پیام نور");
        //ba  metode  zir makan ro  ezafe mikonim
        markerOptions6.position(daneshgahe_payamenoor);
        //ba metode zir  ek aks bray icon  an moshakhs  mikonim
        markerOptions6.icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher));


        //yek class az  modir makan ha misazim
        MarkerOptions markerOptions7 = new MarkerOptions();
        // افزودن عنوان
        markerOptions7.title("کتابخانه عمومی شیخ شلتوت");
        // افزودن توضیحات
        markerOptions7.snippet("کتابخانه عمومی شیخ شلتوت");
        //ba  metode  zir makan ro  ezafe mikonim
        markerOptions7.position(ketabkhane_sheykh_shaltoot);
        //ba metode zir  ek aks bray icon  an moshakhs  mikonim
        markerOptions7.icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher));


        // in  metod ham makan ro  neshon mide
        marker = mMap.addMarker(markerOptions);
        marker.setTag(1);
        marker2 = mMap.addMarker(markerOptions2);
        marker2.setTag(2);
        marker3 = mMap.addMarker(markerOptions3);
        marker3.setTag(3);
        marker4 = mMap.addMarker(markerOptions4);
        marker4.setTag(4);
        marker5 = mMap.addMarker(markerOptions5);
        marker5.setTag(5);
        marker6 = mMap.addMarker(markerOptions6);
        marker6.setTag(6);
        marker7 = mMap.addMarker(markerOptions7);
        marker7.setTag(7);


        //تطبیق نقشه با متد کلیک کردن مکان ها
        mMap.setOnMarkerClickListener(this);
    }

    //دادن خاصیت کلیک به مکان ها
    @Override
    public boolean onMarkerClick(Marker marker) {

        AppCompatImageView location_image;
        TextView location_about;

        //اگر مکانی وجود داشت
        if (marker != null) {

            //ساختن یک پنجره جدید
            AppCompatDialog dialog = new AppCompatDialog(this);

            //دادن یک لایه به پنجره
            dialog.setContentView(R.layout.content_of_marker);

            //اتصال ویجت ها به پنجره
            location_image = (AppCompatImageView) dialog.findViewById(R.id.location_image);
            location_about = (TextView) dialog.findViewById(R.id.location_about);

            //دادن عنوان
            dialog.setTitle(marker.getTitle());


            if (marker.getTag().equals(1)) {
                location_image.setImageResource(R.drawable.sepidar);
                location_about.setText("برگزاری جشن ها و مهمانیهای شما با دیزاین مورد علاقه شما \n" +
                        "رستوران سپیدار\n" +
                        "جهت رزرو :۸۸-۰۴۴۴۲۴۴۶۶۷۷");

            } else if (marker.getTag().equals(2)) {
                location_image.setImageResource(R.drawable.bodagh_soltan);
                location_about.setText("بداق سلطان یا بداغ سلطان فرزند شیر خان از نوادگان صارم بیگ مکری است که به واسطه آثار ارزشمند تاریخی که از خود به جای گذاشته نام وی به درخشندگی خاصی نسبت به اسلاف و اخلاف خویش دارد. بداق سلطان در سال ۱۰۳۸ ابتدا درمیرآباد ساکن شد و سپس محل امروزی مهاباد را (که در آن زمان ساوجبلاغ نامیده می شد) به عنوان مرکز قلمرو مکری انتخاب کرد");

            } else if (marker.getTag().equals(3)) {
                location_image.setImageResource(R.drawable.abshar);
                location_about.setText("آدرس:سه راهی بیمارستان،خیابان سرباز جنب پارک سرباز " +
                        "تلفن:04442244005" + "\n" +
                        "روزهای فرد ساعت9تا16:30 سانس خانم هاو ساعت18تا23:15 سانس آقایان" + "\n" +
                        "روز های زوج ساعت 18تا 23:15 سانس آقایان");

            } else if (marker.getTag().equals(4)) {
                location_image.setImageResource(R.drawable.baghi_mikaeil);
                location_about.setText("پارک ملت یا باغ مکائیل مهاباد ، پارکی زیبا و دیدنی ست که در پایین دست سد مهاباد واقع شده، که باشکوه ترین پارک در جنوب آذربایجان غربی محسوب می شه. نور پردازی زیبا در پارک، رودخانه زیبایی که از دل این پارک می گذره با سنگ های بزرگ و جالب داخل آب و منطقه تفریحی و گردشگری که در روبروی پارک و در دل کوه ایجاد شده، همه و همه پارک ملت مهاباد رو به مکانی دیدنی تبدیل کرده");

            } else if (marker.getTag().equals(5)) {
                location_image.setImageResource(R.drawable.tanakora);
                location_about.setText(" نام سایت : سیستم فروش تاناکورای مهاباد" + "\n" +
                        " آدرس سایت : http://tanakora-mahabad.com" + "\n" +
                        " نوع فعالیت : لوازم خانگی ، تبلیغات و بازاریابی اینترنتی ، فروشگاههای زنجیره ای ، فروشگاه های الکترونیکی \n" +
                        " تاریخ شروع به فعالیت: 1395");

            } else if (marker.getTag().equals(6)) {
                location_image.setImageResource(R.drawable.university_pnu);
                location_about.setText(" تلفن: 42338211 - 42333856 - 42333852 - 42333854 - 42333600 - 42335070\n" +
                        "دورنگار: 2338222-0444\n" +
                        "پست الكترونيكي: mahpnu8639@yahoo.com\n" +
                        "نشاني: مهاباد ابتدای بلوار شهید شهریکندی - دانشگاه پیام نور - صندوق پستی 438 - کدپستی : 39735-59148\n ");

            } else if (marker.getTag().equals(7)) {
                location_image.setImageResource(R.drawable.shaltotlibrary);
                location_about.setText("کانال تلگرامی کتابخانه عمومی شیخ شلتوت:" + "\n" +
                        "@shaltotlibrary" + "\n" +
                        "کتابخانه عمومی شیخ شلتوت اولین کتابخانه عمومی شهرستان مهاباد  است که مجموعه\u200Cای غنی و گسترده از منابع گوناگون در زمینه\u200Cهای مختلف علوم، فنون و ادب را در برمی\u200Cگیرد . این کتابخانه دارای 33488نسخه انواع منابع اطلاعاتی است که بیشتر آن کتاب است و از این تعداد 103 نسخه منابع دیداری شنیداری،282 نسخه منابع گویا و 2818 نسخه مربوط به نشریات است.");
            }

            //نمایش پنجره
            dialog.show();
        }
        return false;
    }
}
