package com.raksa.materaildesigndemo;


import android.app.Activity;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;



//change from AppCompat_Activity to Activity to support material Desgin theme
public class MainActivity extends AppCompatActivity{

    Toolbar myToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToolbar = (Toolbar) findViewById(R.id.myToolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("Welcome");
        myToolbar.setSubtitle("Material Design");
        myToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);




        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){


        }
        else {

            }

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
}


