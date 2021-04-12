package com.example.topgames;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvGame;
    private final ArrayList<GameModel> listGame = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGame = findViewById(R.id.list_game);
        rvGame.setHasFixedSize(true);
        listGame.addAll(GameData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvGame.setLayoutManager(new LinearLayoutManager(this));
        GameAdapter gameAdapter = new GameAdapter(this);
        gameAdapter.setGameModels(listGame);
        rvGame.setAdapter(gameAdapter);
    }
}