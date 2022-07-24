package com.example.kg_cai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kg_cai.helpers.MyServiceMusic;

public class MainSoundsActivity extends AppCompatActivity {

    RelativeLayout color, number, alphabet, week, shape;
    Button btnSoundsMiniGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sounds_main);

        color = findViewById(R.id.color);
        number = findViewById(R.id.number);
        alphabet = findViewById(R.id.alphabet);
        week = findViewById(R.id.week);
        shape = findViewById(R.id.shape);
        btnSoundsMiniGame = findViewById(R.id.btnSoundsMiniGame);

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //service for background music use to start
                Intent musicServiceIntent = new Intent(getApplicationContext(), MyServiceMusic.class);
                stopService(new Intent(getApplicationContext(), MyServiceMusic.class));
                startActivity(new Intent(MainSoundsActivity.this, ColorsActivity.class));
            }
        });

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //service for background music use to start
                Intent musicServiceIntent = new Intent(getApplicationContext(), MyServiceMusic.class);
                stopService(new Intent(getApplicationContext(), MyServiceMusic.class));
                startActivity(new Intent(MainSoundsActivity.this, NumbersActivity.class));
            }
        });

        alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //service for background music use to start
                Intent musicServiceIntent = new Intent(getApplicationContext(), MyServiceMusic.class);
                stopService(new Intent(getApplicationContext(), MyServiceMusic.class));
                startActivity(new Intent(MainSoundsActivity.this, AlphabetActivity.class));
            }
        });

        week.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //service for background music use to start
                Intent musicServiceIntent = new Intent(getApplicationContext(), MyServiceMusic.class);
                stopService(new Intent(getApplicationContext(), MyServiceMusic.class));
                startActivity(new Intent(MainSoundsActivity.this, WeekActivity.class));
            }
        });

        shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //service for background music use to start
                Intent musicServiceIntent = new Intent(getApplicationContext(), MyServiceMusic.class);
                stopService(new Intent(getApplicationContext(), MyServiceMusic.class));
                startActivity(new Intent(MainSoundsActivity.this, ShapesActivity.class));
            }
        });

        btnSoundsMiniGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainSoundsActivity.this, TextRecognition.class));
            }
        });
    }
    @Override
    public void onBackPressed() {
        MainSoundsActivity.this.finish();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

}