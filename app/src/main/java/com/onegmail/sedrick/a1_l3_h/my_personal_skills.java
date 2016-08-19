package com.onegmail.sedrick.a1_l3_h;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class my_personal_skills extends AppCompatActivity {

    private String []skills;
    private String []skills_it;
    private TextView txt_in_life;
    private Button btn_at_work,btn_in_life;
    private String temp="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_life);

        Resources res=getResources();

        skills=res.getStringArray(R.array.array_my_skills);
        skills_it=res.getStringArray(R.array.array_skills_in_IT);

        btn_at_work=(Button)findViewById(R.id.btn_at_work);
        btn_in_life=(Button)findViewById(R.id.btn_in_life);

        txt_in_life=(TextView) findViewById(R.id.txt_skills_in_life);

        View.OnClickListener set_text=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){

                    case R.id.btn_at_work:
                        for (int i = 0; i <skills.length ; i++) {
                        temp=temp+'*'+skills[i]+'\n';}
                        txt_in_life.setText(temp);temp="";
                        break;

                    case R.id.btn_in_life:
                        for (int i = 0; i <skills_it.length ; i++) {
                        temp=temp+skills_it[i]+'\n';}
                        txt_in_life.setText(temp);temp="";
                        break;
                }
            }
        };

        btn_in_life.setOnClickListener(set_text);
        btn_at_work.setOnClickListener(set_text);
    }
}
