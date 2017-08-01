package com.example.raksa.differentrecyclerviewlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.raksa.differentrecyclerviewlayoutdemo.adapter.MyAdapter;
import com.example.raksa.differentrecyclerviewlayoutdemo.model.Animal;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    //Layout
    LinearLayoutManager linarLayout;
    GridLayoutManager gridLayout;
    StaggeredGridLayoutManager staggeredGridLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Linar Layout Demo");


        //RecyclerView
        recyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);
        //define Layout for recyclerView
        //linar
        linarLayout = new LinearLayoutManager(this);
        linarLayout.setOrientation(LinearLayoutManager.VERTICAL);
        //Grid
        gridLayout = new GridLayoutManager(this,2,LinearLayoutManager.VERTICAL,false);

        //Stagger Grid
        staggeredGridLayout = new StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL);

        //set Layout for RecyclerView
        recyclerView.setLayoutManager(linarLayout);

        //set Data for RecyclerView
        myAdapter = new MyAdapter(this, Animal.getData());
        recyclerView.setAdapter(myAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.actionLinarLayout:
                getSupportActionBar().setTitle("Linar Layout Demo");
                //change layout for recyclerView

                //set Layout for recyclerView
                recyclerView.setLayoutManager(linarLayout);


                break;
            case R.id.actionGridLayout:
                getSupportActionBar().setTitle("Grid Layout Demo");

                //set Layout for recyclerView
                recyclerView.setLayoutManager(gridLayout);


                break;
            case R.id.actionStaggedGrid:
                getSupportActionBar().setTitle("Stagged Grid Demo");

                //set Layout for recyclerView
                recyclerView.setLayoutManager(staggeredGridLayout);


                break;

        }
        return super.onOptionsItemSelected(item);

    }
}
