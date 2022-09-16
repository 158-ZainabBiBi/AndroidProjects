package com.example.hometask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ToDoItem> toDoItemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toDoItemList.add(new ToDoItem(1, "ItemA", "Some Text Here...", false));
        toDoItemList.add(new ToDoItem(2, "ItemB", "Some Text Here...", false));
        toDoItemList.add(new ToDoItem(3, "ItemC", "Some Text Here...", false));
        toDoItemList.add(new ToDoItem(4, "ItemD", "Some Text Here...", false));


        ListView listView = findViewById(R.id.listview);
        ToDoItemAdaptor adapter = new ToDoItemAdaptor();
        adapter.list = toDoItemList;
        listView.setAdapter(adapter);
    }
}