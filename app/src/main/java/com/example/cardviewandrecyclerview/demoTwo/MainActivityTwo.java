package com.example.cardviewandrecyclerview.demoTwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardviewandrecyclerview.R;

public class MainActivityTwo extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] names = {"Ayan", "Sayan", "Ujjal", "shouvik", "Sovan", "Liars", "Donadoni"};
    int[] images = {R.drawable.baseline_person_24, R.drawable.baseline_person_24, R.drawable.baseline_person_24, R.drawable.baseline_person_24, R.drawable.baseline_person_24, R.drawable.baseline_person_24, R.drawable.baseline_person_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        MyAdapter myAdapter = new MyAdapter(images, names);

        //way 1
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(myAdapter);

        //way 2-(insta story section)

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        //linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        recyclerView.setAdapter(myAdapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(myAdapter);


    }
}