package com.example.raksa.materialtabstablayoutdemo.tab_activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.example.raksa.materialtabstablayoutdemo.R;
import com.example.raksa.materialtabstablayoutdemo.adapter.MyCustomAdapter;
import com.example.raksa.materialtabstablayoutdemo.data.MyData;

public class IconTabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_tab);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Icon with TabLayout");

        TabLayout tabLayout = (TabLayout) findViewById(R.id.iconTabLayout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.iconViewPager);

        //FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        //define adapter
        MyCustomAdapter adapter = new MyCustomAdapter(fragmentManager, MyData.getFragmentList(),MyData.getTitleList());

        //set adapter for viewpager
        viewPager.setAdapter(adapter);


        //bind ViewPager with TabLayout
        tabLayout.setupWithViewPager(viewPager);


        //config tablayout for icon tab

            //set text for each tab...
        tabLayout.getTabAt(0).setText("");
        tabLayout.getTabAt(1).setText("");
        tabLayout.getTabAt(2).setText("");
        tabLayout.getTabAt(3).setText("");
        tabLayout.getTabAt(4).setText("");

            //set icon for each tab...
        tabLayout.getTabAt(0).setIcon(R.drawable.apple);
        tabLayout.getTabAt(1).setIcon(R.drawable.pine_tree);
        tabLayout.getTabAt(2).setIcon(R.drawable.rain);
        tabLayout.getTabAt(3).setIcon(R.drawable.snail);
        tabLayout.getTabAt(4).setIcon(R.drawable.wind);




    }
}
