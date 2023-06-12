package com.example.animeplayerproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {

    ImageView fullmetal;
    ImageView assassination;
    ImageView bleach;
    ImageView horimiya;
    ImageView wotakoi;
    ImageView onepiece;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        fullmetal = findViewById(R.id.alchemy);
        assassination = findViewById(R.id.assassination);
        bleach = findViewById(R.id.bleach);
        horimiya = findViewById(R.id.horimiya);
        wotakoi = findViewById(R.id.wotakoi);
        onepiece = findViewById(R.id.onepiece);

        fullmetal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl( "https://zoro.to/fullmetal-alchemist-308?ref=search");
            }
        });

        assassination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://zoro.to/assassination-classroom-372?ref=search");
            }
        });

        bleach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://zoro.to/bleach-thousand-year-blood-war-arc-15665?ref=search");
            }
        });

        horimiya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://zoro.to/horimiya-15733?ref=search");
            }
        });

        wotakoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://zoro.to/wotakoi-love-is-hard-for-otaku-556?ref=search");
            }
        });

        onepiece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://zoro.to/one-piece-100?ref=search");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}