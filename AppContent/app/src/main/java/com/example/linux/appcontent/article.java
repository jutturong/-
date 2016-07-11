package com.example.linux.appcontent;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by linux on 1/6/2559.
 */
public class article extends MainActivity {

    public String[] article = new String[]
            {
                    "A Multisite Study of Oral Clefts and Associated Abnormalities in Thailand: The Epidemiologic Data",



            };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article);

        setContentView(R.layout.article);

        final ListView listview_article=(ListView) findViewById(R.id.listview_article);






                     ArrayAdapter<String> adapter_article=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,article);
                     listview_article.setAdapter(adapter_article);

                    listview_article.setAdapter(adapter_article);
                    listview_article.setTextFilterEnabled(true);


        File images = Environment.getExternalStorageDirectory();





        listview_article.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                if( id == 0 )
                {

                    File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/multisite_study1.pdf" );
                    Intent target = new Intent(Intent.ACTION_VIEW);
                    target.setDataAndType(Uri.fromFile(file),"application/pdf");
                    target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    Intent intent = Intent.createChooser(target, "Open File");
                    try {
                        Toast.makeText(getApplicationContext(), " Open PDF "  , Toast.LENGTH_LONG).show();
                        startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(article.this,
                                "No Application Available to View PDF",
                                Toast.LENGTH_SHORT).show();
                    }

                }





            }
        });



    }

}
