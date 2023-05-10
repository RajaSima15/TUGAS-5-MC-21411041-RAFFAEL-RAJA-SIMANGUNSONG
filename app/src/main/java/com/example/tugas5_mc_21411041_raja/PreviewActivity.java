package com.example.tugas5_mc_21411041_raja;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PreviewActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_IMAGES = "extra_images";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        ImageView MusicImgReceived = findViewById(R.id.music_imgReceived);
        TextView MusicNameReceived = findViewById(R.id.music_nameReceived);
        TextView MusicDetailReceived = findViewById(R.id.music_detailReceived);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        int img = getIntent().getIntExtra(EXTRA_IMAGES, 1);

        MusicNameReceived.setText(name);
        MusicDetailReceived.setText(detail);
        MusicImgReceived.setImageResource(img);
    }
}
