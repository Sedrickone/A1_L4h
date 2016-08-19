package com.onegmail.sedrick.a1_l3_h;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class my_secret_skills extends AppCompatActivity {

    String []skills_ninja;
    TextView txt_night;
    String temp="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.at_night);

        Resources res=getResources();

        txt_night=(TextView)findViewById(R.id.txt_skills_ninja);
        skills_ninja=res.getStringArray(R.array.array_skills_ninja);

        for (int i = 0; i <skills_ninja.length ; i++) {
            temp=temp+skills_ninja[i]+'\n';}
        txt_night.setText(temp);temp="";



    }

}
