package com.ali.testrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MyViewHolder> {


    public List<TodoItem> todoItemList = new ArrayList<>();
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vhlayoutitem,parent,false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvTitle.setText(todoItemList.get(position).Title);
        holder.tvDesc.setText(todoItemList.get(position).Description);
        holder.swStatus.setChecked(todoItemList.get(position).Status);
    }

    @Override
    public int getItemCount() {
        return todoItemList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvTitle;
        TextView tvDesc;
        Switch swStatus;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDesc = itemView.findViewById(R.id.tvDesc);
            swStatus = itemView.findViewById(R.id.swDone);
        }
    }

}
