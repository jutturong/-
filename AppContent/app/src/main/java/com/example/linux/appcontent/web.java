package com.example.linux.appcontent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

/**
 * Created by linux on 3/6/2559.
 */
public class web extends MainActivity {

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.website);

        //Intent intent1=getIntent();
        //final String url=intent1.getStringExtra("url");

       // Toast.makeText(getApplicationContext(), "TFC click " + url , Toast.LENGTH_LONG).show();
       // getURL(url);




        setContentView(R.layout.website);
        WebView WebViw = (WebView) findViewById(R.id.webView1);
        WebViw.getSettings().setJavaScriptEnabled(true);

        Intent intent=getIntent();
        final String url =  intent.getStringExtra("url");

       // WebViw.loadUrl("http://kkucleft.kku.ac.th/");
        WebViw.loadUrl(url);



    }



}
