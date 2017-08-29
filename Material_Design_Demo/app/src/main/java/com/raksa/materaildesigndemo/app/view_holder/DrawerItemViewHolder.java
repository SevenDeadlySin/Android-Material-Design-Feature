package com.raksa.materaildesigndemo.app.view_holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.raksa.materaildesigndemo.R;

/**
 * Created by Raksa on 8/16/2017.
 */

public class DrawerItemViewHolder extends RecyclerView.ViewHolder {

    public ImageView itemImage;
    public TextView itemTitle;

    public DrawerItemViewHolder(View itemView) {
        super(itemView);

        itemImage = (ImageView) itemView.findViewById(R.id.imageViewListItemImage);
        itemTitle  = (TextView) itemView.findViewById(R.id.textViewListItemTitle);

    }
}
