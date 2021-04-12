package com.example.topgames;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder> {

    private final Context context;
    private ArrayList<GameModel> gameModels;

    public GameAdapter(Context context){
        this.context = context;
    }

    public ArrayList<GameModel> getGameModels(){
        return gameModels;
    }

    public void setGameModels(ArrayList<GameModel> gameModels){
        this.gameModels = gameModels;
    }

    @NonNull
    @Override
    public GameAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.info_game,
                viewGroup, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Glide.with(context).load(getGameModels().get(i).getGambarGame()).into(viewHolder.picGame);
        viewHolder.namaGame.setText(getGameModels().get(i).getNamaGame());
        viewHolder.share.setOnClickListener(v -> {
            Intent intent = new Intent (Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, getGameModels().get(i).getPreview());
            intent.setType("text/plain");
            context.startActivity(Intent.createChooser(intent, "Send To"));
        });

        viewHolder.visit.setOnClickListener(v -> {
            Intent intent = new Intent (context, GameInfo.class);
            intent.putExtra("logo", getGameModels().get(i).getGambarGame());
            intent.putExtra("title", getGameModels().get(i).getNamaGame());
            intent.putExtra("detail", getGameModels().get(i).getPreview());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return getGameModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView picGame;
        private TextView namaGame;
        private Button share;
        private Button visit;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            picGame = itemView.findViewById(R.id.logo);
            namaGame = itemView.findViewById(R.id.title_game);
            share = itemView.findViewById(R.id.btn_share);
            visit = itemView.findViewById(R.id.btn_detail);
        }
    }
}



