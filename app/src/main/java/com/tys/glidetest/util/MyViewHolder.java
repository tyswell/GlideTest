package com.tys.glidetest.util;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tys.glidetest.R;

/**
 * Created by deksen on 5/7/16 AD.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    public ImageView thumbnail;
    public TextView name;
    public TextView year;

    public MyViewHolder(View v) {
        super(v);
        thumbnail = (ImageView) v.findViewById(R.id.thumbnail);
        name = (TextView) v.findViewById(R.id.name);
        year = (TextView) v.findViewById(R.id.year);
    }

}
