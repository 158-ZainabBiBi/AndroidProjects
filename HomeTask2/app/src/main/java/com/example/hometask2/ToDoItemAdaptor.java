package com.example.hometask2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ToDoItemAdaptor extends BaseAdapter {
    public List<com.example.hometask2.ToDoItem> list;


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        com.example.hometask2.ToDoItem item = list.get(position);
        return item.getID();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        com.example.hometask2.ToDoItem item = list.get(position);

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.todoitem_layout, parent, false);
        ((TextView) view.findViewById(R.id.txtDescription)).setText(item.getTitle());
        ((TextView) view.findViewById(R.id.txtTitle)).setText(item.getDescription());
        return view;
    }
}
