package com.raksa.materaildesigndemo.app;


import android.app.Activity;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;

import com.raksa.materaildesigndemo.R;
import com.raksa.materaildesigndemo.app.adapter.MyRecyclerViewAdapter;
import com.raksa.materaildesigndemo.app.model.Landscape;


//change from AppCompat_Activity to Activity to support material Desgin theme
public class MainActivity extends AppCompatActivity{

    Toolbar myToolbar;
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToolbar = (Toolbar) findViewById(R.id.myToolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("Welcome");
        myToolbar.setSubtitle("Material Design");
        myToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);


        mRecyclerView = (RecyclerView) findViewById(R.id.myRecycleView);

        MyRecyclerViewAdapter mAdater = new MyRecyclerViewAdapter(this, Landscape.getData());
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdater);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    private void settingUpRecycleView(){

    }
}


