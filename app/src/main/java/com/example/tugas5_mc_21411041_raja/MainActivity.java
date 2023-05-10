package com.example.tugas5_mc_21411041_raja;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private RecyclerView rvclub;
    private ArrayList<MusicModel> list = new ArrayList<>();

    private String title = "Daftar music";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvclub =findViewById(R.id.rv_club);
        rvclub.setHasFixedSize(true);
        list.addAll(MusicData.getListData());

        showRecyclerCardView();

    }

    private void showRecyclerCardView() {
        rvclub.setLayoutManager(new LinearLayoutManager(this));
        CardViewMusicAdapter cardViewMoviesAdapter = new CardViewMusicAdapter(list, this);
        rvclub.setAdapter(cardViewMoviesAdapter);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}