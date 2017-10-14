package com.example.raksa.pageviewerdemo.model;

import com.example.raksa.pageviewerdemo.R;

import java.util.ArrayList;

/**
 * Created by Raksa on 9/27/2017.
 */

public class Player {

    String name;
    int imageID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }


    public Player(String name , int imageID){
        this.name = name;
        this.imageID = imageID;
    }


    public static ArrayList<Player> getData(){

        ArrayList<Player> data = new ArrayList<>();
        data.add(new Player("Kuroko", R.drawable.kuroko));
        data.add(new Player("Aomine", R.drawable.aomine));
        data.add(new Player("Akashi", R.drawable.akashi));
        data.add(new Player("Kise",R.drawable.kise));
        data.add(new Player("Midorima",R.drawable.midorima));
        data.add(new Player("Murasakibara",R.drawable.murasakibara));

        return data;

    }

}
