package com.example.linux.appcontent;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RemoteViews;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.epapyrus.plugpdf.core.PlugPDF;
import com.epapyrus.plugpdf.core.PlugPDFException;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linux on 7/6/2559.
 */


public class cleftcontent extends MainActivity {

    public String[] cleft_array = new String[]
            {
                  //  "กลยุทธ์ในการพัฒนาการดูแลผู้ป่วยปากแหว่ง  เพดานโหว่  และความพิการแต่กำเนิดของใบหน้า และกะโหลกศีรษะในประเทศ (Strategies in the Development of Cleft Lip and Palate Care in Thailand)",
                   // "โอกาสเสี่ยงที่จะเกิดซ้ำในกรณีปากแหว่งและปากแหว่งร่วมกับเพดานโหว่",
                    "รู้จักภาวะปากแหว่ง เพดานโหว่",
                   // "อุบัติการณ์",
                    "โอกาสเกิดซ้ำ",
                    "ปัญหาภาวะแทรกซ้อน",
                    "ปากแหว่งเพดานโหว่จำแนกได้ดังนี้",


            };

    public String[]  chapter_array=new String[]
            {
                    "ภาวะปากแหว่งเพดานโหว่"
            };

    //private static final String FILENAME = "text1.txt";



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cleftcontent);

        ListView listview_cleft=(ListView) findViewById(R.id.listview_cleft);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cleft_array);
        listview_cleft.setAdapter(adapter);




        listview_cleft.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /*
                if( id == 0 )
                {

                    //Toast.makeText(getApplicationContext(), "TFC click " + id , Toast.LENGTH_LONG).show();





                    //textmsg=(EditText)findViewById(R.id.editText1);

                   // String MY_FILE_NAME = "file/1.pdf";
                  //  FileOutputStream fileos = openFileOutput(MY_FILE_NAME, Context.MODE_PRIVATE);
                 //   FileInputStream fileis = openFileInput(My_FILE_NAME);






                  //  String url = "https://mis.kku.ac.th/attachments/14549156240-A_Multisite_Study_of_Oral_Clefts_and_Associated.99401.pdf";
                   // File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/ch1.pdf" );
                    File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/risk.pdf" );
                  //  File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/ch1.png" );
                    Intent target = new Intent(Intent.ACTION_VIEW);
                    target.setDataAndType(Uri.fromFile(file),"application/pdf");
                  //  target.setDataAndType(Uri.fromFile(file),"image/png");
                    target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    Intent intent = Intent.createChooser(target, "Open File");
                    try {
                        Toast.makeText(getApplicationContext(), " รอสักครู่ "  , Toast.LENGTH_LONG).show();
                        startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(cleftcontent.this,
                                "No Application Available to View PDF",
                                Toast.LENGTH_SHORT).show();
                    }



                }
            */


                 if( id == 0 )
                {
                   // Toast.makeText(getApplicationContext(), "TFC click " + id , Toast.LENGTH_LONG).show();
                    //  String url = "https://mis.kku.ac.th/attachments/14549156240-A_Multisite_Study_of_Oral_Clefts_and_Associated.99401.pdf";
                  //  File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/ch2.pdf" );
                  //  File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/ch2.png" );
                    File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/cleft1.pdf" );
                  //  File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/ex1.JPG" );
                    //  File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/ch.png" );
                    Intent target = new Intent(Intent.ACTION_VIEW);
                    target.setDataAndType(Uri.fromFile(file),"application/pdf");
                    //  target.setDataAndType(Uri.fromFile(file),"image/png");
                   //  target.setDataAndType(Uri.fromFile(file),"image/JPG");
                    target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    Intent intent = Intent.createChooser(target, "Open File");
                    try {
                        Toast.makeText(getApplicationContext(), " รอสักครู่ "  , Toast.LENGTH_LONG).show();
                        startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(cleftcontent.this,
                                "No Application Available to View PDF",
                                Toast.LENGTH_SHORT).show();
                    }



                }

                else if( id == 1 )
                {
                    // Toast.makeText(getApplicationContext(), "TFC click " + id , Toast.LENGTH_LONG).show();
                    //  String url = "https://mis.kku.ac.th/attachments/14549156240-A_Multisite_Study_of_Oral_Clefts_and_Associated.99401.pdf";
                   // File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/incident.pdf" );
                    File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/chance.pdf" );
                    //  File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/ex1.JPG" );
                    //  File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/ch.png" );
                    Intent target = new Intent(Intent.ACTION_VIEW);
                    target.setDataAndType(Uri.fromFile(file),"application/pdf");
                    //  target.setDataAndType(Uri.fromFile(file),"image/png");
                    //  target.setDataAndType(Uri.fromFile(file),"image/JPG");
                    target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    Intent intent = Intent.createChooser(target, "Open File");
                    try {
                        Toast.makeText(getApplicationContext(), " รอสักครู่ "  , Toast.LENGTH_LONG).show();
                        startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(cleftcontent.this,
                                "No Application Available to View PDF",
                                Toast.LENGTH_SHORT).show();
                    }



                }

                else if( id == 2 )
                {
                    // Toast.makeText(getApplicationContext(), "TFC click " + id , Toast.LENGTH_LONG).show();
                    //  String url = "https://mis.kku.ac.th/attachments/14549156240-A_Multisite_Study_of_Oral_Clefts_and_Associated.99401.pdf";
                  //  File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/chance.pdf" );
                    File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/cl.pdf" );
                    //  File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/ex1.JPG" );
                    //  File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/ch.png" );
                    Intent target = new Intent(Intent.ACTION_VIEW);
                    target.setDataAndType(Uri.fromFile(file),"application/pdf");
                    //  target.setDataAndType(Uri.fromFile(file),"image/png");
                    //  target.setDataAndType(Uri.fromFile(file),"image/JPG");
                    target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    Intent intent = Intent.createChooser(target, "Open File");
                    try {
                        Toast.makeText(getApplicationContext(), " รอสักครู่ "  , Toast.LENGTH_LONG).show();
                        startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(cleftcontent.this,
                                "No Application Available to View PDF",
                                Toast.LENGTH_SHORT).show();
                    }



                }
                else if( id == 3 )
                {
                    // Toast.makeText(getApplicationContext(), "TFC click " + id , Toast.LENGTH_LONG).show();
                    //  String url = "https://mis.kku.ac.th/attachments/14549156240-A_Multisite_Study_of_Oral_Clefts_and_Associated.99401.pdf";
                    //  File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/chance.pdf" );
                    File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/type_cleft.pdf" );
                    //  File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/ex1.JPG" );
                    //  File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +  "/ch.png" );
                    Intent target = new Intent(Intent.ACTION_VIEW);
                    target.setDataAndType(Uri.fromFile(file),"application/pdf");
                    //  target.setDataAndType(Uri.fromFile(file),"image/png");
                    //  target.setDataAndType(Uri.fromFile(file),"image/JPG");
                    target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    Intent intent = Intent.createChooser(target, "Open File");
                    try {
                        Toast.makeText(getApplicationContext(), " รอสักครู่ "  , Toast.LENGTH_LONG).show();
                        startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(cleftcontent.this,
                                "No Application Available to View PDF",
                                Toast.LENGTH_SHORT).show();
                    }



                }






            }
        });

    }


    /*
    private void  getURL(String url) // send to web browser
    {
        Vs.showNext();
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }*/



}
