package com.raksa.materaildesigndemo;


import android.app.Activity;

import android.os.Build;
import android.os.Bundle;




//change from AppCompat_Activity to Activity to support material Desgin theme
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){

        }
        else {

        }


    }
}
