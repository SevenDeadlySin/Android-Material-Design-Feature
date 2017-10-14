package com.example.raksa.pageviewerdemo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.raksa.pageviewerdemo.model.Player;
import com.example.raksa.pageviewerdemo.page_adapter.MyPageAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        //Pager Adapter
        MyPageAdapter adapter = new MyPageAdapter(this, Player.getData());

        viewPager.setAdapter(adapter);


    }
}
