package com.onegmail.sedrick.a1_l3_h;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void showPopup(View view) {
        PopupMenu popupMenu=new PopupMenu(this,view);
        popupMenu.inflate(R.menu.menu_popup);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_item_age:
                        DialogFragment dialogFragment= new DataPickFragment();
                        dialogFragment.show(getSupportFragmentManager(),"DATA_PICKER");
                        break;
                    case R.id.menu_item_skills:
                        Intent intent=new Intent(MainActivity.this,mySkills.class);
                        startActivity(intent);
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }
}
