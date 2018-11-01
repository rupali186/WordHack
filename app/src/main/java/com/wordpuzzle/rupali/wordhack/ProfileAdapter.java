package com.wordpuzzle.rupali.wordhack;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {
    Context context;
    ArrayList<Integer> imageIds;
    OnItemClickListener listener;

    public ProfileAdapter(Context context, ArrayList<Integer> imageIds, OnItemClickListener listener) {
        this.context = context;
        this.imageIds = imageIds;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.profile_recycler_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        int imageId=imageIds.get(position);
        holder.profile.setImageResource(imageId);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return imageIds.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        View itemView;
        ImageView profile;

        public ViewHolder(View itemView) {
            super(itemView);
            this.itemView=itemView;
            profile=itemView.findViewById(R.id.profile_image);
        }
    }
    interface OnItemClickListener{
        void onItemClick(int position);
    }
}
