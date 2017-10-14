package com.example.raksa.pageviewerdemo.page_adapter;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.raksa.pageviewerdemo.R;
import com.example.raksa.pageviewerdemo.model.Player;

import java.util.ArrayList;

/**
 * Created by Raksa on 9/27/2017.
 */

public class MyPageAdapter extends PagerAdapter {


    ArrayList<Player> data;
    LayoutInflater inflater;

    //Constructor
    public MyPageAdapter(Context context,ArrayList<Player> data){
        this.inflater = LayoutInflater.from(context);
        this.data = data;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = inflater.inflate(R.layout.view_pager_item,container,false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView textView = (TextView) view.findViewById(R.id.textViewPlayerName);

        //set data to the view
        //get data
        Player player = data.get(position);
        imageView.setImageResource(player.getImageID());
        textView.setText(player.getName());

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
            //remove unused view
        container.removeView((ConstraintLayout)object);
    }
}
