package com.example.materialme_v5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private TextView sportsTitle;
    private ImageView bannerImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        sportsTitle = findViewById(R.id.titleDetail);
        bannerImage = findViewById(R.id.sportsImageDetail);

        Intent intent = getIntent();
        String titlePassed = intent.getStringExtra("title");
        //int i = getIntent().getIntExtra("image",0);
        //int imagePassed = intent.getIntExtra("image");

        sportsTitle.setText(titlePassed);
        //Use Glide to load the image into the ImageView:
        Glide.with(this).load(getIntent().getIntExtra("image",0)).into(bannerImage);
    }
}
