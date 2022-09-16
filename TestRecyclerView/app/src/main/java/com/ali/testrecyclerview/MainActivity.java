package com.ali.testrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RVAdapter rvAdapter;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.rvListItems)

;

        layoutManager = new GridLayoutManager(t        layoutManager = new GridLayoutManager(this,2);
his,2);
        recyclerView.setLayoutManager(layoutManager);

        rvAdapter = new RVAdapter();
        rvAdapter.todoItemList.add(new TodoItem("Item 1","Description 1", false));
        rvAdapter.todoItemList.add(new TodoItem("Item 2","Description 2", false));
        rvAdapter.todoItemList.add(new TodoItem("Item 3","Description 3", false));
        rvAdapter.todoItemList.add(new TodoItem("Item 4","Description 4", true));

        recyclerView.setAdapter(rvAdapter);



        recyclerView = findViewById(R.id.rvListItems);

        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);

        rvAdapter = new RVAdapter();
        rvAdapter.todoItemList.add(new TodoItem("Item 1","Description 1", false));
        rvAdapter.todoItemList.add(new TodoItem("Item 2","Description 2", false));
        rvAdapter.todoItemList.add(new TodoItem("Item 3","Description 3", false));
        rvAdapter.todoItemList.add(new TodoItem("Item 4","Description 4", true));

        recyclerView.setAdapter(rvAdapter);

    }
}