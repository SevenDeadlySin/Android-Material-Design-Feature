package com.raksa.materaildesigndemo.app.model;

import com.raksa.materaildesigndemo.R;

import java.util.ArrayList;

/**
 * Created by Raksa on 8/16/2017.
 */

public class NavigationDrawerItem {

    private int ImageID;
    private String Title;

    public NavigationDrawerItem(int imageID,String title){
        this.ImageID = imageID;
        this.Title = title;
    }

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public static ArrayList<NavigationDrawerItem> getDrawerItem(){

        ArrayList<NavigationDrawerItem> drawerItems = new ArrayList<>();
        drawerItems.add(new NavigationDrawerItem(R.drawable.ic_animal,"Visit The Animals"));
        drawerItems.add(new NavigationDrawerItem(R.drawable.ic_birds,"Visit The Birds"));
        drawerItems.add(new NavigationDrawerItem(R.drawable.ic_forest,"Visit The Forests"));
        drawerItems.add(new NavigationDrawerItem(R.drawable.ic_landscape,"Visit The Landscapes"));
        drawerItems.add(new NavigationDrawerItem(R.drawable.ic_ocean,"Visit The Oceans"));
        drawerItems.add(new NavigationDrawerItem(R.drawable.ic_planet,"Visit The Planets"));

        return drawerItems;
    }


}
