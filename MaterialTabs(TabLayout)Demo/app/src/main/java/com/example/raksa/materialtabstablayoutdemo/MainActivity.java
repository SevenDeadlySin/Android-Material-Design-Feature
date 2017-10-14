package com.example.raksa.materialtabstablayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.raksa.materialtabstablayoutdemo.tab_activity.CustomActivity;
import com.example.raksa.materialtabstablayoutdemo.tab_activity.IconTabActivity;
import com.example.raksa.materialtabstablayoutdemo.tab_activity.TextAndIconTabActivity;
import com.example.raksa.materialtabstablayoutdemo.tab_activity.TextTabActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonText , buttonIcon , buttonTextAndIcon , buttonCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonText = (Button) findViewById(R.id.buttonText);
        buttonIcon = (Button) findViewById(R.id.buttonIcon);
        buttonTextAndIcon = (Button) findViewById(R.id.buttonTextIcon);
        buttonCustom = (Button) findViewById(R.id.buttonCustom);


        buttonText.setOnClickListener(this);
        buttonIcon.setOnClickListener(this);
        buttonTextAndIcon.setOnClickListener(this);
        buttonCustom.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonText:
                //start activity
                Intent startTextActivityIntent = new Intent(this,TextTabActivity.class);
                startActivity(startTextActivityIntent);
                break;
            case R.id.buttonIcon:
                //start activity
                Intent startIconActivityIntent = new Intent(this,IconTabActivity.class);
                startActivity(startIconActivityIntent);
                break;
            case R.id.buttonTextIcon:
                //start activity
                Intent startTextAndIconActivityIntent = new Intent(this,TextAndIconTabActivity.class);
                startActivity(startTextAndIconActivityIntent);
                break;
            case R.id.buttonCustom:
                //start activity
                Intent startCustomActivityIntent = new Intent(this,CustomActivity.class);
                startActivity(startCustomActivityIntent);
                break;
            default:
                break;
        }
    }
}
