package com.raksa.materaildesigndemo.app.view_holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.raksa.materaildesigndemo.R;

/**
 * Created by Raksa on 7/29/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView textViewTitle;
    public TextView textViewDescription;
    public ImageView imageViewLandscape;
    public ImageView imageViewDelete;
    public ImageView imageViewMakeCopy;


    public MyViewHolder(View itemView) {
        super(itemView);

        textViewTitle = (TextView) itemView.findViewById(R.id.textViewTitle);
        textViewDescription = (TextView) itemView.findViewById(R.id.textViewDescription);
        imageViewLandscape = (ImageView) itemView.findViewById(R.id.imageViewLanscape);
        imageViewDelete = (ImageView) itemView.findViewById(R.id.imageViewDelete);
        imageViewMakeCopy = (ImageView) itemView.findViewById(R.id.imageViewMakeCopy);

    }

}
