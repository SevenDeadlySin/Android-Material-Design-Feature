package com.raksa.materaildesigndemo.app.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raksa.materaildesigndemo.R;
import com.raksa.materaildesigndemo.app.MainActivity;
import com.raksa.materaildesigndemo.app.model.Landscape;
import com.raksa.materaildesigndemo.app.view_holder.MyViewHolder;

import java.util.List;

/**
 * Created by Raksa on 7/29/2017.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<Landscape> mdata;
    private LayoutInflater layoutInflater;

    public MyRecyclerViewAdapter(Context context, List<Landscape> data) {
        this.mdata = data;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        MyViewHolder myViewHolder = new MyViewHolder(layoutInflater.inflate(R.layout.my_card_view,parent,false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
            final Landscape currentObject = mdata.get(position);
            holder.textViewTitle.setText(currentObject.getTitle());
            holder.textViewDescription.setText(currentObject.getDescription());
            holder.imageViewLandscape.setImageResource(currentObject.getImageID());
            holder.imageViewDelete.setImageResource(R.drawable.ic_delete_black_24dp);
            holder.imageViewMakeCopy.setImageResource(R.drawable.ic_make_copy);

        final int clickPostion = position;

        //set Click Listener
        holder.imageViewDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mdata.remove(clickPostion);
                notifyItemRemoved(clickPostion);
                notifyItemRangeChanged(clickPostion,mdata.size());
            }
        });

        holder.imageViewMakeCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    mdata.add(clickPostion,currentObject);
                    notifyItemInserted(clickPostion+1);
                    notifyItemRangeChanged(clickPostion+1,mdata.size());
                }


        });

    }

    @Override
    public void onViewAttachedToWindow(MyViewHolder holder) {
        super.onViewAttachedToWindow(holder);
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }
}
