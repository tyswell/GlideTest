package com.tys.glidetest.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.tys.glidetest.R;
import com.tys.glidetest.model.Movie;

import java.util.List;

/**
 * Created by deksen on 5/7/16 AD.
 */
public class MoviesAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<Movie> movies;
    private Context context;

    public MoviesAdapter(Context context, List<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Movie movie = movies.get(position);

        holder.name.setText(movie.getName());
        holder.year.setText(movie.getTimestamp());

        byte[] a = null;

        Glide.with(context).load(movie.getSmall())
                .crossFade()
                .thumbnail(0.5f)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.thumbnail);

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
