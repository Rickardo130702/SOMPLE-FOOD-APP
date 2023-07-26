package com.example.uas_mobile_programing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FavoriteActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite);

        RelativeLayout relativeLayout = findViewById(R.id.rlBurjoBorneo2);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FavoriteActivity.this, BurjoBorneoActivity.class);
                startActivity(intent);
            }
        });

    }

}