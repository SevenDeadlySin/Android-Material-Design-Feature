package com.example.raksa.differentrecyclerviewlayoutdemo.model;

import android.media.Image;

import com.example.raksa.differentrecyclerviewlayoutdemo.R;

import java.util.ArrayList;

/**
 * Created by Raksa on 7/30/2017.
 */

public class Animal {

    String Title;
    int ImageID;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }



    public static ArrayList<Animal> getData(){

        ArrayList<Animal> data = new ArrayList<>();

        int[] image = {R.drawable.ani_cat_one,R.drawable.ani_cat_two,R.drawable.ani_cat_three,R.drawable.ani_cat_four,R.drawable.ani_cat_five,
                R.drawable.ani_cat_six,R.drawable.ani_cat_seven,R.drawable.ani_deer_one,R.drawable.ani_deer_two,R.drawable.ani_deer_three,R.drawable.ani_deer_four,
                R.drawable.ani_dog_one,R.drawable.ani_dog_two,R.drawable.ani_dog_three,R.drawable.ani_dog_four,R.drawable.ani_dog_five,R.drawable.bird_parrot_one,R.drawable.bird_parrot_two,
                R.drawable.bird_parrot_three,R.drawable.bird_parrot_four,R.drawable.bird_parrot_five,R.drawable.bird_parrot_six,R.drawable.bird_parrot_seven,R.drawable.bird_parrot_eight};

        for (int i = 0;i<image.length;i++){

            Animal animal = new Animal();
            animal.setTitle("Picture "+(i+1));
            animal.setImageID(image[i]);
            data.add(animal);
        }

        return data;
    }

}
