package com.example.linux.appcontent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by linux on 8/7/2559.
 */
public class contact extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        //textview_contact
        //final ListView listview1= (ListView) findViewById(R.id.list);
        // // ImageView  img1=(ImageView) findViewById(R.id.img1);
        TextView  txcontact=(TextView)  findViewById(R.id.textview_contact);
        txcontact.setText(" " +
                "ศูนย์การดูแล/วิจัยผู้ป่วยปากแหว่ง เพดานโหว่ และความพิการแต่กำเนิดของศีรษะและใบหน้า มหาวิทยาลัยขอนแก่น  ภายใต้โครงการตะวันฉาย (ศูนย์ตะวันฉาย) " +
                "" +
                " \n  \n  "  +  " \t  "   +  " คณะแพทยศาสตร์  มหาวิทยาล้ัยขอนแก่น "  +  " \n "   +  " \t  \t   \t  123 ถ.มิตรภาพ"
                +  " \t ต.ในเมือง อ.เมือง จ.ขอนแก่น   \n  \t  \t  \t  \t  \t  \t  40002 "
                +   "     \n   \n   \t   โทรศัพท์ : 043-366595   \n  \t  \t  \t  โทรสาร : 043-202558  "
        );


    }

}
