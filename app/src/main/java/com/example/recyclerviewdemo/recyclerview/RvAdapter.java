package com.example.recyclerviewdemo.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;
import com.example.recyclerviewdemo.RvItem;

import java.util.ArrayList;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.MyViewHolder> {

    private ArrayList<RvItem> itemList;

    //constructor
    public RvAdapter(ArrayList<RvItem> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //get layout of the recyclerView item
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_recyclerview_item, parent, false);

        //create view holder, pass the view into the view holder and return it
        MyViewHolder viewHolder = new MyViewHolder(v);

        return viewHolder;
    }

    //to pass value into view
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //getting the recycler view of the current position
        RvItem currentItem = itemList.get(position);

        //bind the data into the view
        holder.tvTitle.setText(currentItem.getTitle());
        holder.tvDesc.setText(currentItem.getDesc());
    }

    //return the size of the arraylist
    @Override
    public int getItemCount() {
        return itemList.size();
    }

    //bind view here
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitle;
        public TextView tvDesc;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDesc = itemView.findViewById(R.id.tv_desc);
        }
    }

}
