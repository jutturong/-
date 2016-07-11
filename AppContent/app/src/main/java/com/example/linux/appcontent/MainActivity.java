package com.example.linux.appcontent;

import android.content.Intent;
import android.location.Geocoder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   public String[] values = new String[]
            {
            "ภาวะปากแหว่ง เพดานโหว และความพิการแต่กำเนิดของศีรษะและใบหน้า",
          //  "บทความนักวิจัย",
          //  "ติดตามการรักษา",
            "ฉุกเฉินติดต่อเรา",
            "จัดทำโดย",
            "แผนที่การเดินทางมาที่ศูนย์ฯ",
            "เกี่ยวกับเรา",
            "Social Network",
            "Website",
            "LineID: cleftkku99",
                    "แบบฟอร์มการบริจาคออนไลน์",
                    ""

             };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView  listview1= (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values);
        listview1.setAdapter(adapter);

       // ImageView  img1=(ImageView) findViewById(R.id.img1);


        listview1.setTextFilterEnabled(true);








        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


/*
                Toast.makeText(getApplicationContext(), "TFC click " + id , Toast.LENGTH_LONG).show();
 */




                if( id == 0 )
                {

                    Intent intent1=new Intent(MainActivity.this, cleftcontent.class);
                     startActivity(intent1);
                  //  Toast.makeText(getApplicationContext(), "TFC click " + id , Toast.LENGTH_LONG).show();

                }
                else if( id == 1 )
                {

                      Intent intent1=new Intent(MainActivity.this, emerging.class);
                      startActivity(intent1);

                }
                else if( id == 2 )
                {
                    Intent intent2=new Intent(MainActivity.this, contact.class);
                    startActivity(intent2);
                }
                else if( id == 3 )
                {
                    Intent intent6=new Intent(MainActivity.this, web.class);
                    //https://www.google.co.th/maps/@16.4678666,102.8306975,17.75z?hl=th
                    //https://www.google.co.th/maps/dir/%E0%B8%A1%E0%B8%B9%E0%B8%A5%E0%B8%99%E0%B8%B4%E0%B8%98%E0%B8%B4%E0%B8%95%E0%B8%B0%E0%B8%A7%E0%B8%B1%E0%B8%99%E0%B8%89%E0%B8%B2%E0%B8%A2+%E0%B9%80%E0%B8%9E%E0%B8%B7%E0%B9%88%E0%B8%AD%E0%B8%9C%E0%B8%B9%E0%B9%89%E0%B8%9B%E0%B9%88%E0%B8%A7%E0%B8%A2%E0%B8%9B%E0%B8%B2%E0%B8%81%E0%B9%81%E0%B8%AB%E0%B8%A7%E0%B9%88%E0%B8%87+%E0%B9%80%E0%B8%9E%E0%B8%94%E0%B8%B2%E0%B8%99%E0%B9%82%E0%B8%AB%E0%B8%A7%E0%B9%88%E0%B8%AF+123+%E0%B8%84%E0%B8%93%E0%B8%B0%E0%B9%81%E0%B8%9E%E0%B8%97%E0%B8%A2%E0%B8%A8%E0%B8%B2%E0%B8%AA%E0%B8%95%E0%B8%A3%E0%B9%8C+%E0%B8%A1%E0%B8%AB%E0%B8%B2%E0%B8%A7%E0%B8%B4%E0%B8%97%E0%B8%A2%E0%B8%B2%E0%B8%A5%E0%B8%B1%E0%B8%A2%E0%B8%82%E0%B8%AD%E0%B8%99%E0%B9%81%E0%B8%81%E0%B9%88%E0%B8%99+%E0%B9%83%E0%B8%99%E0%B9%80%E0%B8%A1%E0%B8%B7%E0%B8%AD%E0%B8%87+%E0%B9%80%E0%B8%A1%E0%B8%B7%E0%B8%AD%E0%B8%87%E0%B8%82%E0%B8%AD%E0%B8%99%E0%B9%81%E0%B8%81%E0%B9%88%E0%B8%99+%E0%B8%82%E0%B8%AD%E0%B8%99%E0%B9%81%E0%B8%81%E0%B9%88%E0%B8%99+40002//@16.4672271,102.7939584,13z/data=!3m1!4b1!4m8!4m7!1m5!1m1!1s0x31228a7014adaff9:0x2cdb634e300d248d!2m2!1d102.828978!2d16.46723!1m0?hl=th
                   // intent6.putExtra("url","https://www.google.co.th/maps/@16.4678666,102.8306975,17.75z?hl=th");
                    //https://www.google.co.th/maps/dir/16.4672298,102.8289782
                    intent6.putExtra("url","https://www.google.co.th/maps/dir/16.4672298,102.8289782/123+%E0%B8%84%E0%B8%93%E0%B8%B0%E0%B9%81%E0%B8%9E%E0%B8%97%E0%B8%A2%E0%B8%A8%E0%B8%B2%E0%B8%AA%E0%B8%95%E0%B8%A3%E0%B9%8C+%E0%B8%A1%E0%B8%AB%E0%B8%B2%E0%B8%A7%E0%B8%B4%E0%B8%97%E0%B8%A2%E0%B8%B2%E0%B8%A5%E0%B8%B1%E0%B8%A2%E0%B8%82%E0%B8%AD%E0%B8%99%E0%B9%81%E0%B8%81%E0%B9%88%E0%B8%99+%E0%B8%A1%E0%B8%B9%E0%B8%A5%E0%B8%99%E0%B8%B4%E0%B8%98%E0%B8%B4%E0%B8%95%E0%B8%B0%E0%B8%A7%E0%B8%B1%E0%B8%99%E0%B8%89%E0%B8%B2%E0%B8%A2+%E0%B9%80%E0%B8%9E%E0%B8%B7%E0%B9%88%E0%B8%AD%E0%B8%9C%E0%B8%B9%E0%B9%89%E0%B8%9B%E0%B9%88%E0%B8%A7%E0%B8%A2%E0%B8%9B%E0%B8%B2%E0%B8%81%E0%B9%81%E0%B8%AB%E0%B8%A7%E0%B9%88%E0%B8%87+%E0%B9%80%E0%B8%9E%E0%B8%94%E0%B8%B2%E0%B8%99%E0%B9%82%E0%B8%AB%E0%B8%A7%E0%B9%88%E0%B8%AF+%E0%B9%83%E0%B8%99%E0%B9%80%E0%B8%A1%E0%B8%B7%E0%B8%AD%E0%B8%87+%E0%B9%80%E0%B8%A1%E0%B8%B7%E0%B8%AD%E0%B8%87%E0%B8%82%E0%B8%AD%E0%B8%99%E0%B9%81%E0%B8%81%E0%B9%88%E0%B8%99+%E0%B8%82%E0%B8%AD%E0%B8%99%E0%B9%81%E0%B8%81%E0%B9%88%E0%B8%99+40002/@16.4669964,102.8294343,18z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x31228a7014adaff9:0x2cdb634e300d248d!2m2!1d102.828978!2d16.46723?hl=th");
                     startActivity(intent6);
                }
                else if( id == 5 )
                {
                    Intent intent6=new Intent(MainActivity.this, web.class);
                    intent6.putExtra("url","https://www.facebook.com/cleftkku");
                    startActivity(intent6);
                }
                else if( id == 6 )
                {

                   // Toast.makeText(getApplicationContext(), "TFC click " + id , Toast.LENGTH_LONG).show();
                   // Geocoder geocoder = new Geocoder(getBaseContext());
                   // addresses = geocoder.getFromLocationName("Search Location", 3);


                    /*
                    setContentView(R.layout.website);
                    WebView WebViw = (WebView) findViewById(R.id.webView1);
                    WebViw.getSettings().setJavaScriptEnabled(true);
                    WebViw.loadUrl("http://kkucleft.kku.ac.th/");
*/

                    Intent intent6=new Intent(MainActivity.this, web.class);
                    intent6.putExtra("url","http://kkucleft.kku.ac.th/");
                    startActivity(intent6);

                    //https://www.google.co.th/maps/@16.4678666,102.8306975,17.75z?hl=th

                }
                else if( id == 7 )
                {
                   // setContentView(R.layout.lineid);
                    Intent intent7=new Intent(MainActivity.this, lineid.class);
                    startActivity(intent7);

                }
                else if( id == 8 )
                {
                    //http://www.tawanchai-foundation.org/donate.php
                    Intent intent6=new Intent(MainActivity.this, web.class);
                    intent6.putExtra("url","http://www.tawanchai-foundation.org/donate.php");
                    startActivity(intent6);

                }

            }
        });








    }
}
