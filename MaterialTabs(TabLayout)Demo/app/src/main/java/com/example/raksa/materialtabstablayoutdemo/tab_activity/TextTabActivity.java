package com.example.raksa.materialtabstablayoutdemo.tab_activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.raksa.materialtabstablayoutdemo.R;
import com.example.raksa.materialtabstablayoutdemo.adapter.MyCustomAdapter;
import com.example.raksa.materialtabstablayoutdemo.data.MyData;

public class TextTabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tab);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Tab Layout with Text");

        //interrection with View
        ViewPager viewPager = (ViewPager) findViewById(R.id.textViewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);


        //define FragmentManager for Adapter
        FragmentManager fragmentManager = getSupportFragmentManager();

        //define Adapter for ViewPager
        MyCustomAdapter adapter = new MyCustomAdapter(fragmentManager, MyData.getFragmentList(),MyData.getTitleList());
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);


    }


}
