package com.example.recyclerviewdemo.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;
import com.example.recyclerviewdemo.RvItem;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView rv1;
    private RecyclerView.Adapter adapter1;
    private RecyclerView.LayoutManager layoutManager1;

    private ArrayList<RvItem> rvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        //setting data
        rvItems = new ArrayList<>();
        rvItems.add(new RvItem("Title 1", "Description 1"));
        rvItems.add(new RvItem("Title 2", "Description 2"));
        rvItems.add(new RvItem("Title 3", "Description 3"));
        rvItems.add(new RvItem("Title 4", "Description 4"));
        rvItems.add(new RvItem("Title 5", "Description 5"));
        rvItems.add(new RvItem("Title 6", "Description 6"));
        rvItems.add(new RvItem("Title 7", "Description 7"));
        rvItems.add(new RvItem("Title 8", "Description 8"));
        rvItems.add(new RvItem("Title 9", "Description 9"));

        //bind rv1 with the View
        rv1 = findViewById(R.id.rv1);

        //set to true if you know your recyclerView in the xml will not change in size,
        //it will increase performance
        rv1.setHasFixedSize(true);

        //create adapter with the data
        adapter1 = new RvAdapter(rvItems);

        // use a linear layout manager (will arrange our view one by one)
        layoutManager1 = new LinearLayoutManager(this);

        //set layout manager and adapter
        rv1.setLayoutManager(layoutManager1);
        rv1.setAdapter(adapter1);

    }
}
