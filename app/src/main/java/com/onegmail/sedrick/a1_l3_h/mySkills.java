package com.onegmail.sedrick.a1_l3_h;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class mySkills extends AppCompatActivity {

    private TextView txt_white,txt_black;
    private View.OnClickListener click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_black=(TextView) findViewById(R.id.txt_black);
        txt_white=(TextView) findViewById(R.id.txt_white);

        click=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.txt_black:
                        Intent intent_black=new Intent(mySkills.this,my_secret_skills.class);
                        startActivity(intent_black);
                        break;
                    case R.id.txt_white:
                        Intent intent_white=new Intent(mySkills.this,my_personal_skills.class);
                        startActivity(intent_white);
                        break;
                }
            }
        };

        txt_black.setOnClickListener(click);
        txt_white.setOnClickListener(click);
    }

}
