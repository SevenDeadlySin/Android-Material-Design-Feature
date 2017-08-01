package com.example.raksa.differentrecyclerviewlayoutdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.raksa.differentrecyclerviewlayoutdemo.R;
import com.example.raksa.differentrecyclerviewlayoutdemo.adapter.viewHolder.MyViewHolder;
import com.example.raksa.differentrecyclerviewlayoutdemo.model.Animal;

import java.util.ArrayList;

/**
 * Created by Raksa on 8/1/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    LayoutInflater layoutInflater;
    ArrayList<Animal> data;

    public MyAdapter(Context context, ArrayList<Animal> data){
        layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        MyViewHolder myViewHolder = new MyViewHolder(layoutInflater.inflate(R.layout.card_view,parent,false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Animal animal = data.get(position);
        holder.title.setText(animal.getTitle());
        holder.image.setImageResource(animal.getImageID());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
