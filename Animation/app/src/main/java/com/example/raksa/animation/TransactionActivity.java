package com.example.raksa.animation;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.TextView;

public class TransactionActivity extends AppCompatActivity {

    TextView textViewText;
    TextView textViewTitle;
    Button buttonExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){

            Animation.AnimationType type = (Animation.AnimationType) getIntent().getSerializableExtra(Animation.TYPE);
            String title = getIntent().getStringExtra(Animation.TITLE);
            String option = getIntent().getStringExtra(Animation.OPTION);

            textViewText = (TextView) findViewById(R.id.textView7);
            textViewTitle = (TextView) findViewById(R.id.textViewTransactionName);

            buttonExit = (Button) findViewById(R.id.buttonExit);
            buttonExit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });



            switch (type){
                case ExplodeByJava:
                    Explode explodeTransition = new Explode();
                    explodeTransition.setDuration(400);
                    getWindow().setEnterTransition(explodeTransition);
                    break;

                case ExplodeByXML:

                    Transition explodeTransitionXML = TransitionInflater.from(this).inflateTransition(R.transition.explode);
                    getWindow().setEnterTransition(explodeTransitionXML);

                    break;

                case SlideByJava:
                    Slide slideTransition = new Slide();
                    slideTransition.setDuration(800);
                    slideTransition.setSlideEdge(Gravity.START);
                    slideTransition.setInterpolator(new OvershootInterpolator());
                    getWindow().setEnterTransition(slideTransition);

                    break;

                case FadeByJava:
                    Fade fadeTransition = new Fade();
                    fadeTransition.setDuration(400);
                    getWindow().setEnterTransition(fadeTransition);
                    break;

                default:
                    break;
            }

            textViewText.setText(option);
            textViewTitle.setText(title);

        }


    }
}
