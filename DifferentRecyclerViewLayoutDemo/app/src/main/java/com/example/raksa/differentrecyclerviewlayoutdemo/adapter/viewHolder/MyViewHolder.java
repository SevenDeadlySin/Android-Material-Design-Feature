package com.example.raksa.differentrecyclerviewlayoutdemo.adapter.viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.raksa.differentrecyclerviewlayoutdemo.R;

/**
 * Created by Raksa on 8/1/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public ImageView image;

    public MyViewHolder(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.textViewTitle);
        image = (ImageView) itemView.findViewById(R.id.imageViewPicture);
    }
}
