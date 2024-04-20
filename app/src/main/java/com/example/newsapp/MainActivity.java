package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CategoryRVAdapter.CategoryClickInterface {

    //e35908d6144a427696a6abc54e81a7ce
    private RecyclerView newsRV, categoryRV;
    private ProgressBar loadingPB;
    private ArrayList<Articles> articlesArrayList;
    private ArrayList<CategoryRVModel> categoryRVModelArrayList;
    private CategoryRVAdapter categoryRVAdapter;
    private NewsRVAdapter newsRVAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsRV = findViewById(R.id.idRVNews);
        categoryRV = findViewById(R.id.idRVCategories);
        loadingPB = findViewById(R.id.idPBLoading);
        articlesArrayList = new ArrayList<>();
        categoryRVModelArrayList = new ArrayList<>();
        newsRVAdapter = new NewsRVAdapter();
        categoryRVAdapter = new CategoryRVAdapter(categoryRVModelArrayList, this, this::onCategoryClick);

    }

    @Override
    public void onCategoryClick(int position) {

    }
}