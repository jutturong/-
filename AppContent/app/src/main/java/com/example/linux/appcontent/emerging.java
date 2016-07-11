package com.example.linux.appcontent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by linux on 11/7/2559.
 */
public class emerging  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emerging);

        TextView text1=(TextView) findViewById(R.id.text1);
        text1.setText("  ติดต่อในเวลาราชการ  จันทร์ - ศุกร์  8.30-16.30 น.  \n   \t  สุธีรา ประดับวงษ์ Tel 081-263-8951");


    }
}
