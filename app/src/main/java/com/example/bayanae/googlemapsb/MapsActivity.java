package com.example.bayanae.googlemapsb;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,
        GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;

    private float maxZoom = 18.9f;
    private float minZoom = 13.3f;

    private ImageView gardesh,res,shop,park,cng;
    // لان عه و دکمه عی لایه ی منویه پس  استفده لیدکه ین
    private FloatingActionButton floating_menu;

    // خب  لیره لیسته که تعریف دکه ین  تا له کلی کلاس استفاده بکه ین
    // عه ولیسته خالیه له اول دا  اما  هر وقتیک کلیک له سر هر بخشه کرا مقداری دچیته ناو
    List<Aks>  list = new ArrayList<>();
    //خب الان لیستکمان تعریف کردو بلام کامل نیه
    // چون اشنا نین لگل  لیستکان بزانن هر وک ارایانه اما لیردا دتوانین به اختاری خمان نوعی لیستکمان انتخاب بکه ین
    // ه روک دبینن لیستی مه له نوعی place که اصلا وجودی نیه و دبه بوخومان دروستی که ین
    // ان دتوانین  له کلاسی خودی مکانه کانیش استفاده بکه ین
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //کمه  نمایش  گروه  رو  میبریم  تو متد  لود نقشهتا مجبور نشیم  با هر  کلید  دوباره نقشه لود بشه  فقط
        //اون وقت کافیه  مکانارو تغییر بدیم


    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //تغییر حالت نقشه
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        //افزودن دکمه های زووم به صفحه
        mMap.getUiSettings().setZoomControlsEnabled(true);
        // کمینه زووم
        mMap.setMinZoomPreference(minZoom);
        //بیشینه زووم
        mMap.setMaxZoomPreference(maxZoom);

        // Add a marker in Mahabad and move the camera
        LatLng Mahabad = new LatLng(36.7681269, 45.7210387);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mahabad, 12.3f));


        floating_menu =(FloatingActionButton) findViewById(R.id.floatingMenu);
        floating_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                show_groups(mMap);

            }
        });

        //تطبیق نقشه با متد کلیک کردن مکان ها
        mMap.setOnMarkerClickListener(this);
    }

    //دادن خاصیت کلیک به مکان ها
    @Override
    public boolean onMarkerClick(Marker marker) {

        AppCompatImageView location_image;
        TextView location_about;
        marker.showInfoWindow();
        //اگر مکانی وجود داشت
        if (marker != null) {

            //ساختن یک پنجره جدید
            AppCompatDialog dialog = new AppCompatDialog(this);

            //دادن یک لایه به پنجره
            dialog.setContentView(R.layout.content_of_marker);

            //اتصال ویجت ها به پنجره
            location_image = (AppCompatImageView) dialog.findViewById(R.id.location_image);
            location_about = (TextView) dialog.findViewById(R.id.location_about);




            //عیره ش  که  کوتمان  بو نمایشی توضیحاتی هر مکانه کلیک کردن دادنه ین
            // اما عه و دفعه ی کلیک کردن له ناو حلقه دادبیت
            //چون له لیست  استفاده که ین

            for(int i = 0 ; i < list.size(); i++){

                //دادن عنوان
                dialog.setTitle(list.get(i).getMarkerOptions().getTitle());

                location_image.setImageResource(list.get(i).getId_pic());
                location_about.setText(list.get(i).getInfo());

            }


            //نمایش پنجره
            dialog.show();
        }
        return false;
    }


    //متد پنجره نمایش  گروه ها
    private void show_groups(final GoogleMap mMap){

        //ساختن یک پنجره جدید
        final AppCompatDialog dialog = new AppCompatDialog(MapsActivity.this);

        //دادن یک لایه به پنجره
        dialog.setContentView(R.layout.menu);

        dialog.setTitle("مهاباد گردی");

        gardesh=(ImageView) dialog.findViewById(R.id.menu_gardesh);
        res=(ImageView) dialog.findViewById(R.id.menu_res);
        shop=(ImageView) dialog.findViewById(R.id.menu_shop);
        park=(ImageView) dialog.findViewById(R.id.menu_park);
        cng=(ImageView) dialog.findViewById(R.id.menu_cng);


        //نمایش پنجره
        dialog.show();


        //فقط  کافیه  له و  صفحه  دا وک  گرشی  دکمه کانی  دیکه  خاصیتی کلیک کردن  و دوایه  اول  لیست  مقدار دهی بکه ن
        //البته  لبیرتان  بیت  بو هر دکمه ی  لیستی  خوی
        gardesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //لیست کلاس مکان رو  توی  لیست این کلاس ریختیم
                list = new Place(MapsActivity.this).list_gardesh();

                // رفرش کردن نقشه  هنگام کلیک  کردن
                load_marker(mMap);

                //با کد زیر هم بعد  کلیک کردن روی هر گروه پنجر بسته میشه
                dialog.cancel();


                //دوایه اگر لیستکانی دکه تان دروست کردن
                // عه وانه له کانتبینن دره

            }
        });
//                dabet lera bo har dokma kilck krdan dabenen

        cng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                list = new Place(MapsActivity.this).list_cng();
                load_marker(mMap);
                dialog.cancel();

            }
        });


        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                list = new Place(MapsActivity.this).list_shop();
                load_marker(mMap);
                dialog.cancel();

            }
        });


        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                list = new Place(MapsActivity.this).list_res();
                load_marker(mMap);
                dialog.cancel();

            }
        });


        park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                list = new Place(MapsActivity.this).list_park();
                load_marker(mMap);
                dialog.cancel();

            }
        });
    }


    //متد لود کردن  دوباره  مکان
    private void load_marker(GoogleMap mMap){

        //ابتدا نقشه رو پاک میکنیم  بعد با حلقه زیر مکان های  جدید رو وارد می کنیم
        mMap.clear();

        //حالا باید اون مکان هارو نشون بدیم
        //چون هربار با دکمه هر بخش مقدار لیست تغییر میکنه باید از حلقه ها استفاده کنیم
        for(int i = 0 ; i < list.size(); i++){
            mMap.addMarker(list.get(i).getMarkerOptions());
        }

    }

}
