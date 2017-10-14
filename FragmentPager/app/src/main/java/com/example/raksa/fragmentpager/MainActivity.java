package com.example.raksa.fragmentpager;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.raksa.fragmentpager.fragmentPagerAdapter.MyCustomAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.myViewPager);

        //adapter

        FragmentManager fragmentManager = getSupportFragmentManager();

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(fragmentManager);
        viewPager.setAdapter(myCustomAdapter);

    }
}
