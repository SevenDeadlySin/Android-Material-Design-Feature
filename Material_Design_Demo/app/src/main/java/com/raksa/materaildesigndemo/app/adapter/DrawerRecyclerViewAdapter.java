package com.raksa.materaildesigndemo.app.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raksa.materaildesigndemo.R;
import com.raksa.materaildesigndemo.app.model.NavigationDrawerItem;
import com.raksa.materaildesigndemo.app.view_holder.DrawerItemViewHolder;

import java.util.ArrayList;

/**
 * Created by Raksa on 8/16/2017.
 */

public class DrawerRecyclerViewAdapter extends RecyclerView.Adapter<DrawerItemViewHolder> {

    ArrayList<NavigationDrawerItem> data;
    LayoutInflater layoutInflater;

    public DrawerRecyclerViewAdapter(Context context, ArrayList<NavigationDrawerItem> data){
        this.data = data;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public DrawerItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view =layoutInflater.inflate(R.layout.navigation_drawer_item_card_view,parent,false);

        DrawerItemViewHolder viewHolder = new DrawerItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DrawerItemViewHolder holder, int position) {

        NavigationDrawerItem drawerItemData = data.get(position);

        holder.itemImage.setImageResource(drawerItemData.getImageID());
        holder.itemTitle.setText(drawerItemData.getTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
