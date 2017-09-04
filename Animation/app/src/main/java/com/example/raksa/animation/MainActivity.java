package com.example.raksa.animation;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button explodeByJavaButton , explodeByXMLButton , slideByJavaButton , slideByXMLButton,
    fadeByJavaButton , fadeByXMLButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explodeByJavaButton = (Button) findViewById(R.id.button);
        explodeByXMLButton = (Button) findViewById(R.id.button2);
        slideByJavaButton = (Button) findViewById(R.id.button3);
        slideByXMLButton = (Button) findViewById(R.id.button4);
        fadeByJavaButton = (Button) findViewById(R.id.button5);
        fadeByXMLButton = (Button) findViewById(R.id.button6);



        explodeByJavaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                    Intent intentTransition = new Intent(MainActivity.this,TransactionActivity.class);
                    intentTransition.putExtra(Animation.TYPE, Animation.AnimationType.ExplodeByJava);
                    intentTransition.putExtra(Animation.TITLE,"Explode Animation");
                    intentTransition.putExtra(Animation.OPTION,"Explode By Java");
                    startActivity(intentTransition,activityOptions.toBundle());

                }
            }
        });

        explodeByXMLButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                    Intent intentTransition = new Intent(MainActivity.this,TransactionActivity.class);
                    intentTransition.putExtra(Animation.TYPE, Animation.AnimationType.ExplodeByXML);
                    intentTransition.putExtra(Animation.TITLE,"Explode Animation");
                    intentTransition.putExtra(Animation.OPTION,"Explode By XML");
                    startActivity(intentTransition,activityOptions.toBundle());

                }

            }
        });

        slideByJavaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                    Intent intentTransition = new Intent(MainActivity.this,TransactionActivity.class);
                    intentTransition.putExtra(Animation.TYPE,Animation.AnimationType.SlideByJava);
                    intentTransition.putExtra(Animation.TITLE,"Slide Animation");
                    intentTransition.putExtra(Animation.OPTION,"Slide By Java");
                    startActivity(intentTransition,activityOptions.toBundle());
                }
            }
        });

        fadeByJavaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                    Intent intentTransition = new Intent(MainActivity.this,TransactionActivity.class);
                    intentTransition.putExtra(Animation.TYPE, Animation.AnimationType.FadeByJava);
                    intentTransition.putExtra(Animation.TITLE,"Fade Animation");
                    intentTransition.putExtra(Animation.OPTION,"Fade By Java");
                    startActivity(intentTransition,options.toBundle());
                }

            }
        });


    }
}
