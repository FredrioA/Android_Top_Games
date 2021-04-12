package com.example.topgames;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class GameInfo extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preview_game);
        getIncomingIntent();
    }

    private void getIncomingIntent() {
        if (getIntent().hasExtra("logo") && getIntent().hasExtra("title") && getIntent().hasExtra("detail")){
            int logoGame = getIntent().getIntExtra("logo", 0);
            String titleGame = getIntent().getStringExtra("title");
            String detailGame = getIntent().getStringExtra("detail");

            setDataActivity(logoGame, titleGame, detailGame);
        }
    }

    private void setDataActivity(int logoGame, String titleGame, String detailGame) {
        ImageView inLogo = findViewById(R.id.big_logo);
        TextView inTitle = findViewById(R.id.det_title);
        TextView inDetail = findViewById(R.id.det_info);

        Glide.with(this).asBitmap().load(logoGame).into(inLogo);
        inTitle.setText(titleGame);
        inDetail.setText(detailGame);
    }
}
