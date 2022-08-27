package com.example.recyclerview_numbers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> numbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        initData();
        NumbersAdapter adapter = new NumbersAdapter(numbers);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        numbers = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            numbers.add("Number " + i);
        }
    }
}