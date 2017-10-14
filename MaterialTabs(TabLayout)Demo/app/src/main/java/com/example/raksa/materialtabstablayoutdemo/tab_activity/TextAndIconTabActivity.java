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

public class TextAndIconTabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_and_icon_tab);

        //set up ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Text And Icon Tabs Demo");


        //region get View Reference
        TabLayout tabLayout = (TabLayout) findViewById(R.id.iconAndTextTabLayout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.iconAndTextViewPager);
        //endregion

        //region set up ViewPager
        ////define FragmentManager for Adapter
        FragmentManager fragmentManager = getSupportFragmentManager();

        ////define adapter for ViewPager
        MyCustomAdapter adapter = new MyCustomAdapter(fragmentManager, MyData.getFragmentList(), MyData.getTitleList());

        ////set adapter for ViewPager
        viewPager.setAdapter(adapter);
        //endregion

        //region set up TabLayout
        ////bind TabLayout with ViewPager
        tabLayout.setupWithViewPager(viewPager);

        ////set icon for Tab
        tabLayout.getTabAt(0).setIcon(R.drawable.apple);
        tabLayout.getTabAt(1).setIcon(R.drawable.pine_tree);
        tabLayout.getTabAt(2).setIcon(R.drawable.rain);
        tabLayout.getTabAt(3).setIcon(R.drawable.snail);
        tabLayout.getTabAt(4).setIcon(R.drawable.wind);
        //endregion

    }
}
