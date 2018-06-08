package com.example.bayanae.googlemapsb;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.ui.IconGenerator;
import java.util.ArrayList;
import java.util.List;

class Place {

    private Context context;

    int id_pic_gardesh = R.mipmap.gardesh;
    int id_pic_gas = R.mipmap.gas;
    int id_pic_shop = R.mipmap.shop;
    int id_pic_resturan = R.mipmap.resturant;
    int id_pic_park = R.mipmap.park;


    public Place(Context context) {
        this.context = context;
    }

    // این متد لیست تمام مکان های گردشی رو داره
    List<Aks> list_gardesh() {
        // مقداره لیست رو اینجا میندازیم
        List<Aks> list = new ArrayList();

        //موقعیت مکانی
        LatLng barda_koonta = new LatLng(36.7659726, 45.6948437);
        LatLng maghbareye_bodagh_soltan = new LatLng(36.748550, 45.719686);
        LatLng sade_mahababd = new LatLng(36.768984, 45.6981317);
        LatLng kani_barazan = new LatLng(36.9902129, 45.7676911);


        list.add(new Aks(new MarkerOptions()
                .position(barda_koonta)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("برده کنته", id_pic_gardesh)))
                ,("برده کنته")
                , R.drawable.bardakoonta
                , "\n" +
                "یکی از آثار کهن و باستانی بسیار ارزشمند و باشکوه بازمانده از حکومت ماننایی ها(mannaeans)  در مهاباد که با گذشت هزاران سال همچنان استوار و پابرجاست، آتشکده کهن و خاموش برده کنته است.\n" +
                "\n" +
                "محوطه باستانی برده کنته در فاصله حدود 6 تا 7 کیلومتری شمال شهر مهاباد بر سر راه مهاباد به ارومیه و در نزدیکی روستای یوسفکند واقع شده است. بنای برده کنته بر دشت و ویرانه های شارویران می نگرد و در 5 کیلومتری سمت راست روستای دریاز یا دریاس قرار گرفته که بطلیموس یونانی نیز از آن با نام داریوسا به عنوان یکی از شهرهای ماد یاد کرده است و نیز مشرف بر دخمه و آرامگاه ماننایی- مادی فقره قا است.\n"));


        list.add(new Aks(new MarkerOptions()
                .position(maghbareye_bodagh_soltan)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("مقبره ی بداق سلطان", id_pic_gardesh)))
                ,("مقبره ی بداق سلطان")
                , R.drawable.bodagh_soltan
                , "بداق سلطان یا بداغ سلطان فرزند شیر خان از نوادگان صارم بیگ مکری است که به واسطه آثار ارزشمند تاریخی که از خود به جای گذاشته نام وی به درخشندگی خاصی نسبت به اسلاف و اخلاف خویش دارد. بداق سلطان در سال ۱۰۳۸ ابتدا درمیرآباد ساکن شد و سپس محل امروزی مهاباد را (که در آن زمان ساوجبلاغ نامیده می شد) به عنوان مرکز قلمرو مکری انتخاب کرد"));


        list.add(new Aks(new MarkerOptions()
                .position(sade_mahababd)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("سد مهاباد", id_pic_gardesh)))
                ,("سد مهاباد")
                , R.drawable.sad
                ,"سد مهاباد یکی از سدهای استان آذربایجان غربی است و در شهر مهاباد واقع شده است. سد مهاباد قبل از پیروزی انقلاب اسلامی ایران و به وسیله مهندسان یوگوسلاویایی ساخته شده است. این سد جزو 10 سد پرآب کشور است و در حالت کلی مجموعه حجم کل ورودی سالیانه آن معادل 304.339 میلیون متر مکعب است"));


        list.add(new Aks(new MarkerOptions()
                .position(kani_barazan)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("تالاب کانی برازان", id_pic_gardesh)))
                ,("تالاب کانی برازان")
                , R.drawable.talab
                , "تالاب کانی برازان در 30 کیلومتری شمال شرقی مهاباد در موقعیت جغرافیایی 36 درجه و 59 دقیقه و 23 ثانیه شمالی و 45 درجه و 45 دقیقه و 58 ثانیه شرقی قرار دارد. این تالاب به زودی به عنوان پناهگاه حیات وحش معرفی می شود که در صورت انجام این کار تالاب کانی برازان جزو مناطق چهارگانه کشور خواهدبود که جایگاه قانونی و تعریف شده دیگری پیدا می کند. با توجه به وجود ظرفیت های موجود این تالاب به عنوان نخستین سایت پرنده نگری کشور نیز انتخاب شده است"));

        return list;
    }

    List<Aks> list_cng() {

        List<Aks> list = new ArrayList();

        LatLng nazemzadeh = new LatLng(36.7928459, 45.7483648);
        LatLng sherkati = new LatLng(36.7659726, 45.6948437);
        LatLng salimi = new LatLng(36.7477182, 45.717611);

        list.add(new Aks(new MarkerOptions()
                .position(nazemzadeh)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("جایگاه سوخت ناظم زاده", id_pic_gas)))
                ,("جایگاه سوخت ناظم زاده")
                ,R.drawable.nazemzadeh
        ,"آدرس:آذربایجان غربی -مهاباد- شهرک کارمندان - کیلومتر ۲ جاده مهاباد، میاندوآب "));

        list.add(new Aks(new MarkerOptions()
                .position(sherkati)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("جایگاه سوخت شرکتی مهاباد", id_pic_gas)))
                ,("جایگاه سوخت شرکتی مهاباد")
                ,R.drawable.sherkati
                ,"آدرس:آذربایجان غربی - مهاباد-بلوار شهریکندی - سه راهی تپه قاضی - جنب شرکت نفت مهاباد "));

        list.add(new Aks(new  MarkerOptions()
                .position(salimi)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("جایگاه سوخت سلیمی", id_pic_gas)))
                ,("جایگاه سوخت سلیمی")
                ,R.drawable.salimi
                ,"آدرس:آذربایجان غربی-مهاباد- میدان استقلال - خیابان بداق سلطان"));

        return list;
    }

    List<Aks> list_shop() {

        List<Aks> list = new ArrayList();

        LatLng tanakora = new LatLng(36.7687816, 45.7217992);
        LatLng ofoghe_koroosh = new LatLng(36.7647925, 45.7170715);


        list.add(new Aks(new MarkerOptions()
                .position(tanakora)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("تاناکورای مهاباد", id_pic_shop)))
                ,("تاناکورای مهاباد")
                ,R.drawable.tanakora
                ,"@, [۰۶.۰۶.۱۸ ۱۵:۱۲]\n" +
                "نام سایت : سیستم فروش تاناکورای مهاباد\n" +
                "  \" آدرس سایت : http://tanakora-mahabad.com\" + \"\\n\" \n" +
                "    \" نوع فعالیت : لوازم خانگی ، تبلیغات و بازاریابی اینترنتی ، فروشگاههای زنجیره ای ، فروشگاه های الکترونیکی \n" +
                "    \" تاریخ شروع به فعالیت: 1395"));

        list.add(new Aks(new MarkerOptions()
                .position(ofoghe_koroosh)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("فروشگاه افق کوروش مهاباد", id_pic_shop)))
                ,("فروشگاه افق کوروش مهاباد")
                ,R.drawable.koroosh
                ,"آدرس: مهاباد ، بلوار تپه قاضی، بالاتر از مسجد نور، نرسیده به پاسگاه"));

        return list;
    }

    List<Aks> list_res() {

        List<Aks> list = new ArrayList();

        LatLng resturane_sepidar = new LatLng(36.7687816, 45.7217992);
        LatLng kababi_shaghayegh = new LatLng(36.748550, 45.719686);
        LatLng jazira = new LatLng(36.756433, 45.719029);

        list.add(new Aks(new  MarkerOptions()
                .position(resturane_sepidar)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("رستوران سپیدار", id_pic_resturan)))
                ,("رستوران سپیدار")
                ,R.drawable.sepidar
                ,"@, [۰۶.۰۶.۱۸ ۱۵:۱۲]\n" +
                "برگزاری جشن ها و مهمانیهای شما با دیزاین مورد علاقه شما \n" +
                "                       \"رستوران سپیدار\n" +
                "                       \"جهت رزرو :۸۸-۰۴۴۴۲۴۴۶۶۷۷\""));

        list.add(new Aks(new MarkerOptions()
                .position(kababi_shaghayegh)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("چلوکبابی شقایق", id_pic_resturan)))
                ,("چلوکبابی شقایق")
                ,R.drawable.shaghayegh
                ,"چلوکبابی شقایق واقع در : خیابان جمهوری اسلامی روبروی پاساژ ایوبی با شماره تماس : 2229447"));

        list.add(new Aks(new MarkerOptions()
                .position(jazira)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("غذاخوری جزیره", id_pic_resturan)))
                ,("غذاخوری جزیره")
                ,R.drawable.sepidar
                ,"آدرس:غذاخوری جزیره واقع در جاده مهاباد سردشت با شماره تماس : 09144422380"));

        return list;
    }

    List<Aks> list_park() {

        List<Aks> list = new ArrayList();

        LatLng bakhi_mikaeil = new LatLng(36.7726177, 45.705645);
        LatLng parkeOstadmajdi = new LatLng(36.7687816, 45.7217992);
        LatLng parkeParastar = new LatLng(36.748550, 45.719686);

        list.add(new Aks(new MarkerOptions()
                .position(bakhi_mikaeil)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("باغی مکائیل", id_pic_park)))
                ,("باغی مکائیل")
                ,R.drawable.baghi_mikaeil
                ,"پارک ملت یا باغ مکائیل مهاباد ، پارکی زیبا و دیدنی ست که در پایین دست سد مهاباد واقع شده، که باشکوه ترین پارک در جنوب آذربایجان غربی محسوب می شه. نور پردازی زیبا در پارک، رودخانه زیبایی که از دل این پارک می گذره با سنگ های بزرگ و جالب داخل آب و منطقه تفریحی و گردشگری که در روبروی پارک و در دل کوه ایجاد شده، همه و همه پارک ملت مهاباد رو به مکانی دیدنی تبدیل کرده"));

        list.add(new Aks(new MarkerOptions()
                .position(parkeOstadmajdi)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("پارک استادمجدی", id_pic_park)))
                ,("پارک استادمجدی")
                ,R.drawable.majdi
                ,"آدرس:مهاباد ،خیابان استاد مجدی ، روبروی خیابان بیمارستان"));

        list.add(new Aks(new MarkerOptions()
                .position(parkeParastar)
                .icon(BitmapDescriptorFactory.fromBitmap(markerIcon("پارک پرستار", id_pic_park)))
                ,("پارک پرستار")
                ,R.drawable.parastar
                ,"مهاباد ، باغ شایگان، "));

        return list;
    }


    //ساختن یک متد برای شخصی سازی بیشتر ایکون مکان که به ما این امکان رو میده همیشه عنوان مکان رو مشاهده کنیم
    private Bitmap markerIcon(String title, int id) {


        //ساخت ایکون و متن سفارشی
        IconGenerator generator = new IconGenerator(context);

        generator.setBackground(context.getResources().getDrawable(R.drawable.tranparent));
        LayoutInflater inflater = LayoutInflater.from(context.getApplicationContext());
        View view = inflater.inflate(R.layout.marker_icon, null);

        //افزودن عنوان
        TextView textView = (TextView) view.findViewById(R.id.title_marker);
        textView.setText(title);

        // افزودن عکس
        AppCompatImageView marker_icon = (AppCompatImageView) view.findViewById(R.id.marker_icon);
        marker_icon.setImageResource(id);

        // دادن لایه  به عکس
        generator.setContentView(view);
        return generator.makeIcon();
    }


}
