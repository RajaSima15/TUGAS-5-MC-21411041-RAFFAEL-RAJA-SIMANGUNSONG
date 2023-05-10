package com.example.tugas5_mc_21411041_raja;

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
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewMusicAdapter extends RecyclerView.Adapter<CardViewMusicAdapter.CardViewViewHolder> {
    private ArrayList<MusicModel> musicClub;
    Context context;

    public CardViewMusicAdapter(ArrayList<MusicModel> list, Context context) {
        this.musicClub = list;
        this.context = context;
    }


    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viwType) {
        // LayoutInflater inflater = LayoutInflater.from(context);
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_music, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        MusicModel clubModel = musicClub.get(position);

        Glide.with(holder.itemView.getContext())
                .load(clubModel.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.MusicName.setText(clubModel.getName());
        holder.MusicDetail.setText(clubModel.getDetail());
        holder.imgPhoto.setImageResource(clubModel.getPhoto());

        holder.btnSinopsis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent previewIntent = new Intent(context, PreviewActivity.class);
                previewIntent.putExtra(PreviewActivity.EXTRA_NAME, musicClub.get(holder.getAdapterPosition()).getName());
                previewIntent.putExtra(PreviewActivity.EXTRA_DETAIL, musicClub.get(holder.getAdapterPosition()).getDetail());
                previewIntent.putExtra(PreviewActivity.EXTRA_IMAGES, musicClub.get(holder.getAdapterPosition()).getPhoto());
                context.startActivity(previewIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return musicClub.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView MusicName, MusicDetail;
        Button btnSinopsis;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            MusicName = itemView.findViewById(R.id.music_item_name);
            MusicDetail = itemView.findViewById(R.id.music_item_detail);
            btnSinopsis = itemView.findViewById(R.id.btn_set_sinopsis);
        }
    }
}